package lesson8.homework;

public class Validator {

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

}
