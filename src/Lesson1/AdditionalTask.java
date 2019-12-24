package Lesson1;

import java.util.Scanner;

public class AdditionalTask {
    public static void main(String[] args) {
        System.out.print("Enter a symbol to print -> ");
        Scanner scanner = new Scanner(System.in);
        String symbol = scanner.nextLine();
        System.out.println(symbol + "     "+symbol + "   "+symbol+" "+symbol+" "+symbol+" "+symbol+"   "+symbol+"         "+symbol+"             "+symbol+" "+symbol);
        System.out.println(symbol + "     "+symbol+ "   "+symbol+"         "+symbol+"         "+symbol+"           "+symbol+"     "+symbol);
        System.out.println(symbol + " "+symbol+" "+symbol+" "+symbol+"   "+symbol+" "+symbol+"       "+symbol+"         "+symbol+"          "+symbol+"       "+symbol);
        System.out.println(symbol + "     "+symbol+ "   "+symbol+"         "+symbol+"     "+symbol+"   "+symbol+"     "+symbol+"     "+symbol+"     "+symbol);
        System.out.println(symbol + "     "+symbol+ "   "+symbol+" "+symbol+" "+symbol+" "+symbol+"   "+symbol+" "+symbol+" "+symbol+" "+symbol+"   "+symbol+" "+symbol+" "+symbol+" "+symbol+"       "+symbol+" "+symbol);
    }
}
