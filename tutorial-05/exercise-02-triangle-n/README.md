# Exercise 5-2 – Triangle N

## Objective

Write a Java program that reads an integer `n` from the user and prints a triangle of consecutive numbers.

---

## Problem Statement

Construct a triangle shape where each row starts from `1` and ends at the row number.

Example for `n = 6`:

```text
1
12
123
1234
12345
123456
```

---

## Algorithm

1. Read an integer `n`.
2. Use an outer loop from `1` to `n`.
3. For each row, use an inner loop from `1` to the current row number.
4. Print each number without moving to the next line.
5. After each row, print a new line.

---

## Sample Input

```text
Enter a number: 6
```

## Sample Output

```text
1
12
123
1234
12345
123456
```

---

## Concepts Practiced

- Nested `for` loops
- Loop control
- Console output