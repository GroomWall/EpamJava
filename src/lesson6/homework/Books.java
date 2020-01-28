package lesson6.homework;
import java.util.Arrays;

public class Books {
    private Book[] books = new Book[]{
            new Book(1, "Harry Potter",   "Joanne", "Bloomsbury Publishing", 1997, 200, 30),
            new Book(2, "Harry Potter 2", "Joanne", "Bloomsbury Publishing", 1998, 201, 25),
            new Book(3, "Harry Potter 3", "Joanne", "Bloomsbury Publishing", 1999, 202, 26),
            new Book(4, "Harry Potter 4", "Joanne", "Bloomsbury Publishing", 2000, 203, 27),
            new Book(5, "Harry Potter 5", "Joanne", "Bloomsbury Publishing", 2000, 204, 28),
            new Book(6, "Harry Potter 6", "Joanne", "Bloomsbury Publishing", 2002, 205, 29),
            new Book(7, "Harry Potter 7", "Joanne", "Bloomsbury Publishing", 2003, 206, 32),
    };
    int booksLength = books.length;
    int booksIncrement = 1;
    Book[] books2 = new Book[booksLength + booksIncrement];

    public void printBooks() {
        for (Book elem : books2) {
            elem.view();
        }
    }

    public void addBook(Book bookObject) {
        System.arraycopy(books,0,books2,0,booksLength);
        books2[(booksLength - booksIncrement) + booksIncrement] = bookObject;
        booksIncrement++;
    }

    public Book[] getBooks() {
        return books2;
    }

    public void setBooks(Book[] book) {
        books2 = book;
    }

    public void setBooksCost(double cost){
        for (Book book : books2) {
            book.setCost(cost);
        }
    }
    public Book[] searchByYear(int year) {
        Book[] books1 = new Book[books2.length];
        int count = 0;
        for (Book elem : books2) {
            if (elem.getYearOfPublishing() > year) {
                books1[count] = elem;
                count++;
            }
        }
        return Arrays.copyOf(books1, count);
    }

    public Book[] searchByAuthor(String author){
        Book[] books1 = new Book[books2.length];
        int count2 = 0;
        for (Book elem : books2) {
            if (elem.getAuthor().toLowerCase().equals(author.toLowerCase())) {
                books1[count2] = elem;
                count2++;

            }
        }
        return Arrays.copyOf(books1, count2);
    }
}
