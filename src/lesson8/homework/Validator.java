package lesson8.homework;

import java.util.InputMismatchException;

public class Validator {
    static void errorHandler(InputMismatchException e) {
        System.out.println("An error occurred - improper value entered");
    }

    static void errorHandler(Exception e) {
        System.out.println("Error of execution");
    }
}
