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
        System.out.println("Array1 + Array2 = " + Arrays.toString(arrayAdder(arrayLength)));
    }

    static int[] arrayAdder (int arrayLength){
        int[] firstArray = new int[arrayLength];
        int[] secondArray = new int[arrayLength];
        int[] summedArray = new int[firstArray.length];
        int i = 0;
        while(i < firstArray.length){
            firstArray[i] = randomizer();
            secondArray[i] = randomizer();
            i++;
        }
        System.out.println("First array is: " + Arrays.toString(firstArray));
        System.out.println("Second array is: " + Arrays.toString(secondArray));
        i = 0;
        while( i < summedArray.length){
            summedArray[i] = firstArray[i] + secondArray[i];
            i++;
        }
        return summedArray;
    }

    static int randomizer(){
        return (int)(Math.round(Math.random() * 100));
    }
}
