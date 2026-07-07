# Exercise 3-1 – Division Check

## Objective

Write a Java program that reads an integer and determines whether the number is:

- Zero
- Divisible by both 3 and 5
- Not divisible by both 3 and 5

---

## Problem Statement

Develop a Java program that accepts an integer from the user and checks:

1. If the number is zero.
2. Otherwise, if it is divisible by both 3 and 5.
3. If neither condition is true, indicate that the number is not divisible by both 3 and 5.

---

## Mathematical Concept

A number is divisible by another number if the remainder after division is zero.

```text
number % divisor == 0
```

To be divisible by both 3 and 5:

```text
(number % 3 == 0) AND (number % 5 == 0)
```

---

## Algorithm

1. Start.
2. Read an integer from the user.
3. If the number equals 0:
   - Display "The number is zero."
4. Otherwise, if the number is divisible by both 3 and 5:
   - Display "The number is divisible by both 3 and 5."
5. Otherwise:
   - Display "The number is not divisible by both 3 and 5."
6. End.

---

## Pseudocode

```text
BEGIN

INPUT number

IF number == 0 THEN
    DISPLAY "The number is zero"

ELSE IF number MOD 3 == 0
    AND number MOD 5 == 0 THEN
    DISPLAY "Divisible by both 3 and 5"

ELSE
    DISPLAY "Not divisible by both 3 and 5"

END IF

END
```

---

## Flowchart

```text
          +-------+
          | Start |
          +-------+
               |
               v
        Read integer
               |
               v
      Is number == 0?
         /          \
      Yes            No
      |               |
      v               v
Print "Zero"   Divisible by 3 and 5?
                     /       \
                  Yes         No
                  |            |
                  v            v
          Print Divisible   Print Not Divisible
                  |
                  v
               +-----+
               | End |
               +-----+
```

---

## Sample Executions

### Example 1

Input

```text
0
```

Output

```text
The number is zero.
```

---

### Example 2

Input

```text
30
```

Output

```text
The number is divisible by both 3 and 5.
```

---

### Example 3

Input

```text
18
```

Output

```text
The number is not divisible by both 3 and 5.
```

---

### Example 4

Input

```text
25
```

Output

```text
The number is not divisible by both 3 and 5.
```

---

## Test Cases

| Input | Expected Output |
|------:|-----------------|
| 0 | The number is zero. |
| 15 | Divisible by both 3 and 5 |
| 45 | Divisible by both 3 and 5 |
| 9 | Not divisible by both 3 and 5 |
| 20 | Not divisible by both 3 and 5 |
| -30 | Divisible by both 3 and 5 |

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
- if
- else if
- else
- Logical AND (`&&`)
- Modulus operator (`%`)
- Integer comparison

---

## Source Code

```text
src/main/java/DivisionCheck.java
```

---

## Lessons Learned

- The modulus operator determines divisibility.
- Multiple conditions can be combined using the logical AND operator.
- Checking special cases (such as zero) before other conditions simplifies program logic.