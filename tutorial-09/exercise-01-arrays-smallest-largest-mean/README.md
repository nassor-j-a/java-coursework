# Exercise 10-1 – Arrays: Smallest Value, Largest Value, Arithmetic Mean

## Objective

Write a Java program that uses an array of numbers to:

1. Find the smallest value.
2. Find the largest value.
3. Find the positions of the smallest and largest values.
4. Calculate the arithmetic mean of the numbers.

---

## Problem Statement

Given a series of numbers:

### Part (a)

Compute the smallest and largest values.

### Part (b)

Modify the program to also display the positions of the smallest and largest values.

### Part (c)

Modify the program to calculate the arithmetic mean of the numbers.

---

## Algorithm

1. Ask the user for the number of values.
2. Create an integer array with that size.
3. Read the values from the user and store them in the array.
4. Assume the first array element is initially the smallest value.
5. Compare each remaining element with the current smallest value.
6. Update the smallest value when a smaller value is found.
7. Repeat the same process to find the largest value.
8. Track the index of the smallest and largest values.
9. Add all values together to calculate their sum.
10. Divide the sum by the number of values to calculate the arithmetic mean.
11. Display the results.

---

## Example

### Sample Input

```text
Enter the number of values: 5
Enter value 1: 15
Enter value 2: 8
Enter value 3: 23
Enter value 4: 4
Enter value 5: 17
```

### Sample Output

```text
Smallest value: 4
Largest value: 23
Position of smallest value: 3
Position of largest value: 2
Arithmetic mean: 13.4
```

The positions above use Java's zero-based array indexing.

---

## Methods

### `findSmallest()`

Finds and returns the smallest value in the array.

```java
public static int findSmallest(int[] numbers)
```

The first element is used as the initial smallest value.

```text
smallest = numbers[0]
```

The remaining elements are then compared with it.

---

### `findLargest()`

Finds and returns the largest value in the array.

```java
public static int findLargest(int[] numbers)
```

The first element is initially treated as the largest value. Each remaining element is compared with it.

---

### `findSmallestPosition()`

Returns the array index containing the smallest value.

```java
public static int findSmallestPosition(int[] numbers)
```

The variable stores the **index**, rather than the actual smallest value.

---

### `findLargestPosition()`

Returns the array index containing the largest value.

```java
public static int findLargestPosition(int[] numbers)
```

The method tracks the index of the largest element.

---

### `calculateMean()`

Calculates the arithmetic mean.

```java
public static double calculateMean(int[] numbers)
```

The calculation is:

```text
Arithmetic Mean = Sum of all values / Number of values
```

The sum is stored as an integer, but the division is converted to `double` so that the result can contain a decimal value.

---

## Concepts Practiced

* Arrays
* Array indexing
* `for` loops
* Methods
* Searching an array
* Finding minimum and maximum values
* Tracking array positions
* Accumulating a sum
* Arithmetic mean
* Type casting from `int` to `double`
* `Scanner` input

---

## Time Complexity

The program makes several separate passes through the array.

Each search takes:

```text
O(n)
```

The complete program therefore still has linear time complexity:

```text
O(n)
```

The array requires:

```text
O(n)
```

space.

---

## Compilation and Execution

From the exercise directory:

```bash
cd tutorial-09/exercise-01-arrays-smallest-largest-mean
javac src/main/java/SmallestLargestMean.java
java -cp src/main/java SmallestLargestMean
```
