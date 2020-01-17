/*
 * Эта программа принимает целое число с консоли
 * и выводит его бинарное представление
 *
 * Программу написал Калмыков Вадим 17.01.2020
 */

package lesson4.homework;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter an integer number -> ");
        System.out.println("Binary representation: " + intToBinary(scanner.nextInt()));
    }
    static String intToBinary(int number){
        String inverseBinary = "";
        int divisionResult;
        while (number > 0) {
            divisionResult = number % 2;
            number = number / 2;
            inverseBinary = inverseBinary + divisionResult;
        }
        String binaryRepresentation = "";
        String currentNumber;
        final int BINARY_LENGTH = inverseBinary.length();
        int lengthCounter = BINARY_LENGTH;
        int counter = 0;
        while (counter < BINARY_LENGTH){
            currentNumber = inverseBinary.substring(lengthCounter - 1, lengthCounter);
            binaryRepresentation = binaryRepresentation + currentNumber;
            lengthCounter--;
            counter++;
        }
        return binaryRepresentation;
    }
}
