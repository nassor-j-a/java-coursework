# Tutorial 12 — Exercise 2-5: Book and Library

## Problem Description

Implement a `Book` class with the attributes title, author, year of publication, and price.

Implement a `Library` class that maintains a list of books and provides methods to:

- `allBooksWrittenBy(String author)`: Returns all books written by the specified author.
- `getTotalPrices()`: Returns the sum of the prices of all books in the library.
- `addBooks(ArrayList<Book> books)`: Adds books without adding duplicates.

The `Main` class tests the implementation.

## Project Structure

```text
exercise-05-book-library/
├── README.md
└── src/
    └── main/
        └── java/
            ├── Book.java
            ├── Library.java
            └── Main.java
```

## Class Descriptions

### Book

The `Book` class stores:

- `title`: The book's title.
- `author`: The author's name.
- `yearOfPublication`: The publication year.
- `price`: The book's price.

Its constructor initializes all four attributes. Getter methods provide access to their values.

### Library

The `Library` class maintains an `ArrayList<Book>` and implements the required methods.

- `allBooksWrittenBy()` searches the collection by author and returns a new list of matching books.
- `getTotalPrices()` calculates and returns the combined price of all books.
- `addBooks()` adds books that are not already present.
- `printBooks()` displays the library's contents.
- `getNumberOfBooks()` returns the number of books currently stored.

For duplicate detection, two books are considered identical if their titles, authors, and publication years match, ignoring differences in letter case. Their prices are not used to determine identity.

### Main

The `Main` class creates sample books and a library, searches by author, calculates the total price, adds additional books, and tests duplicate prevention.

## Example

Initial library:

```text
Clean Code — 35.00
Effective Java — 40.00
The Clean Coder — 30.00
```

Initial total:

```text
105.00
```

After adding a new book priced at `50.00` and attempting to add a duplicate:

```text
Number of books: 4
Total price: 155.00
```

The duplicate book is ignored.

## How to Compile and Run

From the exercise directory, compile the Java files:

```bash
javac src/main/java/*.java
```

Run the main program:

```bash
java -cp src/main/java Main
```

## Concepts Practised

- Classes, objects, and constructors
- Encapsulation and getter methods
- `ArrayList` collections
- Enhanced `for` loops
- Searching objects by attributes
- Returning collections from methods
- Accumulating numeric totals
- Preventing duplicate entries
- Separating program logic into multiple classes
