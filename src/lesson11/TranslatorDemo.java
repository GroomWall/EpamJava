package lesson11;

import java.io.IOException;

public class TranslatorDemo {

    public static void main(String[] args) throws IOException {
        Translator translator = new Translator();
        Serializer serializer = new Serializer();
        AdvancedScanner scanner = new AdvancedScanner();
        System.out.println("Do you want to read previous data? 1 - yes, 0 - no");
        int choice = Validator.checkInt();
        if (choice == 1)
            translator.setWordsMap(serializer.deserialization("Translator"));
        System.out.println(translator.getWordsMap());
        String currentWord;
        String currentWordTranslation;
        while (true) {
            System.out.println("Please enter a world: (enter tostop to break the loop)");
            currentWord = Validator.parseEnglishSymbols(scanner.next());
            if (currentWord.equals("tostop")) {
                break;
            }
            System.out.println("Please enter the translation: ");
            currentWordTranslation = Validator.parseRussianSymbols(scanner.next());
            translator.setWord(currentWord, currentWordTranslation);
        }
        System.out.println("Please enter the text to translate: ");
        String translatedText = Validator.parseEnglishSymbols(scanner.next());
        translatedText = translator.translateSentence(translatedText);
        translatedText = translator.translateSentence(translatedText).trim();
        System.out.println(translatedText);
        System.out.println("Do you want to save data? 1 - yes, 0 - no");
        choice = Validator.checkInt();
        if (choice == 1)
            serializer.serialization(translator.getWordsMap(), "Translator");
        scanner.close();
    }
}
