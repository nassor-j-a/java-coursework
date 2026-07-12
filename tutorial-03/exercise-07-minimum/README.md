# Exercise 3-7 – Minimum of Three Numbers

## Objective

Write a Java program that determines the smallest of three numbers using only the conditional (ternary) operator.

---

## Problem Statement

Develop a Java program that:

1. Reads three integer values.
2. Determines the smallest value.
3. Displays the minimum number.

The solution must use only the conditional (`?:`) operator and should not use `if`, `switch`, or loops.

---

## Conditional Operator

The conditional operator has the following syntax:

```text
condition ? value_if_true : value_if_false
```

It evaluates a condition and returns one of two values.

---

## Algorithm

1. Read three integers.
2. Compare the first and second numbers.
3. Compare the smaller of those with the third number.
4. Display the minimum value.

---

## Pseudocode

```text
BEGIN

INPUT number1
INPUT number2
INPUT number3

minimum =
(number1 < number2)
    ?
        ((number1 < number3) ? number1 : number3)
    :
        ((number2 < number3) ? number2 : number3)

DISPLAY minimum

END
```

---

## Sample Execution

### Example 1

Input

```text
12
45
8
```

Output

```text
The minimum number is: 8
```

---

### Example 2

Input

```text
100
25
70
```

Output

```text
The minimum number is: 25
```

---

### Example 3

Input

```text
5
5
9
```

Output

```text
The minimum number is: 5
```

---

## Test Cases

| Number 1 | Number 2 | Number 3 | Minimum |
|---------:|---------:|---------:|--------:|
| 4 | 7 | 2 | 2 |
| 12 | 5 | 20 | 5 |
| -3 | -8 | -1 | -8 |
| 6 | 6 | 4 | 4 |
| 10 | 10 | 10 | 10 |

---

## Time Complexity

```text
O(1)
```

---

## Space Complexity

```text
O(1)
```

---

## Java Concepts Demonstrated

- Conditional (ternary) operator
- Nested conditional expressions
- User input using `Scanner`

---

## Source Code

```text
src/main/java/Minimum.java
```

---

## Lessons Learned

- The conditional operator can replace simple `if-else` statements.
- Nested conditional operators can determine the minimum or maximum of multiple values.
- Proper formatting improves the readability of nested ternary expressions.