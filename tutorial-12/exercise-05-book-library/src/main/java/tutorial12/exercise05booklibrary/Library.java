package tutorial12.exercise05booklibrary;

import java.util.ArrayList;

public class Library {

    // List of books maintained by the library
    private ArrayList<Book> books;

    // Constructor to initialize the library
    public Library(ArrayList<Book> books) {
        this.books = new ArrayList<>(books);
    }

    // Return all books written by the specified author
    public ArrayList<Book> allBooksWrittenBy(String author) {

        ArrayList<Book> result = new ArrayList<>();

        for (Book book : books) {

            if (book.getAuthor().equalsIgnoreCase(author)) {
                result.add(book);
            }
        }

        return result;
    }

    // Calculate the total price of all books
    public double getTotalPrices() {

        double total = 0.0;

        for (Book book : books) {
            total += book.getPrice();
        }

        return total;
    }

    // Add books without adding duplicates
    public void addBooks(ArrayList<Book> newBooks) {

        for (Book newBook : newBooks) {

            boolean alreadyExists = false;

            // Check whether the book is already in the library
            for (Book existingBook : books) {

                if (sameBook(existingBook, newBook)) {
                    alreadyExists = true;
                    break;
                }
            }

            // Add the book only if it is not already present
            if (!alreadyExists) {
                books.add(newBook);
            }
        }
    }

    // Determine whether two books represent the same book
    private boolean sameBook(Book book1, Book book2) {

        return book1.getTitle().equalsIgnoreCase(book2.getTitle())
                && book1.getAuthor().equalsIgnoreCase(book2.getAuthor())
                && book1.getYearOfPublication() == book2.getYearOfPublication();
    }

    // Display all books in the library
    public void printBooks() {

        if (books.isEmpty()) {
            System.out.println("The library has no books.");
            return;
        }

        for (Book book : books) {
            System.out.println(book);
        }
    }

    // Return the number of books in the library
    public int getNumberOfBooks() {
        return books.size();
    }
}
