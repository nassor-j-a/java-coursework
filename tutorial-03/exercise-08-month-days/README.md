# Exercise 3-8 – Number of Days in a Month

## Objective

Write a Java program that reads a month number and displays the number of days in that month.

---

## Problem Statement

Develop a Java program that:

1. Reads a month number (1–12).
2. Determines the number of days in the selected month.
3. Displays the result.

For this exercise, February is assumed to have **28 days** (leap years are not considered).

---

## Month Reference

| Month | Days |
|------:|-----:|
| January | 31 |
| February | 28 |
| March | 31 |
| April | 30 |
| May | 31 |
| June | 30 |
| July | 31 |
| August | 31 |
| September | 30 |
| October | 31 |
| November | 30 |
| December | 31 |

---

## Algorithm

1. Read the month number.
2. Use a switch statement.
3. Print the corresponding number of days.
4. Display an error message if the month is invalid.

---

## Pseudocode

```text
BEGIN

INPUT month

SWITCH(month)

    CASE 1,3,5,7,8,10,12
        DISPLAY 31

    CASE 4,6,9,11
        DISPLAY 30

    CASE 2
        DISPLAY 28

    DEFAULT
        DISPLAY Invalid Month

END
```

---

## Sample Execution

### Example 1

Input

```text
Month: 5
```

Output

```text
May has 31 days.
```

---

### Example 2

Input

```text
Month: 2
```

Output

```text
February has 28 days.
```

---

### Example 3

Input

```text
Month: 15
```

Output

```text
Invalid month number.
```

---

## Test Cases

| Month | Expected Output |
|------:|-----------------|
|1|31 days|
|2|28 days|
|4|30 days|
|8|31 days|
|11|30 days|
|12|31 days|
|13|Invalid month|

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

- switch statement
- Multiple case labels
- User input with Scanner

---

## Source Code

```text
src/main/java/MonthDays.java
```

---

## Lessons Learned

- A switch statement is well suited for selecting from a fixed number of options.
- Multiple cases can execute the same statement.
- Input validation prevents invalid month numbers from being processed.