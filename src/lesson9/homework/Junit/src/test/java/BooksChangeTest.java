import library.Book;
import library.Books;
import library.Serializer;
import org.junit.Assert;
import org.junit.Test;

import java.io.InvalidObjectException;

public class BooksChangeTest {

    private Book[] booksForTest = new Book[]{
            new Book(2, "Harry Potter 2", "Boanne", "New Publisher", 1998, 201, 25),
            new Book(4, "Harry Potter 4", "Boanne", "Book House", 2000, 203, 27),
            new Book(3, "Harry Potter 3", "Coanne", "Brand New Publisher", 1999, 202, 26),
            new Book(6, "Harry Potter 6", "Eoanne", "Independent Publishing House", 2002, 205, 29),
            new Book(7, "Harry Potter 7", "Foanne", "Bloomsbury Publishing", 2003, 206, 32),
            new Book(5, "Harry Potter 5", "Hoanne", "Cool Story Bob", 2000, 204, 28),
            new Book(1, "Harry Potter", "Joanne", "Bloomsbury Publishing", 1997, 200, 30),
    };

    private Book[] BooksDeserialization(String name) throws InvalidObjectException {
        Serializer serializer = new Serializer();
        return serializer.deserialization(name);
    }

    private Books booksSetup(){
        Books books = new Books();
        books.addBook(new Book(8, "Harry Potter 8", "Vadym", "Bloomsbury Publishing", 2000, 200, 30));
        books.addBook(new Book(9, "Harry Potter 9", "Vadym", "Bloomsbury Publishing", 2220, 211, 32));
        books.addBook(new Book(10, "Harry Potter 10", "Vadym", "Bloomsbury Publishing", 2230, 231, 333));
        return books;
    }

    private int fileComparator(Book[] booksForTest,Books books){
        int i = 0;
        int successCounter = 0;
        for (Book book : booksForTest) {
            boolean check = book.equals(books.getCurrentBookshelfArray()[i]);
            if (check) {
                successCounter++;
            }
            i++;
        }
        return successCounter;
    }

    @Test
    public void setBooksCostTest() throws InvalidObjectException {
        Books books = booksSetup();
        books.setBooks(books.getBooks());
        books.setBooksCost(10);
        books.setBooks(books.sortByPrice());
        String name = "setBooksCostTest10";
        Book[] booksForTest = BooksDeserialization(name);
        int successCounter = fileComparator(booksForTest, books);
        Assert.assertEquals(successCounter, books.getCurrentBookshelfArray().length);
    }

    @Test
    public void searchByAuthorTest() throws InvalidObjectException {
        Books books = booksSetup();
        int i = 0;
        books.setBooks(books.getBooks());
        books.sortByAuthor();
        books.setBooks(books.searchByAuthor("Vadym"));
        String name = "searchByAuthorVadym";
        Book[] booksForTest = BooksDeserialization(name);
        int successCounter = fileComparator(booksForTest, books);
        Assert.assertEquals(successCounter, books.getCurrentBookshelfArray().length);
    }

    @Test
    public void searchByYearTest() throws InvalidObjectException {
        Books books = booksSetup();
        int i = 0;
        books.setBooks(books.getBooks());
        books.sortByPublishingHouse();
        books.setBooks(books.searchByYear(2000));
        String name = "searchByYearTest2000";
        Book[] booksForTest = BooksDeserialization(name);
        int successCounter = fileComparator(booksForTest, books);
        Assert.assertEquals(successCounter, books.getCurrentBookshelfArray().length);
    }

    @Test
    public void sortByAuthorTest() {
        Books books = new Books();
        books.sortByAuthor();
        int successCounter = fileComparator(booksForTest, books);
        Assert.assertEquals(successCounter, books.getCurrentBookshelfArray().length);
    }

}
