# Exercise 3-4 – Simple Calculator

## Objective

Design a simple calculator that performs one of five arithmetic operations on two rational numbers.

The program should be implemented twice:

1. Using an `if-else if` statement.
2. Using a `switch` statement.

---

## Problem Statement

Write a Java program that reads:

- First number
- Second number
- Arithmetic operator

Supported operators are:

| Operator | Operation |
|----------|-----------|
| + | Addition |
| - | Subtraction |
| * | Multiplication |
| / | Division |
| % | Remainder (Modulus) |

---

## Algorithm

1. Read the first number.
2. Read the second number.
3. Read the operator.
4. Determine the requested operation.
5. Calculate the result.
6. Display the answer.

---

## Pseudocode

```text
BEGIN

INPUT number1
INPUT number2
INPUT operator

IF operator is +
    add

ELSE IF operator is -

...

DISPLAY result

END
```

---

## Sample Execution

### Example 1

Input

```text
First Number : 15

Second Number : 5

Operator : *
```

Output

```text
Result = 75.0
```

---

### Example 2

Input

```text
First Number : 20

Second Number : 8

Operator : %
```

Output

```text
Result = 4.0
```

---

## Test Cases

| First | Second | Operator | Result |
|------:|-------:|:--------:|-------:|
| 5 | 4 | + | 9 |
| 5 | 4 | - | 1 |
| 5 | 4 | * | 20 |
| 12 | 3 | / | 4 |
| 17 | 5 | % | 2 |

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

- Scanner
- if–else if
- switch statement
- Arithmetic operators
- Character input

---

## Comparison

### if Statement

Advantages

- Better for complex conditions.
- Can evaluate ranges and logical expressions.

Disadvantages

- Long chains become harder to read.

---

### switch Statement

Advantages

- Cleaner when selecting one option from many.
- Easier to maintain.
- Better readability.

Disadvantages

- Only works when comparing discrete values.

---

## Which is Better?

For this exercise, the **switch statement** is the better choice because the program selects one operation from a fixed set of operators (`+`, `-`, `*`, `/`, `%`).

It is shorter, easier to read, and easier to maintain than a long chain of `if-else if` statements.

---

## Source Code

```text
src/main/java/CalculatorIf.java

src/main/java/CalculatorSwitch.java
```

---

## Lessons Learned

- Different control structures can solve the same problem.
- `switch` is preferred when choosing from a fixed number of known values.
- `if` is more flexible for complex decision making.