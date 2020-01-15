package lesson2.hometask;

import java.util.Scanner;

public class HW2_Task2 {
    public static void main(String[] args) {
        System.out.println("Please, enter amount of pounds to convert -> ");
        Scanner scanner = new Scanner(System.in);
        int pounds = scanner.nextInt();
        double kg = pounds/2.20462;
        int kilosInt = (int)kg;
        double kilosFraction = (kg-kilosInt)*1000;
        int fraction=(int)kilosFraction;
        System.out.println("Amount of kilos " + kilosInt + "\nAmount of grams " + fraction);
    }
}
