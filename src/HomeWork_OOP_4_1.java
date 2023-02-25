public class MyTasks extends HomeWork_OOP_4_1 {
    @Override
    public void run() {
        System.out.println("Hello from scheduled task!");
    }
}
public class TimerContextListener implements ServletContextListener {
    public void contextInitialized(ServletContextEvent sce) {
        ServletContext servletContext = sce.getServletContext();
        try {
            Timer timer = new Timer();
            MyTasks task = new MyTasks();
            Date startTime = new GregorianCalendar(2011, 1, 1, 8, 0, 0).getTime();
            timer.scheduleAtFixedRate(task, startTime, 1000 * 60 * 60 * 24);
            servletContext.setAttribute("timer", timer);
        } catch (Exception e) {
            servletContext.log("Problem initializing the task that was to run daily: " + e.getMessage());
        }
    }
    public void contextDestroyed(ServletContextEvent sce) {
        ServletContext servletContext = sce.getServletContext();
        Timer timer = (Timer) servletContext.getAttribute("timer");
        if (timer != null) {
            timer.cancel();
        }
        servletContext.removeAttribute("timer");
    }
}
com.example.scheduler.TimerContextListener