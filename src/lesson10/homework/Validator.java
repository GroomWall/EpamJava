package lesson10.homework;

public class Validator {

    static int checkSerializationChoice() {
        AdvancedScanner scanner = new AdvancedScanner();
        do {
            try {
                int input = scanner.nextInt();
                if (input == 0 || input == 1) {
                    return input;
                } else {
                    System.out.println("You entered non integer value, retype once more with numbers 0 or 1");
                }
            } catch (Exception ignored) {
                System.out.println("You entered non integer value, retype once more with numbers 0 or 1");
            }
        } while (true);
    }

    static int operationTypeChoice() {
        AdvancedScanner scanner = new AdvancedScanner();
        do {
            try {
                int input = scanner.nextInt();
                if (input == 1 || input == 2 || input == 3) {
                    return input;
                } else {
                    System.out.println("You entered non integer value, retype once more with numbers 1, 2 or 3");
                }
            } catch (Exception ignored) {
                System.out.println("You entered non integer value, retype once more with numbers 1, 2 or 3");
            }
        } while (true);
    }

    static double checkDouble() {
        AdvancedScanner scanner = new AdvancedScanner();
        do {
            try {
                return scanner.nextDouble();
            } catch (Exception ignored) {
                System.out.println("Please, enter a double type value.");
            }
        } while (true);
    }

    static Book[] checkBooks() {
        AdvancedScanner scanner = new AdvancedScanner();
        Serializer serializer = new Serializer();
        do {
            try {
                System.out.println("Please enter the name of a file to read: ");
                String fileName = scanner.next();
                Book[] bookArray = serializer.deserialization(fileName);
                if (bookArray != null) {
                    return bookArray;
                }
            } catch (Exception ignored) {
                System.out.println("File does not exist or you entered a wrong name.");
            }
        } while (true);
    }
}
