package lesson2.practical;

public class Task2_1 {
//    123-321
public static void main(String[] args) {
    int number1=-23;
    int number2=100;
    System.out.println("num1="+ number1+"\nnum2="+number2);
    number1=number1+number2;
    number2=number1-number2;
    number1=number1-number2;
    System.out.println("num1="+ number1+"\nnum2="+number2);
}
}
