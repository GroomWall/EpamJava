package lesson10.homework;

import java.io.InvalidObjectException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Serializer serializer = new Serializer();
        Scanner scanner = new Scanner(System.in);
        try {
            Books books = new Books();
            books.addBook(new Book(8, "Harry Potter 8", "Vadym", "Bloomsbury Publishing", 2000, 200, 30));
            books.addBook(new Book(9, "Harry Potter 9", "Vadym", "Bloomsbury Publishing", 2220, 211, 32));
            books.addBook(new Book(10, "Harry Potter 10", "Vadym", "Bloomsbury Publishing", 2230, 231, 333));
            System.out.println("If you want to change books cost enter - 1 " +
                    "\nIf you want to find books by the author enter - 2" +
                    "\nIf you want to find books published after a given year - 3");
            int choice = 0;
            double percentages = 0;
            String author = "";
            int yearOfPublishing = 0;
            try {
                choice = scanner.nextInt();
            } catch (Exception e) {
                Validator.exceptionHandler(e);
            }
            if (choice == 1) {
                try {
                    System.out.println("Please enter amount of percentages for cost increasing: ");
                    Books priceManipulator = new Books();
                    percentages = scanner.nextDouble();
                    priceManipulator.setBooks(books.getBooks());
                    priceManipulator.setBooksCost(percentages);
                    priceManipulator.setBooks(priceManipulator.sortByPrice());
                    priceManipulator.printBooks();
                    System.out.println("Do you want to to save data? 1 - yes | 0 - no");
                    int decision = scanner.nextInt();
                    if (decision == 1) {
                        System.out.println("Please enter the name of a file to save your data:  ");
                        String name = scanner.next();
                        serializer.serialization(priceManipulator.currentBookshelfArray, name);
                    }
                } catch (Exception e) {
                    Validator.exceptionHandler(e);
                }
            } else if (choice == 2) {
                try {
                    Books sortedByAuthor = new Books();
                    System.out.println("Please enter an author name: ");
                    sortedByAuthor.setBooks(books.getBooks());
                    sortedByAuthor.sortByAuthor();
                    author = scanner.next();
                    sortedByAuthor.setBooks(sortedByAuthor.searchByAuthor(author));
                    if (books.getBooks().length == 0) {
                        System.out.println("There are no books with such an author");
                    } else {
                        sortedByAuthor.printBooks();
                    }
                    System.out.println("Do you want to to save data? 1 - yes | 0 - no");
                    int decision = scanner.nextInt();
                    if (decision == 1) {
                        System.out.println("Please enter the name of a file to save your data:  ");
                        String name = scanner.next();
                        serializer.serialization(sortedByAuthor.currentBookshelfArray, name);
                    }
                } catch (Exception e) {
                    Validator.exceptionHandler(e);
                }
            } else if (choice == 3) {
                try {
                    Books sortedByPublisher = new Books();
                    sortedByPublisher.setBooks(books.getBooks());
                    sortedByPublisher.sortByPublishingHouse();
                    System.out.println("Please enter a year of publishing: ");
                    yearOfPublishing = scanner.nextInt();
                    sortedByPublisher.setBooks(sortedByPublisher.searchByYear(yearOfPublishing));
                    if (sortedByPublisher.getBooks().length == 0) {
                        System.out.println("There is no books with year greater than entered");
                    } else {
                        sortedByPublisher.printBooks();
                    }
                    System.out.println("Do you want to to save data? 1 - yes | 0 - no");
                    int decision = scanner.nextInt();
                    if (decision == 1) {
                        System.out.println("Please enter the name of a file to save your data:  ");
                        String name = scanner.next();
                        serializer.serialization(sortedByPublisher.currentBookshelfArray, name);
                    }
                } catch (Exception e) {
                    Validator.exceptionHandler(e);
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

        try {
            System.out.println("Please enter the name of a file to read: ");
            String name = scanner.next();
            Book[] book1 = serializer.deserialization(name);
            for (Book book : book1) {
                System.out.println(book);
            }
        } catch (InvalidObjectException e) {
            e.printStackTrace();
        }
        scanner.close();
    }
}
