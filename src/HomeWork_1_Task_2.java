public class HomeWork_1_Task_2 {
    public static void main(String[] args) {
        int g = 2024;
        if (g % 4 == 0) {
            if ((g % 100 != 0) || (g % 400 == 0)) {
                System.out.println("високосный");
            }
        }
    }
}
