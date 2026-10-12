# Tutorial 11 — Exercise 1-3: Two-Dimensional Array Evaluation

## Description

Given a possibly ragged two-dimensional array of Boolean values, evaluate the array using two logical operations:

1. **Conjunction (AND):** The value of each row is the logical AND of all elements in that row.
2. **Disjunction (OR):** The value of the complete array is the logical OR of all row results.

The array evaluates to `true` if at least one row contains only `true` values.

## Folder Structure

```text
exercise-03-two-dimensional-array-evaluation/
├── README.md
└── src/main/java/
    └── TwoDimensionalArrayEvaluation.java
```

## Methods

### 1. `rowConjunction()`

```java
public static boolean rowConjunction(boolean[] row)
```

Evaluates one row using logical AND.

Returns `true` if all elements in the row are `true`. Otherwise, returns `false`.

An empty row evaluates to `true`, following the mathematical convention for an empty conjunction.

### 2. `evaluate()`

```java
public static boolean evaluate(boolean[][] array)
```

Evaluates each row using `rowConjunction()` and combines the row results using logical OR.

Returns `true` if at least one row evaluates to `true`.

An empty array evaluates to `false`, following the mathematical convention for an empty disjunction.

### 3. `displayRowResults()`

```java
public static void displayRowResults(boolean[][] array)
```

Displays the Boolean evaluation result of every row.

This method is included to help demonstrate and test the solution.

## Example

### Input

```java
boolean[][] array = {
    {true, true, false},
    {true, true},
    {false, false, false}
};
```

### Row Evaluation

```text
Row 0: false
Row 1: true
Row 2: false
```

### Overall Result

```text
true
```

The overall result is `true` because Row 1 contains only `true` values.

## Key Concepts

- Two-dimensional Boolean arrays (`boolean[][]`).
- Ragged arrays.
- Logical conjunction (`&&`).
- Logical disjunction (`||`).
- Nested array structures.
- Helper methods.
- Boolean return values.
- Empty conjunctions and disjunctions.

## Complexity Analysis

Let `R` be the number of rows and `N` the total number of Boolean elements across all rows.

- `rowConjunction()`: O(k), where `k` is the number of elements in the row.
- `evaluate()`: O(R + N), because each row and each element is processed.
- `displayRowResults()`: O(R + N).

**Overall time complexity:** O(R + N).

The evaluation methods use O(1) auxiliary space, excluding the input array.

## Compile and Run

From the exercise directory:

```bash
javac src/main/java/TwoDimensionalArrayEvaluation.java
java -cp src/main/java TwoDimensionalArrayEvaluation
```