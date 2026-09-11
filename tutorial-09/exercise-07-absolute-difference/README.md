# Exercise 10-7 – Absolute Difference

## Objective

Write an iterative method `absoluteDifference` that takes an array of floating-point numbers and returns the smallest absolute difference between any pair of numbers in the array.

---

## Problem Statement

The method should find the smallest absolute difference between any two different elements in the array.

For example:

```java
double[] a = {4.5, 3.5, 6.0, 20.0, 3.0};
```

The smallest difference is:

```text
|3.5 - 3.0| = 0.5
```

Therefore:

```text
absoluteDifference(a) → 0.5
```

Another example:

```java
double[] a = {8.2, 3.5, 6.0, 3.5, 20.0};
```

There are two different elements with the value `3.5`.

Therefore:

```text
|3.5 - 3.5| = 0.0
```

and:

```text
absoluteDifference(a) → 0.0
```

---

## Algorithm

1. Set `smallestDifference` to a very large value.
2. Use an outer loop to select the first element of a pair.
3. Use an inner loop to select the second element.
4. Start the inner loop at `i + 1` so that:

   * An element is not compared with itself.
   * The same pair is not checked twice.
5. Calculate the absolute difference between the two values.
6. If the difference is smaller than the current smallest difference, update it.
7. Continue until every pair has been checked.
8. Return the smallest difference.

---

## Absolute Difference

The absolute difference between two numbers is:

```text
|a - b|
```

In Java, this is calculated using:

```java
Math.abs(a - b)
```

For example:

```text
|3.5 - 3.0| = 0.5
```

and:

```text
|3.0 - 3.5| = 0.5
```

The order does not affect the result.

---

## Example 1

### Array

```text
[4.5, 3.5, 6.0, 20.0, 3.0]
```

Relevant pair:

```text
3.5 and 3.0
```

Difference:

```text
|3.5 - 3.0| = 0.5
```

Result:

```text
0.5
```

---

## Example 2

### Array

```text
[8.2, 3.5, 6.0, 3.5, 20.0]
```

The two `3.5` values occur at different positions.

Difference:

```text
|3.5 - 3.5| = 0.0
```

Result:

```text
0.0
```

---

## Why Use `i + 1`?

The nested loops use:

```java
for (int i = 0; i < a.length - 1; i++) {
    for (int j = i + 1; j < a.length; j++) {
```

This means each pair is considered only once.

For example, after checking:

```text
a[1] and a[3]
```

there is no need to check:

```text
a[3] and a[1]
```

because both produce the same absolute difference.

---

## Concepts Practiced

* One-dimensional arrays
* `double` values
* Nested `for` loops
* Iterative algorithms
* Comparing pairs of array elements
* `Math.abs()`
* Tracking a minimum value
* Array indexing
* Methods and return values

---

## Complexity

For an array containing `n` elements, the method compares every unique pair.

The number of comparisons is:

```text
n(n - 1) / 2
```

Therefore:

### Time Complexity

```text
O(n²)
```

### Space Complexity

```text
O(1)
```

The method does not create another array.

---

## Compilation and Execution

From the exercise directory:

```bash
cd tutorial-09/exercise-07-absolute-difference
javac src/main/java/AbsoluteDifference.java
java -cp src/main/java AbsoluteDifference
```
