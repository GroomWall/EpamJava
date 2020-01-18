/*
 * Эта программа принимает строку текста разделенную пробелами
 * и номер слова в этом тексте. Как результат выполнения
 * возвращается первый символ указанного слова.
 *
 * Программу написал Калмыков Вадим 18:01:2020
 */
package lesson4.additionalTasks;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter some words divided by spaces -> ");
        String plainText = scanner.nextLine();
        System.out.print("Please enter a number of word to parse -> ");
        int wordToParse = scanner.nextInt();
        System.out.println("Your symbol is: " + firstSymbolParser(plainText, wordToParse));
    }

    static String firstSymbolParser(String text, int position) {
        String firstSymbol = "";
        String trimmedText = text;
        int counter = 1;
        while (counter < position) {
            trimmedText = trimmedText.substring((trimmedText.indexOf(" ") + 1));
            counter++;
        }
        firstSymbol = trimmedText.substring(0, 1);
        return firstSymbol;
    }
}
