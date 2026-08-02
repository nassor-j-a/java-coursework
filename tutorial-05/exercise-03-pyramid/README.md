# Exercise 5-3 – Pyramid

## Objective

Write a Java program that reads a positive odd integer `n` and prints a centered pyramid of numbers.

---

## Problem Statement

Construct the following pyramid of numbers, where each row starts from `1` and ends at the current odd number.

Example for `n = 9`:

```text
    1
   123
  12345
 1234567
123456789
```

---

## Algorithm

1. Read a positive odd integer `n`.
2. Check that the number is positive and odd.
3. For each odd number from `1` to `n`:
   - Print the required leading spaces.
   - Print the numbers from `1` to the current odd number.
   - Move to the next line.
4. Display an error message if the input is not a positive odd number.

---

## Sample Input

```text
Enter a number: 9
```

## Sample Output

```text
    1
   123
  12345
 1234567
123456789
```

---

## Concepts Practiced

- Nested `for` loops
- Input validation
- Pattern printing
- Console formatting