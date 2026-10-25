package main.java;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // Create some books
        Book book1 = new Book("Clean Code", "Robert C. Martin", 2008, 35.00);
        Book book2 = new Book("Effective Java", "Joshua Bloch", 2018, 40.00);
        Book book3 = new Book("The Clean Coder", "Robert C. Martin", 2011, 30.00);

        // Create the initial list of books
        ArrayList<Book> initialBooks = new ArrayList<>();

        initialBooks.add(book1);
        initialBooks.add(book2);
        initialBooks.add(book3);

        // Create the library
        Library library = new Library(initialBooks);

        // Display all books
        System.out.println("===== LIBRARY BOOKS =====");
        library.printBooks();

        // Find all books written by Robert C. Martin
        System.out.println("\n===== BOOKS BY ROBERT C. MARTIN =====");

        ArrayList<Book> authorBooks =
                library.allBooksWrittenBy("Robert C. Martin");

        for (Book book : authorBooks) {
            System.out.println(book);
        }

        // Calculate the total price
        System.out.println("\n===== TOTAL PRICE =====");
        System.out.printf("Total price: %.2f%n", library.getTotalPrices());

        // Create additional books, including a duplicate
        ArrayList<Book> additionalBooks = new ArrayList<>();

        additionalBooks.add(
                new Book("Introduction to Algorithms",
                        "Thomas H. Cormen", 2009, 50.00));

        // Duplicate: same title, author, and publication year as book1
        additionalBooks.add(
                new Book("Clean Code", "Robert C. Martin", 2008, 35.00));

        // Add the new books
        System.out.println("\n===== ADDING BOOKS =====");
        library.addBooks(additionalBooks);

        // Display the updated library
        System.out.println("\n===== UPDATED LIBRARY =====");
        library.printBooks();

        // Display the final number of books and total price
        System.out.println("\n===== FINAL SUMMARY =====");
        System.out.println("Number of books: " + library.getNumberOfBooks());
        System.out.printf("Total price: %.2f%n", library.getTotalPrices());
    }
}
