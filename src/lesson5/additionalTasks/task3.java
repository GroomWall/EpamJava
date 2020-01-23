/*
 * Программа создает массив любого типа, а затем определяет
 * максимальное и минимальное значение элементов массива
 * и удаляет их дубликаты
 * Программу написал Калмыков Вадим 23.01.2020
 */
package lesson5.additionalTasks;
import java.util.Arrays;

public class task3 {
    public static void main(String[] args) {
        int[] initialArray = {9,10,10,13,10,10,10,12,15,20,14,17,20,20,21};
        System.out.println("Initial array: " + Arrays.toString(initialArray));
        System.out.println("No duplicate array: " + Arrays.toString(duplicateDelete(initialArray)));
    }
    static int[] duplicateDelete(int[] initialArray){
        int arrayLength = initialArray.length;
        Arrays.sort(initialArray);
        int minimumValue = minValue(initialArray);
        int maximumValue = maxValue(initialArray);
        int amountOfMinValues = 0;
        int amountOfMaxValues = 0;
        for (int value:initialArray) {
            if(value == minimumValue){
                amountOfMinValues++;
            }else if(value == maximumValue){
                amountOfMaxValues++;
            }
        }
        int[] noDuplicateArray = new int[arrayLength - ((amountOfMinValues - 1) + (amountOfMaxValues - 1))];
        int minCounter = 0;
        int maxCounter = 0;
        for(int i = 0,i2 = 0;i < arrayLength;i++){
            if(initialArray[i] == minimumValue){
                if(minCounter > 0){
                    continue;
                }else{
                    minCounter++;
                }
            }else if(initialArray[i] == maximumValue){
                if(maxCounter > 0){
                    continue;
                }else{
                    maxCounter++;
                }
            }
            noDuplicateArray[i2] = initialArray[i];
            i2++;
        }
        return noDuplicateArray;
    }
    static int minValue(int[] initialArray){
        int minValue = 2147483647;
        for (int value:initialArray) {
            if(value <= minValue){
                minValue = value;
            }
        }
        return minValue;
    }
    static  int maxValue(int[] initialArray){
        int maxValue = -2147483648;
        for(int value:initialArray) {
            if (value >= maxValue) {
                maxValue = value;
            }
        }
        return maxValue;
    }
}
