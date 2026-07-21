# Exercise 4-3 – Adder

## Objective

Write a Java program that reads a specified number of integers and calculates their sum.

---

## Problem Statement

The program should:

1. Ask the user how many integers will be entered.
2. Read each integer.
3. Calculate the total sum.
4. Display the result.

---

## Algorithm

1. Read the number of integers.
2. Initialize `sum` to zero.
3. Repeat for the specified number of integers:
   - Read the next integer.
   - Add it to the sum.
4. Display the total sum.

---

## Pseudocode

```text
BEGIN

INPUT totalNumbers

sum ← 0

FOR i ← 1 TO totalNumbers

    INPUT number

    sum ← sum + number

END FOR

DISPLAY sum

END
```

---

## Sample Execution

### Example

```text
How many integers will be added? 5

Enter integer 1: 3
Enter integer 2: 4
Enter integer 3: -4
Enter integer 4: -3
Enter integer 5: 7

The sum is 7
```

---

## Test Cases

| Input | Output |
|------|-------|
|3 → 1 2 3|6|
|4 → 5 5 5 5|20|
|2 → -4 9|5|
|5 → 0 0 0 0 0|0|

---

## Time Complexity

```text
O(n)
```

where **n** is the number of integers entered.

---

## Space Complexity

```text
O(1)
```

Only a few variables are used regardless of the number of inputs.

---

## Java Concepts Demonstrated

- `for` loops
- Accumulator variables
- User input with `Scanner`
- Integer arithmetic

---

## Source Code

```text
src/main/java/Adder.java
```

---

## Lessons Learned

- A loop can process a fixed number of inputs.
- An accumulator variable stores a running total.
- The loop counter can be reused when prompting the user, avoiding unnecessary variables.