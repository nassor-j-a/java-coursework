# Exercise 10-6 – 1D Array Expand

## Objective

Write a method `expand` that takes an integer array `a` and an integer `n` and returns a new array where every value `x` in the original array is replaced by `n` copies of `x / n`.

---

## Requirements

The method must follow these rules:

### `n > 1`

Each original value is:

1. Divided by `n`.
2. Repeated `n` times.

Example:

```text
a = {21, 8, 15}
n = 3
```

Result:

```text
{7, 7, 7, 2, 2, 2, 5, 5, 5}
```

### `n = 1`

The same array should be returned.

```text
expand(a, 1) → a
```

### `n <= 0`

An empty array should be returned.

```text
expand(a, 0) → {}
expand(a, -1) → {}
```

---

## Example

Given:

```java
int[] a = {21, 8, 15, 0, -3, 32};
```

### `expand(a, 3)`

Each element is divided by `3` and repeated three times:

```text
21 / 3 = 7
8 / 3 = 2
15 / 3 = 5
0 / 3 = 0
-3 / 3 = -1
32 / 3 = 10
```

Therefore:

```text
{7, 7, 7, 2, 2, 2, 5, 5, 5, 0, 0, 0, -1, -1, -1, 10, 10, 10}
```

### `expand(a, 1)`

```text
{21, 8, 15, 0, -3, 32}
```

### `expand(a, 0)`

```text
{}
```

---

## Integer Division

The exercise specifies that fractional components should be truncated.

Because the array contains integers, Java performs integer division:

```text
8 / 3 = 2
32 / 3 = 10
```

No decimal values are stored in the result.

---

## Algorithm

1. Check whether `n` is less than or equal to zero.
2. If so, return an empty array.
3. If `n` is equal to one, return the original array.
4. Create a new array with size:

```text
a.length × n
```

5. Traverse the original array.
6. Divide each element by `n`.
7. Store the resulting value `n` times in the new array.
8. Return the new array.

---

## Example

```text
Original:
[21, 8, 15, 0, -3, 32]

n = 3

Result:
[7, 7, 7, 2, 2, 2, 5, 5, 5, 0, 0, 0, -1, -1, -1, 10, 10, 10]
```

---

## Concepts Practiced

* One-dimensional arrays
* Creating arrays dynamically
* Array traversal
* Nested `for` loops
* Integer division
* Returning arrays from methods
* Special-case handling
* `Arrays.toString()`

---

## Complexity

Let `n` be the number of copies and `a.length` be the original array size.

The resulting array contains:

```text
a.length × n
```

elements.

### Time Complexity

```text
O(a.length × n)
```

### Space Complexity

```text
O(a.length × n)
```

because a new result array is created.

---

## Compilation and Execution

From the exercise directory:

```bash
cd tutorial-09/exercise-06-expand
javac src/main/java/Expand.java
java -cp src/main/java Expand
```
