# Exercise 3-5 – Weighted Score

## Objective

Write a Java program that calculates the weighted score for one test based on its assigned percentage contribution toward the final course mark.

---

## Problem Statement

A course consists of six tests. Each test contributes a different percentage toward the final mark.

The program should:

1. Read the test number (1–6).
2. Read the student's score (0–100).
3. Calculate the weighted score using the corresponding weighting.
4. Display the weighted score.

---

## Test Weightings

| Test | Weight |
|------:|-------:|
| 1 | 10% |
| 2 | 20% |
| 3 | 20% |
| 4 | 15% |
| 5 | 15% |
| 6 | 20% |

---

## Formula

```text
Weighted Score = Score × Weight
```

Example

```text
Test 2
Score = 80

Weighted Score = 80 × 0.20 = 16
```

---

## Algorithm

1. Read the test number.
2. Read the score.
3. Validate the score.
4. Determine the corresponding weight using a switch statement.
5. Calculate the weighted score.
6. Display the result.

---

## Pseudocode

```text
BEGIN

INPUT testNumber

INPUT score

IF score is invalid

    DISPLAY error

ELSE

    SWITCH(testNumber)

        assign weight

    weightedScore = score × weight

    DISPLAY weightedScore

END
```

---

## Sample Execution

### Example 1

Input

```text
Test Number: 4

Score: 90
```

Output

```text
Weighted Score = 13.5
```

---

### Example 2

Input

```text
Test Number: 1

Score: 75
```

Output

```text
Weighted Score = 7.5
```

---

## Test Cases

| Test | Score | Expected |
|------:|------:|---------:|
|1|100|10|
|2|80|16|
|3|65|13|
|4|90|13.5|
|5|70|10.5|
|6|95|19|

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
- Variables
- Input validation
- Arithmetic expressions

---

## Source Code

```text
src/main/java/WeightedScore.java
```

---

## Lessons Learned

- A switch statement is useful when selecting one value from a fixed set of options.
- Storing the weight in a variable reduces repeated calculations.
- Validating user input improves program reliability.