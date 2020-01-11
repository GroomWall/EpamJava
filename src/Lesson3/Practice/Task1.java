package Lesson3.Practice;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int var1 = scanner.nextInt();
        int var2 = scanner.nextInt();
        int var3 = scanner.nextInt();
        if ( (var1 > var2) && (var1 > var3) ){
            System.out.println("Bigest num is: " + var1);
        }else if ( (var2 > var1) && (var2 > var3) ){
            System.out.println("Bigest num is: " + var2);
        }else{
            System.out.println("Bigest num is: " + var3);
        }
    }
}
