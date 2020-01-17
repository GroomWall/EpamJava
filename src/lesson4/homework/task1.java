/*
* Эта программа при её вызове принимает строку,
* парсит ее на отдельные символы
* и выводит уникальные символы в консоль
*
* Программу написал Калмыков Вадим 17.01.2020
*/

package lesson4.homework;
import java.util.Scanner;
public class task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter some String -> ");
        System.out.println("Unique characters: " + charSeparator(scanner.nextLine()));
    }

    static String charSeparator(String inputText) {
        String noSpaceText = inputText.replace(" ", "");
        String refactored;
        final int TEXT_LENGTH = noSpaceText.length();
        int lengthCounter = 0;
        String resultingString = "";
        while (lengthCounter < TEXT_LENGTH){
            refactored = noSpaceText.substring(lengthCounter, lengthCounter + 1);
            if (resultingString.indexOf(refactored) >= 0) {
                lengthCounter++;
                continue;
            }
            resultingString = resultingString + refactored + " ";
            lengthCounter++;
        }
        return resultingString;
    }
}
