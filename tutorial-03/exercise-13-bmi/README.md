# Exercise 3-13 – Body Mass Index (BMI)

## Objective

Write a Java program that calculates a person's Body Mass Index (BMI) and classifies them as underweight, fit, or overweight.

---

## Problem Statement

The Body Mass Index (BMI) is calculated using the formula:

```text
BMI = Weight / Height²
```

where:

- Weight is measured in kilograms (kg).
- Height is measured in metres (m).

The program should:

1. Read the user's weight.
2. Read the user's height.
3. Calculate the BMI.
4. Display the BMI category.

---

## BMI Categories

| BMI | Category |
|----:|----------|
| BMI ≤ 18.5 | Underweight |
| 18.5 < BMI ≤ 25 | Fit |
| BMI > 25 | Overweight |

---

## Algorithm

1. Read the weight.
2. Read the height.
3. Calculate BMI.
4. Compare the BMI with the category limits.
5. Display the result.

---

## Pseudocode

```text
BEGIN

INPUT weight

INPUT height

BMI = weight / (height × height)

IF BMI ≤ 18.5

    DISPLAY "Underweight"

ELSE IF BMI ≤ 25

    DISPLAY "Fit"

ELSE

    DISPLAY "Overweight"

END
```

---

## Sample Execution

### Example 1

Input

```text
Weight: 60

Height: 1.75
```

Output

```text
BMI = 19.59

You are fit.
```

---

### Example 2

Input

```text
Weight: 45

Height: 1.70
```

Output

```text
BMI = 15.57

You are underweight.
```

---

### Example 3

Input

```text
Weight: 90

Height: 1.70
```

Output

```text
BMI = 31.14

You are overweight.
```

---

## Test Cases

| Weight (kg) | Height (m) | BMI | Category |
|------------:|-----------:|----:|----------|
|45|1.70|15.57|Underweight|
|60|1.75|19.59|Fit|
|80|1.80|24.69|Fit|
|90|1.70|31.14|Overweight|
|110|1.75|35.92|Overweight|

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

- Arithmetic calculations
- if-else statements
- User input using Scanner

---

## Source Code

```text
src/main/java/BMI.java
```

---

## Lessons Learned

- BMI is calculated by dividing weight by the square of the height.
- Conditional statements allow values to be classified into ranges.
- Using descriptive variable names improves code readability.