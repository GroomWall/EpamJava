package Lesson3.Practice;

public class Task2 {
    public static void main(String[] args) {
        int line = 1;
        while(line <= 8){
            int number = line;
            while(number > 0){
                System.out.print(number + " ");
                number--;
            }
            line++;
            System.out.println();
        }
    }
}
