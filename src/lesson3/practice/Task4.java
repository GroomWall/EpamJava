package lesson3.practice;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("* |  1  2  3  4  5  6  7  8  9");
        System.out.println("----------------------------------------");
        int row = 1 ;
        while (row <= 9) {
            int value = 1;
            System.out.print(row + " |");
            while (value <= 9){
                int result = row * value;
                System.out.print((result < 10 ?"  ": " ") + result);
                value++;
            }
            row++;
            System.out.println();
        }
    }
}
