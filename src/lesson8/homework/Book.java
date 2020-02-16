package lesson8.homework;

public class Book {
    private int id;
    private String bookName;
    private String authorName;
    private String publishingHouse;
    private int yearOfPublishing;
    private int numberOfPages;
    private double cost;

    public Book(int id, String bookName, String authorName, String publishingHouse, int yearOfPublishing, int numberOfPages, double cost) {
        this.id = id;
        this.bookName = bookName;
        this.authorName = authorName;
        this.publishingHouse = publishingHouse;
        this.yearOfPublishing = yearOfPublishing;
        this.numberOfPages = numberOfPages;
        this.cost = cost;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return bookName;
    }

    public void setName(String name) {
        this.bookName = name;
    }

    public String getAuthor() {
        return authorName;
    }

    public void setAuthor(String author) {
        this.authorName = author;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double costInPercents) {
        cost = cost * ((costInPercents / 100) + 1);
    }

    @Override
    public String toString() {
        return "ID: " + id + " name: " + bookName + " author: " + authorName + " publishing house: " +
                publishingHouse + " year of publishing: " + yearOfPublishing + " number of pages: " +
                numberOfPages + " cost: " + cost;
    }
}
