# Exercise 2 – Time Conversion

## Objective

Develop a Java program that converts a given duration in seconds into its equivalent number of hours, minutes, and remaining seconds.

---

## Problem Statement

Write an algorithm that accepts a time value in **seconds** and displays the equivalent:

- Hours
- Minutes
- Remaining seconds

### Assumptions

- 1 hour = 60 minutes
- 1 minute = 60 seconds

---

## Mathematical Approach

The conversion relies on integer division and the modulus (`%`) operator.

### Formula

```text
hours = totalSeconds / 3600

remainingSeconds = totalSeconds % 3600

minutes = remainingSeconds / 60

seconds = remainingSeconds % 60
```

---

## Algorithm

1. Start.
2. Prompt the user to enter the total number of seconds.
3. Read the input.
4. Compute the number of hours.
5. Compute the remaining seconds after removing complete hours.
6. Compute the number of minutes.
7. Compute the remaining seconds.
8. Display the results.
9. End.

---

## Pseudocode

```text
BEGIN

INPUT totalSeconds

hours = totalSeconds / 3600

remaining = totalSeconds % 3600

minutes = remaining / 60

seconds = remaining % 60

DISPLAY hours

DISPLAY minutes

DISPLAY seconds

END
```

---

## Example Execution

### Example 1

Input

```text
3671
```

Output

```text
Hours   : 1
Minutes : 1
Seconds : 11
```

---

### Example 2

Input

```text
59
```

Output

```text
Hours   : 0
Minutes : 0
Seconds : 59
```

---

### Example 3

Input

```text
7200
```

Output

```text
Hours   : 2
Minutes : 0
Seconds : 0
```

---

## Time Complexity

| Operation | Complexity |
|----------|------------|
| Arithmetic operations | O(1) |

Overall complexity:

```text
O(1)
```

---

## Space Complexity

```text
O(1)
```

Only a fixed number of integer variables are used.

---

## Java Concepts Demonstrated

- Variables
- Integer arithmetic
- Integer division
- Modulus operator
- User input with `Scanner`
- Console output

---

## Source Code

See:

```text
src/main/java/TimeConversion.java
```

---

## Lessons Learned

- Integer division discards the fractional part.
- The modulus operator returns the remainder after division.
- Large units (hours) should be computed before smaller units (minutes and seconds).