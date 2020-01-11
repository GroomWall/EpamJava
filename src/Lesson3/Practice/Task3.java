package Lesson3.Practice;

public class Task3 {
    public static void main(String[] args) {
        int counter = 0;
        int number = 1;
        while (counter < 10){
            if (number % 3 == 0 || number % 4 == 0){
                counter++;
                System.out.println(counter + ") " + number);

            }
            number++;
        }
    }
}
