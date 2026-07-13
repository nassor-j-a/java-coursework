# Exercise 3-9 – Quadratic Equation

## Objective

Write a Java program that calculates the roots of a quadratic equation using the quadratic formula.

---

## Problem Statement

A quadratic equation has the form:

```text
ax² + bx + c = 0
```

The program should:

1. Read the coefficients `a`, `b`, and `c`.
2. Determine whether real solutions exist.
3. If solutions exist, calculate and display both roots.
4. Otherwise, display:

```text
No Solutions!
```

---

## Quadratic Formula


::contentReference[oaicite:0]{index=0}


The discriminant determines whether the equation has real roots.


::contentReference[oaicite:1]{index=1}


---

## Conditions

No real solutions exist when:

- `a = 0`
- `b² − 4ac < 0`

---

## Algorithm

1. Read `a`, `b`, and `c`.
2. Calculate the discriminant.
3. If `a == 0` or the discriminant is negative:
   - Print **No Solutions!**
4. Otherwise:
   - Compute both roots.
5. Display the roots.

---

## Pseudocode

```text
BEGIN

INPUT a
INPUT b
INPUT c

discriminant = b² - 4ac

IF a == 0 OR discriminant < 0 THEN

    DISPLAY "No Solutions!"

ELSE

    x1 = (-b + √discriminant) / (2a)

    x2 = (-b - √discriminant) / (2a)

    DISPLAY x1

    DISPLAY x2

END IF

END
```

---

## Sample Execution

### Example 1

Input

```text
a = 1

b = -5

c = 6
```

Output

```text
x1 = 3.0

x2 = 2.0
```

---

### Example 2

Input

```text
a = 1

b = 2

c = 5
```

Output

```text
No Solutions!
```

---

### Example 3

Input

```text
a = 0

b = 5

c = 2
```

Output

```text
No Solutions!
```

---

## Test Cases

| a | b | c | Expected |
|--:|--:|--:|----------|
|1|-5|6|3, 2|
|1|2|5|No Solutions|
|0|4|5|No Solutions|
|2|8|8|-2, -2|
|1|-3|2|2, 1|

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

- Mathematical expressions
- `Math.sqrt()`
- if-else statements
- User input using Scanner

---

## Source Code

```text
src/main/java/QuadraticEquation.java
```

---

## Lessons Learned

- The discriminant determines the number of real roots.
- `Math.sqrt()` should only be called for non-negative values.
- Validating input before computation prevents invalid numerical results.