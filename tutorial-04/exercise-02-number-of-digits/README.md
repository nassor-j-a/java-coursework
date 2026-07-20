# Exercise 4-2 – Number of Digits

## Objective

Write a Java program that counts the number of digits in a positive integer.

---

## Problem Statement

The program should:

1. Read a positive integer.
2. Count the number of digits.
3. Display the result.

If the number is negative, display an error message.

---

## Algorithm

1. Read the integer.
2. If the number is negative, display an error.
3. If the number is zero, the digit count is 1.
4. Otherwise:
   - Divide the number by 10 repeatedly.
   - Increase the counter after each division.
5. Display the number of digits.

---

## Pseudocode

```text
BEGIN

INPUT number

IF number < 0

    DISPLAY error

ELSE

    IF number = 0

        digits ← 1

    ELSE

        digits ← 0

        WHILE number > 0

            digits ← digits + 1

            number ← number / 10

        END WHILE

    ENDIF

    DISPLAY digits

ENDIF

END
```

---

## Sample Execution

### Example 1

Input

```text
524
```

Output

```text
Number of digits in 524 = 3
```

---

### Example 2

Input

```text
8
```

Output

```text
Number of digits in 8 = 1
```

---

### Example 3

Input

```text
0
```

Output

```text
Number of digits in 0 = 1
```

---

## Test Cases

| Input | Output |
|------:|-------:|
|0|1|
|7|1|
|52|2|
|524|3|
|123456|6|
|-10|Error|

---

## Time Complexity

```text
O(d)
```

where **d** is the number of digits.

---

## Space Complexity

```text
O(1)
```

---

## Java Concepts Demonstrated

- `for` loop
- Integer division
- `if-else`
- Counter variables
- User input using `Scanner`

---

## Source Code

```text
src/main/java/NumberOfDigits.java
```

---

## Lessons Learned

- Integer division by 10 removes the last digit of a number.
- Special cases such as zero should be handled separately.
- Preserving the original input allows it to be displayed after processing.