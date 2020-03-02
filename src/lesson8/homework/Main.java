package lesson8.homework;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        AdvancedScanner scanner = new AdvancedScanner();
        Books books = new Books();
        books.addBook(new Book(8, "Harry Potter 8", "Vadym", "Bloomsbury Publishing", 2000, 200, 30));
        books.addBook(new Book(9, "Harry Potter 9", "Vadym", "Bloomsbury Publishing", 2220, 211, 32));
        books.addBook(new Book(10, "Harry Potter 10", "Vadym", "Bloomsbury Publishing", 2230, 231, 333));
        System.out.println("If you want to change books cost enter - 1 " +
                "\nIf you want to find books by the author enter - 2" +
                "\nIf you want to find books published after a given year - 3");
        int choice = Validator.operationTypeChoice();
        if (choice == 1) {
            System.out.println("Please enter amount of percentages for cost increasing: ");
            double percentages = Validator.checkDouble();
            Books priceManipulator = changePriceForBooksSet(books, percentages);
            priceManipulator.printBooks();
        } else if (choice == 2) {
            System.out.println("Please enter an author name: ");
            String author = scanner.next();
            Books sortedByAuthor = createBooksSetByAuthorName(books, author);
            if (books.getBooks().length == 0) {
                System.out.println("There are no books with such an author");
            } else {
                sortedByAuthor.printBooks();
            }
        } else if (choice == 3) {
            System.out.println("Please enter a year of publishing: ");
            int yearOfPublishing = scanner.nextInt();
            Books sortedByPublisher = createBooksSetByYearOfPublishing(books, yearOfPublishing);
            if (sortedByPublisher.getBooks().length == 0) {
                System.out.println("There is no books with year greater than entered");
            } else {
                sortedByPublisher.printBooks();
            }
        }
    }

    static Books createBooksSetByAuthorName(Books books, String author) {
        Books booksForSortingByAuthor = new Books();
        booksForSortingByAuthor.setBooks(books.getBooks());
        booksForSortingByAuthor.sortByAuthor();
        booksForSortingByAuthor.setBooks(booksForSortingByAuthor.searchByAuthor(author));
        return booksForSortingByAuthor;
    }

    static Books createBooksSetByYearOfPublishing(Books books, int yearOfPublishing) {
        Books booksForSortingByPublisher = new Books();
        booksForSortingByPublisher.setBooks(books.getBooks());
        booksForSortingByPublisher.sortByPublishingHouse();
        booksForSortingByPublisher.setBooks(booksForSortingByPublisher.searchByYear(yearOfPublishing));
        return booksForSortingByPublisher;
    }

    static Books changePriceForBooksSet(Books books, double percentages) {
        Books booksForPriceChanging = new Books();
        booksForPriceChanging.setBooks(books.getBooks());
        booksForPriceChanging.setBooksCost(percentages);
        booksForPriceChanging.setBooks(booksForPriceChanging.sortByPrice());
        return booksForPriceChanging;
    }

}
