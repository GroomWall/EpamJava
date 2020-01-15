package lesson2.hometask;

import java.util.Scanner;

public class HW2_Task3 {
    public static void main(String[] args) {
        System.out.println("Please enter amount of deposit: ");
        Scanner scanner = new Scanner(System.in);
        double deposit=scanner.nextInt();
        System.out.println("Please enter amount of months: ");
        double amountOfMonth=scanner.nextInt();
        System.out.println("Please enter a year percent rate: ");
        double percent = scanner.nextInt();
        int profit = (int)(deposit*(1+(((percent/12)*amountOfMonth)/100)));
        System.out.println("Your profit is " + profit);
    }
}
