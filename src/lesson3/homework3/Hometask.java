/*
 * Программа строит однотипные треугольники 
 * с использованием циклов while
 * Задание выполнил Калмыков Вадим 11:01:2020
 */
package lesson3.homework3;
public class Hometask {
    public static void main(String[] args) {
        
        // -------------------------------------------Step 1----------------------------------------
        
        int counter = 1;
        while (counter <= 7){
            int number = counter;
            while(number > 0) {
                System.out.print("*" + " ");
                number--;
            }
            counter++;
            System.out.println();
        }

        while (counter >= 1){
            int number = counter;
            while(number > 2) {
                System.out.print("*" + " ");
                number--;
            }
            counter--;
            System.out.println();
        }

        // -------------------------------------------Step 2----------------------------------------

        counter=8;
        int spacesCounter = 1;
        int zero = 0;
        while (counter >= 1){
            int number = counter;
            while(number > 1) {
                System.out.print("*" + " ");
                number--;
            }
            counter--;
            System.out.println();
            while(zero < spacesCounter){
                System.out.print("  ");
                zero++;
            }
            zero=0;
            spacesCounter++;
        }

        // -------------------------------------------Step 3----------------------------------------

        int counterOfStars = 1;
        int FromNumberToZeroCounter = 0;
        spacesCounter = 6;
        while (counterOfStars <= 8){
            int numberofStars = counterOfStars;
            while(numberofStars > 1) {
                System.out.print("*" + " ");
                numberofStars--;
            }
            counterOfStars++;
            System.out.println();
            while(FromNumberToZeroCounter < spacesCounter){
                System.out.print("  ");
                FromNumberToZeroCounter++;
            }
            FromNumberToZeroCounter = 0;
            spacesCounter--;
        }

        // -------------------------------------------Step 4----------------------------------------
        
        counterOfStars = 1;
        spacesCounter = 6;
        while (counterOfStars <= 8){
            int numberofStars = counterOfStars;
            while(numberofStars > 1) {
                System.out.print("*" + " ");
                numberofStars--;
            }
            counterOfStars++;
            System.out.println();
            while(FromNumberToZeroCounter < spacesCounter){
                System.out.print("  ");
                FromNumberToZeroCounter++;
            }
            FromNumberToZeroCounter = 0;
            spacesCounter--;
        }

        counter = 7;
        spacesCounter = 1;
        zero = 0;
        while (counter >= 1){
            int number = counter;
            System.out.print("  ");
            while(number > 1) {
                System.out.print("*" + " ");
                number--;
            }
            counter--;
            System.out.println();
            while(zero < spacesCounter){
                System.out.print("  ");
                zero++;
            }
            zero = 0;
            spacesCounter++;
        }

        // -------------------------------------------Step 5----------------------------------------
        
        int triangleNumber = 0;
        while (triangleNumber < 2) {
            counterOfStars = 1;
            FromNumberToZeroCounter = 0;
            spacesCounter = 6;
            while (counterOfStars <= 7) {
                int numberofStars = counterOfStars * 2;
                counterOfStars++;
                System.out.println();
                while (FromNumberToZeroCounter < spacesCounter) {
                    System.out.print("  ");
                    FromNumberToZeroCounter++;
                }
                while (numberofStars > 1) {
                    System.out.print("*" + " ");
                    numberofStars--;
                }
                FromNumberToZeroCounter = 0;
                spacesCounter--;
            }
            triangleNumber++;
        }
    }
}
