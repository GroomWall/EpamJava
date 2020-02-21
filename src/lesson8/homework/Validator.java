package lesson8.homework;

public class Validator {

    static void exceptionHandler(Exception e){
        switch (e.getClass().getSimpleName()) {
            case ("InputMismatchException"):
                System.err.println("You entered wrong data, please enter numbers from pool (1-3) ");
                break;
            case("NullPointerException") :
                System.err.println("There is no element with such filter criteria");
                break;
            case("ArithmeticException") :
                System.err.println("An exception occurred due to an error while performing arithmetic calculation " +
                        "(for example, with an attempt to integer division by zero)");
                break;
            case("ArrayIndexOutOfBoundsException") :
                System.err.println("Problem with the number of books entered, " +
                        "maybe amount exceeds the number of books on the bookshelf");
                break;
            default:
                System.err.println("Something wrong with data entered");
                break;
        }
    }

}
