package lesson4.additionalTasks;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please, enter an integer number -> ");
        System.out.println("Your number is " + reformatMyNum(scanner.nextInt()));
    }

    static String reformatMyNum(int number) {
        String reformattedNum = "";
        String numToReformat = "" + number;
        final int NUM_LENGTH = numToReformat.length();
        int counter = NUM_LENGTH - 2;
        String currentNumber = "";
        if (NUM_LENGTH == 1) {
            numToReformat = "0" + numToReformat;
        } else {
            numToReformat = numToReformat.substring(counter);
        }
        counter = 2;
        while (counter > 0) {
            currentNumber = numToReformat.substring(counter - 1, counter);
            reformattedNum = reformattedNum + currentNumber;
            counter--;
        }
        return reformattedNum;
    }
}
