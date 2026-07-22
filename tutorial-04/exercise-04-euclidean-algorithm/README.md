# Exercise 4-4 – Euclidean Algorithm

## Objective

Write a Java program that finds the Greatest Common Divisor (GCD) of two positive integers using the subtraction-based Euclidean Algorithm.

---

## Problem Statement

The Euclidean Algorithm repeatedly subtracts the smaller number from the larger number until both numbers become equal.

The final value is the Greatest Common Divisor (GCD).

---

## Algorithm

1. Read two positive integers.
2. Store their original values.
3. While the numbers are different:
   - If the first number is larger, subtract the second from it.
   - Otherwise subtract the first from the second.
4. When both numbers become equal, display the result.

---

## Pseudocode

```text
BEGIN

INPUT firstNumber
INPUT secondNumber

STORE original values

WHILE firstNumber ≠ secondNumber

    IF firstNumber > secondNumber

        firstNumber ← firstNumber − secondNumber

    ELSE

        secondNumber ← secondNumber − firstNumber

    ENDIF

END WHILE

DISPLAY GCD

END
```

---

## Sample Execution

### Example 1

```text
Please enter first number: 45
Please enter second number: 22

The GCD of 45 and 22 is 1
```

---

### Example 2

```text
Please enter first number: 24
Please enter second number: 18

The GCD of 24 and 18 is 6
```

---

## Test Cases

| Input | Output |
|------|-------|
|45 22|1|
|24 18|6|
|20 20|20|
|100 25|25|

---

## Time Complexity

```text
O(max(a, b))
```

The subtraction method may require many iterations, especially when the numbers differ greatly.

---

## Space Complexity

```text
O(1)
```

---

## Java Concepts Demonstrated

- `while` loop
- Conditional statements
- Integer arithmetic
- Variable preservation

---

## Source Code

```text
src/main/java/EuclideanAlgorithm.java
```

---

## Lessons Learned

- The Euclidean Algorithm is a classic method for computing the Greatest Common Divisor (GCD).
- Repeated subtraction eventually produces the same result as the more efficient modulus (`%`) version.
- Storing the original input values makes the final output easier to understand.