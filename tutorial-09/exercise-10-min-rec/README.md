# Exercise 10-10 – MinRec

## Description

Write a recursive method `MinRec` that takes an array of integers and finds the smallest value in the array.

The method must be recursive and must not use any additional arrays.

## Example

Given:

```text
a = {1, 2, 3, 4}
b = {5, 2}
c = {6, 6}
```

The program should display:

```text
1
2
6
```

## Algorithm

The method uses recursion to find the smallest value.

1. Start with the first element of the array.
2. Recursively find the smallest value in the remaining elements.
3. Compare the current element with the smallest value returned by the recursive call.
4. Return whichever value is smaller.
5. Stop when the last element is reached.

## Base Case

The recursion stops when the current position is the last element:

```java
if (index == array.length - 1) {
    return array[index];
}
```

A single remaining element is automatically the smallest value of that remaining part of the array.

## Recursive Case

The method recursively examines the remaining elements:

```java
int smallestOfRest = MinRecWithoutFirst(array, index + 1);
```

It then compares the current element with the result:

```java
if (array[index] < smallestOfRest) {
    return array[index];
} else {
    return smallestOfRest;
}
```

## Example Walkthrough

For:

```text
{1, 2, 3, 4}
```

The recursive calls eventually reach:

```text
4
```

Then the comparisons work backwards:

```text
3 compared with 4 → 3
2 compared with 3 → 2
1 compared with 2 → 1
```

Therefore, the smallest value is:

```text
1
```

## Additional Arrays

The exercise specifically states that additional arrays are not allowed.

The solution does not create or modify another array. It uses the original array and an index to recursively move through the elements.

## Concepts Used

* Recursion
* Base case
* Recursive case
* Integer arrays
* Array indexing
* Comparison
* Private helper method

## Complexity

For an array containing `n` elements:

* **Time Complexity:** `O(n)`
* **Space Complexity:** `O(n)` due to the recursive call stack.

Each element is examined once.

## Compile and Run

From the exercise directory:

```bash
javac src/main/java/MinRec.java
java -cp src/main/java MinRec
```

## Expected Output

```text
1
2
6
```
