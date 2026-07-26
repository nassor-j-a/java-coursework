# Exercise 4-8 – Stream of Numbers

## Objective

Write Java programs that read a sequence of non-negative integers and determine:

- Maximum number
- Minimum number
- Average

Input terminates when the user enters a negative number.

The terminating negative number is **not** included in the calculations.

---

## Requirements

Implement the solution twice:

1. Using a `while` loop.
2. Using a `do-while` loop.

---

## Algorithm

1. Initialize:
   - maximum
   - minimum
   - sum
   - count
2. Read integers until a negative number is entered.
3. Update:
   - maximum
   - minimum
   - sum
   - count
4. Compute the average.
5. Display the results.

---

## Sample Execution

```text
Please enter a sequence of positive numbers

2
3
5
4
-1

The maximum number is : 5
The minimum number is : 2
The average is : 3.5
```

---

## Time Complexity

```
O(n)
```

---

## Space Complexity

```
O(1)
```

---

## Java Concepts Demonstrated

- while loop
- do-while loop
- Sentinel-controlled loops
- Variables
- Conditionals
- Arithmetic operations

---

## Source Code

```
src/main/java/StreamNumbersWhile.java
src/main/java/StreamNumbersDoWhile.java
```