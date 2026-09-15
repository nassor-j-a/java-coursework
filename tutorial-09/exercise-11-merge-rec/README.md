# Exercise 10-11 – MergeRec

## Description

Write a recursive method `mergeRec` that takes two arrays of integers and displays their elements in an alternating way.

The two arrays can have different lengths.

The method must not use any additional arrays.

## Example

Given:

```text id="g7v7c5"
Array 1 = {1, 8, 3, 4}
Array 2 = {5, 2}
```

The output should be:

```text id="2pn6gk"
1 5 8 2 3 4
```

The elements are displayed by taking one element from the first array, followed by one element from the second array.

When the second array finishes, the remaining elements of the first array are displayed.

## Algorithm

1. Start at index `0`.
2. If an element exists at the current index in Array 1, display it.
3. If an element exists at the current index in Array 2, display it.
4. Recursively call the method using the next index.
5. Stop when both arrays have no more elements at the current index.

## Example Walkthrough

For:

```text id="s7v4nt"
Array 1 = {1, 8, 3, 4}
Array 2 = {5, 2}
```

The recursive calls process the arrays as follows:

```text id="o3j1d6"
index 0 → 1 5
index 1 → 8 2
index 2 → 3
index 3 → 4
index 4 → stop
```

Therefore:

```text id="b9h7n2"
1 5 8 2 3 4
```

## Different Array Lengths

The arrays do not have to contain the same number of elements.

Before accessing an element, the method checks:

```java id="x0w9y6"
if (index < array1.length)
```

and:

```java id="h5p1q3"
if (index < array2.length)
```

This prevents accessing an index that does not exist.

## Base Case

The recursion stops when both arrays have been completely processed:

```java id="n8c2v4"
if (index >= array1.length && index >= array2.length) {
    return;
}
```

## No Additional Arrays

The exercise does not allow additional arrays.

The solution does not create any new arrays. It works directly with the two arrays provided as parameters.

## Concepts Used

* Recursion
* Base case
* Recursive case
* Integer arrays
* Array indexing
* `if` statements
* Different array lengths
* Method overloading

## Complexity

If Array 1 has `n` elements and Array 2 has `m` elements:

* **Time Complexity:** `O(max(n, m))`
* **Space Complexity:** `O(max(n, m))` due to the recursive call stack.
* **Additional Arrays:** None.

## Compile and Run

From the exercise directory:

```bash id="g9r2s1"
javac src/main/java/MergeRec.java
java -cp src/main/java MergeRec
```

## Expected Output

```text id="q5x4w8"
1 5 8 2 3 4
```
