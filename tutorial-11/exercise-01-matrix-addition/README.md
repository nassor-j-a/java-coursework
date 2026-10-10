# Tutorial 11 — Exercise 1-1: Matrix Addition

## Description

Matrix addition involves adding corresponding elements from two matrices to produce a third matrix.

Given matrices `A`, `B`, and `C`, the method must determine whether one matrix is the sum of the other two.

The following combinations must be checked:

- `A + B = C`
- `A + C = B`
- `B + C = A`

The matrices must have compatible dimensions for addition.

## Folder Structure

```text
exercise-01-matrix-addition/
├── README.md
└── src/main/java/
    └── MatrixAddition.java
```

## Methods

### 1. `sameDimensions()`

```java
public static boolean sameDimensions(double[][] a, double[][] b)
```

Checks whether two matrices have the same number of rows and the same number of columns in each corresponding row.

Returns `true` if the dimensions match and `false` otherwise.

### 2. `isSumOf()`

```java
public static boolean isSumOf(
        double[][] a, double[][] b, double[][] result)
```

Checks whether adding matrices `a` and `b` produces `result`.

The method compares every corresponding element:

```text
a[i][j] + b[i][j] = result[i][j]
```

If any element does not match, the method returns `false`.

A small tolerance is used when comparing `double` values.

### 3. `matrixAddition()`

```java
public static boolean matrixAddition(
        double[][] a, double[][] b, double[][] c)
```

Checks all three possible combinations by calling `isSumOf()`.

Returns `true` if at least one combination represents valid matrix addition; otherwise, returns `false`.

## Example

### Input Matrices

```text
A:
1  2  3
4  5  6
7  8  9

B:
10  20  30
40  50  60
70  80  90

C:
11  22  33
44  55  66
77  88  99
```

Since `A + B = C`, the method returns `true`.

### Expected Output

```text
One matrix is the sum of the other two.
```

## Key Concepts

- Two-dimensional arrays (`double[][]`).
- Nested `for` loops for traversing matrix elements.
- Method decomposition: breaking a problem into smaller methods.
- Boolean return values.
- Matrix dimension validation.
- Floating-point comparison using a tolerance.
- Reusing helper methods.

## Complexity Analysis

Let `r` be the number of rows and `c` the number of columns.

- `sameDimensions()`: O(r + c) for rectangular matrices.
- `isSumOf()`: O(r × c), since each matrix element is checked at most once.
- `matrixAddition()`: O(r × c), because at most three combinations are checked.

**Overall time complexity:** O(r × c).

The methods use constant auxiliary space apart from the input matrices.

## Compile and Run

From the exercise directory:

```bash
javac src/main/java/MatrixAddition.java
java -cp src/main/java MatrixAddition
```