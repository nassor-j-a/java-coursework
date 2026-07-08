# Exercise 3-2 – Cartesian Plane

## Objective

Write a Java program that reads the x and y coordinates of a point and determines whether the point lies in one of the four quadrants, on one of the coordinate axes, or at the origin.

---

## Problem Statement

Develop a Java program that accepts the coordinates `(x, y)` of a point in the Cartesian plane and displays its location.

The program should identify whether the point is:

- In Quadrant I
- In Quadrant II
- In Quadrant III
- In Quadrant IV
- On the X-axis
- On the Y-axis
- At the Origin

---

## Cartesian Plane

```text
          Y
          ↑

     II   |   I
          |
----------+----------→ X
          |
    III   |   IV
          |
```

---

## Decision Rules

| Condition | Result |
|-----------|--------|
| x > 0 and y > 0 | Quadrant I |
| x < 0 and y > 0 | Quadrant II |
| x < 0 and y < 0 | Quadrant III |
| x > 0 and y < 0 | Quadrant IV |
| x == 0 and y == 0 | Origin |
| x == 0 | Y-axis |
| y == 0 | X-axis |

---

## Algorithm

1. Start.
2. Read the x-coordinate.
3. Read the y-coordinate.
4. Check if both coordinates are zero.
5. Otherwise check if the point lies on an axis.
6. Otherwise determine the appropriate quadrant.
7. Display the result.
8. End.

---

## Pseudocode

```text
BEGIN

INPUT x
INPUT y

IF x == 0 AND y == 0
    DISPLAY "Origin"

ELSE IF x == 0
    DISPLAY "Y-axis"

ELSE IF y == 0
    DISPLAY "X-axis"

ELSE IF x > 0 AND y > 0
    DISPLAY "Quadrant I"

ELSE IF x < 0 AND y > 0
    DISPLAY "Quadrant II"

ELSE IF x < 0 AND y < 0
    DISPLAY "Quadrant III"

ELSE
    DISPLAY "Quadrant IV"

END
```

---

## Sample Executions

### Example 1

Input

```text
x = 5
y = 8
```

Output

```text
Point is located in Quadrant I.
```

---

### Example 2

Input

```text
x = -2
y = 6
```

Output

```text
Point is located in Quadrant II.
```

---

### Example 3

Input

```text
x = 0
y = 5
```

Output

```text
Point lies on the Y-axis.
```

---

### Example 4

Input

```text
x = 0
y = 0
```

Output

```text
Point is at the Origin.
```

---

## Test Cases

| x | y | Expected Result |
|--:|--:|----------------|
| 5 | 4 | Quadrant I |
| -5 | 3 | Quadrant II |
| -4 | -6 | Quadrant III |
| 8 | -1 | Quadrant IV |
| 0 | 8 | Y-axis |
| 5 | 0 | X-axis |
| 0 | 0 | Origin |

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

- if–else if ladder
- Relational operators
- Logical operators
- User input with Scanner


---

## Lessons Learned

- Points on an axis do not belong to any quadrant.
- The origin is a special case that should be checked first.
- Decision order is important when multiple conditions overlap.