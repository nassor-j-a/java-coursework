# Exercise 10-8 – Shuffle

## Description

Write a method `shuffle` that takes an array of `String` values and returns a new array containing the same elements in a shuffled order.

The original array should not be modified.

## Example

Given:

```text
arr = {"CSEN", "202", "Spring", "2019"}
```

A possible result is:

```text
{"202", "Spring", "CSEN", "2019"}
```

Another valid result could be:

```text
{"Spring", "2019", "202", "CSEN"}
```

Because the array is shuffled randomly, the exact output can be different each time the program runs.

## Algorithm

1. Create a copy of the original array using `clone()`.
2. Start from the last element of the copied array.
3. Generate a random position between `0` and the current position.
4. Swap the current element with the randomly selected element.
5. Continue until the beginning of the array is reached.
6. Return the shuffled array.

This uses the **Fisher-Yates shuffle** algorithm.

## Important Concept

### `clone()`

The method must return a new array, so the original array is copied before shuffling:

```java
String[] shuffled = arr.clone();
```

This means the original array remains unchanged.

### Random Position

```java
int randomPosition = random.nextInt(i + 1);
```

This generates a random integer from `0` through `i`.

## Example Output

One possible run:

```text
Original array 1: [CSEN, 202, Spring, 2019]
Shuffled array 1: [202, Spring, CSEN, 2019]

Original array 2: [Hi, Hello, Welcome]
Shuffled array 2: [Hello, Welcome, Hi]
```

The shuffled results may be different on another run.

## Concepts Used

* String arrays
* Array copying
* `clone()`
* `Random`
* `for` loops
* Swapping array elements
* Methods
* Fisher-Yates shuffle

## Complexity

If the array contains `n` elements:

* **Time Complexity:** `O(n)`
* **Space Complexity:** `O(n)` because a new array is created.

## Compile and Run

From the exercise directory:

```bash
javac src/main/java/Shuffle.java
java -cp src/main/java Shuffle
```
