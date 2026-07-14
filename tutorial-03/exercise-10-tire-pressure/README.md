# Exercise 3-10 – Tire Pressure

## Objective

Write a Java program that checks whether the pressure of four vehicle tires is within the acceptable range.

---

## Problem Statement

A vehicle has four tires:

- Right Front
- Left Front
- Right Rear
- Left Rear

The program should:

1. Read the pressure of each tire.
2. Verify that every tire has a pressure between **35 psi** and **45 psi**.
3. Verify that:
   - The two front tires differ by at most **3 psi**.
   - The two rear tires differ by at most **3 psi**.
4. Display whether the tire inflation is acceptable.

---

## Conditions

The inflation is **OK** if:

- Every tire pressure is between **35** and **45 psi**, inclusive.
- Front tire pressure difference ≤ 3 psi.
- Rear tire pressure difference ≤ 3 psi.

Otherwise:

```text
Inflation is NOT OK
```

---

## Algorithm

1. Read the pressure of all four tires.
2. Check that each pressure lies within the allowed range.
3. Calculate the absolute pressure difference for the front tires.
4. Calculate the absolute pressure difference for the rear tires.
5. If all conditions are satisfied, display **Inflation is OK**.
6. Otherwise, display **Inflation is NOT OK**.

---

## Pseudocode

```text
BEGIN

INPUT rightFront
INPUT leftFront
INPUT rightRear
INPUT leftRear

IF all pressures are between 35 and 45

    AND

   |rightFront - leftFront| ≤ 3

    AND

   |rightRear - leftRear| ≤ 3

    DISPLAY "Inflation is OK"

ELSE

    DISPLAY "Inflation is NOT OK"

END
```

---

## Sample Execution

### Example 1

Input

```text
Right Front : 35
Left Front  : 37
Right Rear  : 41
Left Rear   : 44
```

Output

```text
Inflation is OK
```

---

### Example 2

Input

```text
Right Front : 35
Left Front  : 41
Right Rear  : 40
Left Rear   : 42
```

Output

```text
Inflation is NOT OK
```

---

### Example 3

Input

```text
Right Front : 50
Left Front  : 39
Right Rear  : 40
Left Rear   : 40
```

Output

```text
Inflation is NOT OK
```

---

## Test Cases

| RF | LF | RR | LR | Expected |
|---:|---:|---:|---:|----------|
|35|37|41|44|OK|
|35|41|40|42|NOT OK|
|50|39|40|40|NOT OK|
|35|35|35|35|OK|
|44|45|35|38|OK|

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

- if statement
- Logical operators (`&&`)
- Relational operators
- `Math.abs()`
- User input using `Scanner`

---

## Source Code

```text
src/main/java/TirePressure.java
```

---

## Lessons Learned

- Multiple conditions can be combined using logical operators.
- `Math.abs()` simplifies checking the difference between two values.
- Input validation helps determine whether a system meets specified constraints.