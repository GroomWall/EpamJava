package lesson11;

public class Validator {

    static int checkInt() {
        AdvancedScanner scanner = new AdvancedScanner();
        do {
            try {
                return scanner.nextInt();
            } catch (Exception ignored) {
                System.out.println("Please, enter an integer type value.");
            }
        } while (true);
    }

    static String parseEnglishSymbols(String textToParse) {
        return textToParse.replaceAll("[^a-zA-Z -]", "")
                .replaceAll(" +", " ")
                .trim();
    }

    static String parseRussianSymbols(String textToParse) {
        return textToParse.replaceAll("[^а-яА-Я -]", "")
                .replaceAll(" +", " ")
                .trim();
    }

}
