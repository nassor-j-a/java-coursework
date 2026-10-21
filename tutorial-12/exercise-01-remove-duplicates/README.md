# Tutorial 12 — Exercise 2-1: Remove Duplicates

## Description

This program reads 10 integers from the user, stores them in an `ArrayList`, removes duplicate values, and displays the unique values.

The program preserves the order of the first occurrence of each integer.

## Project Structure

```text
exercise-01-remove-duplicates/
├── README.md
└── src/
    └── main/
        └── java/
            └── RemoveDuplicates.java
```

## Implementation

The program uses:

- `Scanner` to read input from the user.
- `ArrayList<Integer>` to store the integers.
- A `for` loop to read exactly 10 integers.
- Nested loops to compare list elements.
- `ArrayList.remove()` to remove duplicate elements.
- `ArrayList.get()` to retrieve elements by index.
- `Integer.equals()` to compare integer values.

## Algorithm

1. Create an empty `ArrayList<Integer>`.
2. Read 10 integers and add them to the list.
3. Display the original list.
4. Use an outer loop to select each element.
5. Use an inner loop to compare the selected element with all subsequent elements.
6. If a duplicate is found, remove it and adjust the inner-loop index.
7. Display the resulting list of unique values.

## Example

Input:

```text
10 20 10 30 20 40 50 30 60 10
```

Original list:

```text
[10, 20, 10, 30, 20, 40, 50, 30, 60, 10]
```

Output:

```text
[10, 20, 30, 40, 50, 60]
```

## Compilation

From the exercise directory:

```bash
javac src/main/java/RemoveDuplicates.java
```

## Execution

```bash
java -cp src/main/java RemoveDuplicates
```

## Concepts Demonstrated

- Java collections.
- ArrayLists.
- Loops and nested loops.
- Conditional statements.
- Removing elements from a list.
- Comparing objects using `equals()`.
- Preserving insertion order while removing duplicates.