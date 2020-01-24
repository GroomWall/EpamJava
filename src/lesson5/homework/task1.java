/*
 * Эта программа создает два массива указанной длинны
 * и заполняет их случайными числами
 * после чего попарно слаживает элементы первого
 * и воторого массивов в третий. Результат работы
 * выводится в консоль.
 * Программу написал Калмыков Вадим 20:01:2020
 */

package lesson5.homework;
import java.util.Arrays;
import java.util.Scanner;

public class task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter array length -> " );
        int arrayLength = scanner.nextInt();
        int[] firstArray = arrayCreator(arrayLength);
        int[] secondArray = arrayCreator(arrayLength);
        int[] summedArray = arrayAdder(firstArray,secondArray);
        System.out.println("First array = " + Arrays.toString(firstArray));
        System.out.println("Second array = " + Arrays.toString(secondArray));
        System.out.println("Array1 + Array2 = " + Arrays.toString(summedArray));
    }

    static int[] arrayAdder (int[] firstArray,int[] secondArray){
        int[] summedArray = new int[firstArray.length];
        for(int i = 0; i < summedArray.length;i++){
            summedArray[i] = firstArray[i] + secondArray[i];
        }
        return summedArray;
    }

    static int[] arrayCreator(int arrayLength){
        int[] createdArray = new int[arrayLength];
        for(int i = 0;i < arrayLength;i++){
            createdArray[i] = randomizer();
        }
        return createdArray;
    }

    static int randomizer(){
        return (int)(Math.round(Math.random() * 100));
    }
}
