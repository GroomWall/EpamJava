/*
 * Программа создает одномерный массив любой длинны.
 * Вычисляет средне арефметическое значение среди элементов массива
 * и выводит в консоль количество элементов массива, которые
 * больше этого средне арифметического числа.
 * Программу написал Калмыков Вадим 23.01.2020
 */
package lesson5.additionalTasks;

import java.util.Arrays;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter array length -> " );
        int arrayLength = scanner.nextInt();
        int[] initialArray = arrayCreator(arrayLength);
        int meanValue = meanValue(initialArray);
        int moreThanMean = greaterThanMean(initialArray,meanValue);
        System.out.println("Initial array = " + Arrays.toString(initialArray));
        System.out.println("Mean value = " + meanValue);
        System.out.println("The number of elements is greater than the mean value: " + moreThanMean);
    }
    static int[] arrayCreator(int arrayLength){
        int[] outputArray = new int[arrayLength];
        for(int i = 0;i < outputArray.length;i++){
            outputArray[i] = randomize();
        }
        return outputArray;
    }
    static int meanValue(int[] oneDimArray){
        int mean = 0;
        for (int value : oneDimArray) {
            mean = mean + value;
        }
        mean = mean / oneDimArray.length;
        return mean;
    }
    static int greaterThanMean(int[] inputArray, int meanValue){
        int numberOfElements = 0;
        for (int value : inputArray) {
            if (value > meanValue) {
                numberOfElements++;
            }
        }
        return numberOfElements;
    }
    static int randomize(){
        return (int)(Math.round(Math.random() * 100));
    }
}
