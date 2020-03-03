package library;

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
            Books priceManipulator = changePriceForBooksSet(books, percentages, serializationChoice);
            priceManipulator.printBooks();
            serializer(priceManipulator.currentBookshelfArray);
        } else if (choice == 2) {
            System.out.println("Please enter an author name: ");
            String author = scanner.next();
            Books sortedByAuthor = createBooksSetByAuthorName(books, author, serializationChoice);
            if (books.getBooks().length == 0) {
                System.out.println("There are no books with such an author");
            } else {
                sortedByAuthor.printBooks();
            }
            serializer(sortedByAuthor.currentBookshelfArray);
        } else if (choice == 3) {
            System.out.println("Please enter a year of publishing: ");
            int yearOfPublishing = scanner.nextInt();
            Books sortedByPublisher = createBooksSetByYearOfPublishing(books, yearOfPublishing, serializationChoice);
            if (sortedByPublisher.getBooks().length == 0) {
                System.out.println("There is no books with year greater than entered");
            } else {
                sortedByPublisher.printBooks();
            }
            serializer(sortedByPublisher.currentBookshelfArray);
        }
    }

    static Books createBooksSetByAuthorName(Books books, String author, int choice) {
        Books booksForSortingByAuthor = new Books();
        if (choice == 1) {
            booksForSortingByAuthor.setBooks(books.getCurrentBookshelfArray());
        } else {
            booksForSortingByAuthor.setBooks(books.getBooks());
        }
        booksForSortingByAuthor.sortByAuthor();
        booksForSortingByAuthor.setBooks(booksForSortingByAuthor.searchByAuthor(author));
        return booksForSortingByAuthor;
    }

    static Books createBooksSetByYearOfPublishing(Books books, int yearOfPublishing, int choice) {
        Books booksForSortingByPublisher = new Books();
        if (choice == 1) {
            booksForSortingByPublisher.setBooks(books.getCurrentBookshelfArray());
        } else {
            booksForSortingByPublisher.setBooks(books.getBooks());
        }
        booksForSortingByPublisher.sortByPublishingHouse();
        booksForSortingByPublisher.setBooks(booksForSortingByPublisher.searchByYear(yearOfPublishing));
        return booksForSortingByPublisher;
    }

    static Books changePriceForBooksSet(Books books, double percentages, int choice) {
        Books booksForPriceChanging = new Books();
        if (choice == 1) {
            booksForPriceChanging.setBooks(books.getCurrentBookshelfArray());
        } else {
            booksForPriceChanging.setBooks(books.getBooks());
        }
        booksForPriceChanging.setBooksCost(percentages);
        booksForPriceChanging.setBooks(booksForPriceChanging.sortByPrice());
        return booksForPriceChanging;
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
