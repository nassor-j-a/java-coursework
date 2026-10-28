package tutorial12.exercise05booklibrary;

public class Book {

    // Attributes of a book
    private String title;
    private String author;
    private int yearOfPublication;
    private double price;

    // Constructor to initialize all attributes
    public Book(String title, String author, int yearOfPublication, double price) {
        this.title = title;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
        this.price = price;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public double getPrice() {
        return price;
    }

    // Display the book's details
    @Override
    public String toString() {
        return "Title: " + title
                + ", Author: " + author
                + ", Year: " + yearOfPublication
                + ", Price: " + String.format("%.2f", price);
    }
}
