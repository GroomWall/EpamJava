package lesson6.homework;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Books books = new Books();
        Scanner scanner = new Scanner(System.in);
        books.addBook(new Book(8, "Harry Potter 8","Vadym", "Bloomsbury Publishing", 2000, 200, 30));
        books.getBooks();
        System.out.println("If you want to change books cost enter - 1 " +
                "\nIf you want to find books by the author enter - 2" +
                "\nIf you want to find books published after a given year - 3");
        int choice = scanner.nextInt();
        double percentages = 0;
        String author = "";
        int yearOfPublishing = 0;
        if(choice == 1){
            System.out.println("Please enter amount of percentages for cost increasing: ");
            percentages = scanner.nextDouble();
            books.setBooksCost(percentages);
            books.printBooks();
        }else if (choice == 2){
            System.out.println("Please enter an autor name: ");
            author = scanner.next();
            Books byAuthor = new Books();
            byAuthor.setBooks(books.searchByAuthor(author));
            if (byAuthor.getBooks().length == 0){
                System.out.println(author);
                System.out.println("There is no books with such an author");
            }else{
                byAuthor.printBooks();
            }
        }else if(choice == 3){
            System.out.println("Please enter a year of publishing: ");
            yearOfPublishing = scanner.nextInt();
            Books other = new Books();
            other.setBooks(books.searchByYear(yearOfPublishing));
            if (other.getBooks().length == 0){
                System.out.println("There is no books with year greater than entered");
            }else{
                other.printBooks();
            }
        }
    }
}