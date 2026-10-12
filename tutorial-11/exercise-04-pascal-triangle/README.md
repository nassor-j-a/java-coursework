# Tutorial 11 — Exercise 1-4: Pascal Triangle

## Description

Pascal's triangle is a triangular arrangement of numbers in which:

1. Every border element is `1`.
2. Every other element is the sum of the two adjacent elements directly above it.

Write a Java method `printPascal(int n)` that creates and prints a two-dimensional array representing the first `n` rows of Pascal's triangle.

## Folder Structure

```text
exercise-04-pascal-triangle/
├── README.md
└── src/main/java/
    └── PascalTriangle.java
```

## Method

### `printPascal()`

```java
public static void printPascal(int n)
```

This method:

1. Checks whether the input is valid.
2. Creates a ragged two-dimensional integer array.
3. Initializes each row with `i + 1` elements.
4. Fills the border elements with `1`.
5. Calculates the remaining elements using the two values above them.
6. Prints the triangle.

## Example

### Input

```text
Enter the number of rows: 6
```

### Output

```text
1
1 1
1 2 1
1 3 3 1
1 4 6 4 1
1 5 10 10 5 1
```

## How the Algorithm Works

### 1. Create the rows

Each row has one more element than the previous row.

For example, with `n = 4`:

```text
Row 0: 1 element
Row 1: 2 elements
Row 2: 3 elements
Row 3: 4 elements
```

### 2. Set the border elements

The first and last elements of every row are `1`.

```java
if (j == 0 || j == i) {
    triangle[i][j] = 1;
}
```

### 3. Calculate the remaining elements

Every non-border element is calculated by adding the two adjacent elements from the previous row.

```java
triangle[i][j] =
        triangle[i - 1][j - 1]
        + triangle[i - 1][j];
```

### 4. Print the triangle

Nested loops traverse the rows and their elements.

## Key Concepts

- Two-dimensional arrays (`int[][]`).
- Ragged arrays.
- Nested `for` loops.
- Array initialization.
- Array indexing.
- Conditional statements.
- Building values from previously calculated values.

## Complexity Analysis

Let `n` be the number of rows.

- Creating the rows requires O(n) time.
- Filling the triangle requires O(n²) time.
- Printing the triangle requires O(n²) time.

**Overall time complexity:** O(n²).

**Space complexity:** O(n²), because the triangle stores a total of `n(n + 1) / 2` elements.

## Compile and Run

From the exercise directory:

```bash
javac src/main/java/PascalTriangle.java
java -cp src/main/java PascalTriangle
```