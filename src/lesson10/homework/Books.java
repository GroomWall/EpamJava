package lesson10.homework;

import java.util.Arrays;
import java.util.Comparator;

public class Books {
    private Book[] books = new Book[]{
            new Book(1, "Harry Potter", "Joanne", "Bloomsbury Publishing", 1997, 200, 30),
            new Book(2, "Harry Potter 2", "Boanne", "New Publisher", 1998, 201, 25),
            new Book(3, "Harry Potter 3", "Coanne", "Brand New Publisher", 1999, 202, 26),
            new Book(4, "Harry Potter 4", "Boanne", "Book House", 2000, 203, 27),
            new Book(5, "Harry Potter 5", "Hoanne", "Cool Story Bob", 2000, 204, 28),
            new Book(6, "Harry Potter 6", "Eoanne", "Independent Publishing House", 2002, 205, 29),
            new Book(7, "Harry Potter 7", "Foanne", "Bloomsbury Publishing", 2003, 206, 32),
    };

    private int booksCounter = 0;
    Book[] bookshelf = bookInitializer();
    Book[] currentBookshelfArray = currentBookshelf();

    private Book[] currentBookshelf() {
        return Arrays.copyOf(bookshelf, booksCounter);
    }

    private Book[] bookInitializer() {
        Book[] bookshelf2 = new Book[20];
        for (Book item : books) {
            bookshelf2[booksCounter] = item;
            booksCounter++;
        }
        return bookshelf2;
    }

    public void printBooks() {
        for (Book elem : currentBookshelfArray) {
            System.out.println(elem.toString());
        }
    }

    public void addBook(Book bookObject) {
        bookshelf[booksCounter] = bookObject;
        booksCounter++;
    }

    public Book[] getBooks() {
        return currentBookshelf();
    }

    public void setBooks(Book[] booksToSet) {
        this.currentBookshelfArray = booksToSet;
    }

    public Book[] getCurrentBookshelfArray() {
        return currentBookshelfArray;
    }

    public void setBooksCost(double cost) {
        for (Book book : currentBookshelfArray) {
            book.setCost(cost);
        }
    }

    public Book[] searchByYear(int year) {
        Book[] books1 = new Book[currentBookshelfArray.length];
        int count = 0;
        for (Book elem : currentBookshelfArray) {
            if (elem.getYearOfPublishing() > year) {
                books1[count] = elem;
                count++;
            }
        }
        return Arrays.copyOf(books1, count);
    }

    public Book[] searchByAuthor(String author) {
        Book[] books2 = new Book[currentBookshelfArray.length];
        int count2 = 0;
        for (Book elem : currentBookshelfArray) {
            if (elem.getAuthor().toLowerCase().equals(author.toLowerCase())) {
                books2[count2] = elem;
                count2++;
            }
        }
        return Arrays.copyOf(books2, count2);
    }

    public void sortByAuthor() {
        Book[] sortedArray = currentBookshelfArray;
        Arrays.sort(sortedArray, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                String author1 = ((Book) o1).getAuthor();
                String author2 = ((Book) o2).getAuthor();
                return author1.compareTo(author2);
            }
        });
    }

    public Book[] sortByPrice() {
        Arrays.sort(currentBookshelfArray, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return Double.compare(((Book) o1).getCost(), ((Book) o2).getCost());
            }
        });
        return descendOrderSorter(currentBookshelfArray);
    }

    private Book[] descendOrderSorter(Book[] arrayToSort) {
        for (int i = 0; i < arrayToSort.length / 2; i++) {
            Book tmp = arrayToSort[i];
            arrayToSort[i] = arrayToSort[arrayToSort.length - i - 1];
            arrayToSort[arrayToSort.length - i - 1] = tmp;
        }
        return arrayToSort;
    }

    public void sortByPublishingHouse() {
        Book[] sortedArray = currentBookshelfArray;
        Arrays.sort(sortedArray, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                String publishingHouse = ((Book) o1).getPublishingHouse();
                String publishingHouse2 = ((Book) o2).getPublishingHouse();
                return publishingHouse.compareTo(publishingHouse2);
            }
        });
    }
}
