package lesson10.homework;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        AdvancedScanner scanner = new AdvancedScanner();
        System.out.println("Do you want to upload your bookshelf from txt or make a new file?" +
                " 1 - bookshelf | 0 - new file");

        int serializationChoice = Validator.checkSerializationChoice();
        Books books = new Books();
        if (serializationChoice == 1) {
            books.currentBookshelfArray = Validator.checkBooksDeserialization();
            for (Book book : books.currentBookshelfArray) {
                System.out.println(book.toString());
            }
        } else {
            books.addBook(new Book(8, "Harry Potter 8", "Vadym", "Bloomsbury Publishing", 2000, 200, 30));
            books.addBook(new Book(9, "Harry Potter 9", "Vadym", "Bloomsbury Publishing", 2220, 211, 32));
            books.addBook(new Book(10, "Harry Potter 10", "Vadym", "Bloomsbury Publishing", 2230, 231, 333));
        }
        System.out.println("If you want to change books cost enter - 1 " +
                "\nIf you want to find books by the author enter - 2" +
                "\nIf you want to find books published after a given year - 3");
        int choice = Validator.operationTypeChoice();
        if (choice == 1) {
            System.out.println("Please enter amount of percentages for cost increasing: ");
            double percentages = Validator.checkDouble();
            Books priceManipulator = changePrice(books, percentages, serializationChoice);
            priceManipulator.printBooks();
            serializer(priceManipulator.currentBookshelfArray);
        } else if (choice == 2) {
            System.out.println("Please enter an author name: ");
            String author = scanner.next();
            Books sortedByAuthor = searchByAuthor(books, author, serializationChoice);
            if (books.getBooks().length == 0) {
                System.out.println("There are no books with such an author");
            } else {
                sortedByAuthor.printBooks();
            }
            serializer(sortedByAuthor.currentBookshelfArray);
        } else if (choice == 3) {
            System.out.println("Please enter a year of publishing: ");
            int yearOfPublishing = scanner.nextInt();
            Books sortedByPublisher = searchByPublisher(books, yearOfPublishing, serializationChoice);
            if (sortedByPublisher.getBooks().length == 0) {
                System.out.println("There is no books with year greater than entered");
            } else {
                sortedByPublisher.printBooks();
            }
            serializer(sortedByPublisher.currentBookshelfArray);
        }
    }

    static Books searchByAuthor(Books books, String author, int choice) {
        Books sortedByAuthor = new Books();
        if (choice == 1) {
            sortedByAuthor.setBooks(books.getCurrentBookshelfArray());
        } else {
            sortedByAuthor.setBooks(books.getBooks());
        }
        sortedByAuthor.sortByAuthor();
        sortedByAuthor.setBooks(sortedByAuthor.searchByAuthor(author));
        return sortedByAuthor;
    }

    static Books searchByPublisher(Books books, int yearOfPublishing, int choice) {
        Books sortedByPublisher = new Books();
        if (choice == 1) {
            sortedByPublisher.setBooks(books.getCurrentBookshelfArray());
        } else {
            sortedByPublisher.setBooks(books.getBooks());
        }
        sortedByPublisher.sortByPublishingHouse();
        sortedByPublisher.setBooks(sortedByPublisher.searchByYear(yearOfPublishing));
        return sortedByPublisher;
    }

    static Books changePrice(Books books, double percentages, int choice) {
        Books priceManipulator = new Books();
        if (choice == 1) {
            priceManipulator.setBooks(books.getCurrentBookshelfArray());
        } else {
            priceManipulator.setBooks(books.getBooks());
        }
        priceManipulator.setBooksCost(percentages);
        priceManipulator.setBooks(priceManipulator.sortByPrice());
        return priceManipulator;
    }

    static void serializer(Book[] serTheseBooks) throws IOException {
        AdvancedScanner scanner = new AdvancedScanner();
        Serializer serializer = new Serializer();
        System.out.println("Do you want to to save data? 1 - yes | 0 - no");
        int decision = Validator.checkSerializationChoice();
        if (decision == 1) {
            System.out.println("Please enter the name of a file to save your data:  ");
            String name = scanner.next();
            serializer.serialization(serTheseBooks, name);
        }
    }

}
