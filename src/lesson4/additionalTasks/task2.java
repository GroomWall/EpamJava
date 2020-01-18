/*
 * Эта программа принимает число от 1 до 9
 * и строит пирамиду из цифр по высоте равную введенному числу
 *
 * Программу написал Калмыков Вадим 18:01:2020
 */
package lesson4.additionalTasks;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please, enter an integer number from 1 to 9 -> ");
        pyramidCreator(scanner.nextInt());
    }

    static void pyramidCreator(final int NUMBER) {
        int pyramidHeightCounter = 1;
        int spacesCounterDynamic = 1;
        int spacesCounterStatic = NUMBER;
        int fromOneToNumber = 1;
        int reverseOrderLoop = 1;
        while (pyramidHeightCounter <= NUMBER) {
            while (spacesCounterDynamic <= spacesCounterStatic) {
                System.out.print(" ");
                spacesCounterDynamic++;
            }
            while (fromOneToNumber < pyramidHeightCounter + 1) {
                System.out.print(fromOneToNumber);
                fromOneToNumber++;
            }
            while (reverseOrderLoop > 1) {
                System.out.print(reverseOrderLoop - 1);
                reverseOrderLoop--;
            }
            fromOneToNumber = 1;
            System.out.println();
            spacesCounterDynamic = 1;
            spacesCounterStatic--;
            pyramidHeightCounter++;
            reverseOrderLoop = pyramidHeightCounter;
        }
    }
}
