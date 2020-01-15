package lesson2.hometask;

import java.util.Scanner;

public class HW2_Task1 {
    public static void main(String[] args) {
        System.out.print("Enter 3-digit number -> ");
        Scanner scanner = new Scanner(System.in);
        int number=scanner.nextInt();
        int CopyNumber=number;
        int number1=CopyNumber%10;
        CopyNumber/=10;
        int number2=CopyNumber%10;
        CopyNumber/=10;
        int number3=CopyNumber%10;
        String reverse=number1+""+number2+""+number3;
        int reverseNumber=Integer.parseInt(reverse);
        int difference=number-reverseNumber;
        System.out.println("Reverse number is "+number1+""+number2+""+number3);
        System.out.println("Difference = " + difference);
    }
}
