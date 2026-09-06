# Exercise 10-2 – Palindrome

## Objective

Write a Java program that tests whether the elements of a character array form a palindrome.

A palindrome is a sequence that reads the same forwards and backwards.

Examples:

```text
radar
noon
anna
```

The word `radar` is stored as:

```java
{'r', 'a', 'd', 'a', 'r'}
```

---

## Problem Statement

Write a Java program that determines whether the elements of an array of characters form a palindrome.

For example:

```java
char[] word = {'r', 'a', 'd', 'a', 'r'};
```

The program should determine that the array is a palindrome.

---

## Algorithm

1. Start with the first character.
2. Compare it with the last character.
3. Move to the second character.
4. Compare it with the second-to-last character.
5. Continue until the middle of the array is reached.
6. If any pair of characters is different, return `false`.
7. If all pairs match, return `true`.

Only half of the array needs to be checked because every comparison checks two positions at the same time.

---

## Example

### Input

```java
char[] word = {'r', 'a', 'd', 'a', 'r'};
```

### Comparisons

```text
r == r
a == a
d == d
```

The array is a palindrome.

### Output

```text
The array is a palindrome.
```

---

## `isPalindrome()` Method

```java
public static boolean isPalindrome(char[] characters)
```

The method accepts a character array and returns:

* `true` if the array is a palindrome.
* `false` if the array is not a palindrome.

The comparison is performed using:

```java
characters[i] != characters[characters.length - 1 - i]
```

The expression:

```java
characters.length - 1 - i
```

calculates the index from the opposite end of the array.

---

## Why `length / 2`?

The loop is:

```java
for (int i = 0; i < characters.length / 2; i++)
```

There is no need to compare the entire array.

For example:

```text
Index:      0   1   2   3   4
Character:  r   a   d   a   r
```

We compare:

```text
index 0 ↔ index 4
index 1 ↔ index 3
```

The middle character at index `2` does not need to be compared with itself.

---

## Concepts Practiced

* Character arrays
* Array indexing
* `for` loops
* Methods
* Boolean return values
* Comparing elements from opposite ends of an array
* Early return using `return false`

---

## Time Complexity

The method checks approximately half of the array.

Therefore:

```text
Time:  O(n)
Space: O(1)
```

The method does not create another array or `String`.

---

## Compilation and Execution

From the exercise directory:

```bash
cd tutorial-09/exercise-02-palindrome
javac src/main/java/Palindrome.java
java -cp src/main/java Palindrome
```
