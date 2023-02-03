public class HomeWork_2_Task_1 {
    public static void main(String args[]){
        String myString = "anna";
        StringBuffer buffer = new StringBuffer(myString);
        buffer.reverse();
        String data = buffer.toString();
        if(myString.equals(data)){
            System.out.println("Введенное значение является палинромом");
        }else{
            System.out.println("Введенное значение не является палинромом");
        }
    }
}