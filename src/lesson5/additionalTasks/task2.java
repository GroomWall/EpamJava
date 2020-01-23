/*
 * Программа создает два одномерных массива заданой длинны
 * а затем создает третий массив как конкатенацию двух исходных
 * Программу написал Калмыков Вадим 23.01.2020
 */
package lesson5.additionalTasks;

import java.util.Arrays;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input length of the first array: ");
        int arrayLength = scanner.nextInt();
        int[] firstArray = arrayCreator(arrayLength);
        System.out.println("Please input length of the second array: ");
        arrayLength = scanner.nextInt();
        int[] secondArray = arrayCreator(arrayLength);
        int[] concatenatedArray = arrayConcatenate(firstArray,secondArray);
        System.out.println("First array: " + Arrays.toString(firstArray));
        System.out.println("Second array: " + Arrays.toString(secondArray));
        System.out.println("Concatenated array: " + Arrays.toString(concatenatedArray));
    }
    static int[] arrayCreator(int arrayLength){
        int[] outputArray = new int[arrayLength];
        for(int i = 0;i < arrayLength;i++){
            outputArray[i] = randomize();
        }
        return outputArray;
    }
    static int[] arrayConcatenate(int[] firstArray, int[] secondArray){
        int[] concatenatedArray = new int[(firstArray.length + secondArray.length)];
        for (int i = 0,i2 = 0; i < concatenatedArray.length;i++){
            if(i < firstArray.length){
                concatenatedArray[i] = firstArray[i];
            }else{
                concatenatedArray[i] = secondArray[i2];
                i2++;
            }
        }
        return concatenatedArray;
    }
    static int randomize(){
        return (int)(Math.round(Math.random() * 100));
    }
}
