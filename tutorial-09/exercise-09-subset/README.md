# Exercise 10-9 – Subset

## Description

Write a Java method `subset` that takes two arrays of integers as parameters and returns `true` if and only if the first array is a subset of the second array.

The arrays are assumed not to contain duplicates.

## Examples

```text
subset({1, 2, 3}, {1, 2, 3, 5, 6}) → true

subset({1, 2, 3}, {2, 4, 5, 1, 3}) → true

subset({}, {1, 2, 3, 5, 6}) → true

subset({1, 2, 3}, {2, 4, 5, 1}) → false
```

## Definition of a Subset

Array 1 is a subset of Array 2 when **every element in Array 1 is also present in Array 2**.

The order of the elements does not matter.

For example:

```text
Array 1 = {1, 2, 3}
Array 2 = {2, 4, 5, 1, 3}
```

Array 1 is a subset because `1`, `2`, and `3` all occur in Array 2.

## Algorithm

1. If Array 1 is empty, return `true`.
2. Go through every element in Array 1.
3. For each element, search through Array 2.
4. If the element is found, continue to the next element.
5. If an element is not found, immediately return `false`.
6. If all elements are found, return `true`.

## Important Concept

The method does not need to compare the arrays in the same order.

For example:

```text
Array 1 = {1, 2, 3}
Array 2 = {2, 4, 5, 1, 3}
```

The elements appear in different positions, but Array 1 is still a subset.

## Empty Array

An empty array is a subset of every array:

```java
if (array1.length == 0) {
    return true;
}
```

## Concepts Used

* Integer arrays
* Methods
* Nested `for` loops
* Boolean variables
* Array searching
* Conditional statements
* Early `return`

## Complexity

If Array 1 has `n` elements and Array 2 has `m` elements:

* **Worst-case time complexity:** `O(n × m)`
* **Space complexity:** `O(1)` for the subset-checking method.

The nested loops give the `O(n × m)` time complexity because each element of Array 1 may need to be compared with every element of Array 2.

## Compile and Run

From the exercise directory:

```bash
javac src/main/java/Subset.java
java -cp src/main/java Subset
```

## Example Run

```text
Enter the size of Array 1: 3
Enter the elements of Array 1:
1
2
3
Enter the size of Array 2: 5
Enter the elements of Array 2:
2
4
5
1
3
Array 1 is a subset of Array 2
```
