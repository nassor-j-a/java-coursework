# Tutorial 11 — Exercise 1-2: 2-D Arrays

## Description

Write a Java program that rearranges a two-dimensional integer array so that the row with the highest sum becomes the first row.

The program follows three steps:

1. Calculate the sum of each row.
2. Find the index of the row with the maximum sum.
3. Swap that row with row `0`.

The program supports jagged arrays, meaning the rows may have different lengths.

## Folder Structure

```text
exercise-02-reorder-rows/
├── README.md
└── src/main/java/
    └── ReorderRows.java
```

## Methods

### 1. `rowSum()`

```java
public static int rowSum(int[] row)
```

Calculates and returns the sum of all elements in a given row.

### 2. `indexOfMaxRow()`

```java
public static int indexOfMaxRow(int[][] array)
```

Calculates row sums and returns the index of the row with the highest sum.

The method returns `-1` for an empty array.

If multiple rows share the same maximum sum, the first such row is selected.

### 3. `swapRows()`

```java
public static void swapRows(int[][] array, int row1, int row2)
```

Swaps two rows using a temporary `int[]` reference.

The method does not create a copy of either row.

### 4. `reorderRows()`

```java
public static void reorderRows(int[][] array)
```

Finds the maximum-sum row and swaps it with the first row.

Arrays with fewer than two rows require no changes.

### 5. `displayArray()`

```java
public static void displayArray(int[][] array)
```

Prints the elements of each row on a separate line.

## Example

### Input

```text
1 2 2 3 5
100
2 3 9
```

### Row Sums

| Row | Sum |
|---|---:|
| `{1, 2, 2, 3, 5}` | 13 |
| `{100}` | 100 |
| `{2, 3, 9}` | 14 |

The row with sum `100` is at index `1`.

The program swaps row `1` with row `0`.

### Output

```text
100
1 2 2 3 5
2 3 9
```

## Key Concepts

- Two-dimensional arrays (`int[][]`).
- Jagged arrays and rows of different lengths.
- Traversing arrays with loops.
- Calculating sums.
- Finding a maximum value and its index.
- Swapping array elements—in this case, entire rows.
- Decomposing a problem into helper methods.

## Complexity Analysis

Let `R` be the number of rows and `N` the total number of elements across all rows.

- `rowSum()`: O(k), where `k` is the number of elements in the row.
- `indexOfMaxRow()`: O(R + N), because it visits each row and each element.
- `swapRows()`: O(1), because it swaps two row references.
- `reorderRows()`: O(R + N).

**Overall time complexity:** O(R + N).

The algorithm uses O(1) auxiliary space, excluding the input array.

## Compile and Run

From the exercise directory:

```bash
javac src/main/java/ReorderRows.java
java -cp src/main/java ReorderRows
```