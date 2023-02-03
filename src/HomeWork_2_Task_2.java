import java.io.*;

public class HomeWork_2_Task_2 {

    public static void main(String[] args) {

        try(FileWriter writer = new FileWriter("HomeWork.txt", false))
        {
            for (int i = 0; i < 100; i++) {
                String text = "TEST ";
                writer.write(text);

                writer.flush();
            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}