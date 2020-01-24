/*
 * Эта программа создает массив любого типа,
 * а затем разделяет его на два: из положительных и отрицательных элементов
 * Программу написал Калмыков Вадим 20:01:2020
 */
package lesson5.homework;
import java.util.Arrays;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter array length: ");
        int arrayLength = scanner.nextInt();
        int[] initialArray = arrayCreator(arrayLength);
        int[] positiveArray = positiveArrayParser(initialArray);
        int[] negativeArray = negativeArrayParser(initialArray);
        System.out.println("Initial array: " + Arrays.toString(initialArray) +
                "\nPositive array: " + Arrays.toString(positiveArray) +
                "\nNegative array: " + Arrays.toString(negativeArray));
    }

    static int[] arrayCreator(int arrayLength){
        int[] initialArray = new int[arrayLength];
        for(int i = 0;i < initialArray.length;i++ ){
            initialArray[i] = advancedRandomizer();
        }
        return initialArray;
    }

    static int[] positiveArrayParser(int[] initialArray){
        int positiveLength = 0;
        for (int value : initialArray) {
            if (value >= 0) {
                positiveLength++;
            }
        }
        int i = 0;
        int[] positiveArray = new int[positiveLength];
        for (int value : initialArray) {
            if (value >= 0) {
                positiveArray[i] = value;
                i++;
            }
        }
        return positiveArray;
    }

    static int[] negativeArrayParser(int[] initialArray) {
        int negativeLength = 0;
        for (int value : initialArray) {
            if (value < 0) {
                negativeLength++;
            }
        }
        int[] negativeArray = new int[negativeLength];
        int i = 0;
        for (int value : initialArray) {
            if (value < 0) {
                negativeArray[i] = value;
                i++;
            }
        }
        return negativeArray;
    }

    static int advancedRandomizer(){
        int randomNumber = (int)(Math.round((Math.random() * 100)));
        if (Math.random() >= 0.5){
            randomNumber = -randomNumber;
        }
        return randomNumber;
    }
}
