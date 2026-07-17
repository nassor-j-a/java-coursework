# Exercise 3-14 – Letter Grades

## Objective

Write a Java program that reads a student's marks and determines the corresponding letter grade.

---

## Problem Statement

The grading policy is:

| Marks | Grade |
|------:|:-----:|
|85–100|A|
|74–84|B|
|60–73|C|
|50–59|D|
|0–49|F|

The program must also validate the input.

A student's marks:

- cannot be less than **0**
- cannot exceed **105**

If the input is outside this range, display an error message.

---

## Algorithm

1. Read the student's marks.
2. Verify the marks are between 0 and 105.
3. Determine the grade.
4. Display the result.

---

## Pseudocode

```text
BEGIN

INPUT marks

IF marks < 0 OR marks > 105

    DISPLAY "Invalid Marks"

ELSE IF marks >= 85

    DISPLAY "Grade A"

ELSE IF marks >= 74

    DISPLAY "Grade B"

ELSE IF marks >= 60

    DISPLAY "Grade C"

ELSE IF marks >= 50

    DISPLAY "Grade D"

ELSE

    DISPLAY "Grade F"

END
```

---

## Sample Execution

### Example 1

Input

```text
Marks: 90
```

Output

```text
Grade A
```

---

### Example 2

Input

```text
Marks: 63
```

Output

```text
Grade C
```

---

### Example 3

Input

```text
Marks: 120
```

Output

```text
Invalid marks entered.
```

---

## Test Cases

| Marks | Expected |
|------:|----------|
|105|A|
|100|A|
|85|A|
|84|B|
|74|B|
|73|C|
|60|C|
|59|D|
|50|D|
|49|F|
|0|F|
|-5|Invalid|
|106|Invalid|

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

- if-else statements
- Nested conditions
- Input validation
- Ternary operator (alternative solution)

---

## Source Code

```text
src/main/java/LetterGrades.java
```

---

## Lessons Learned

- Validate user input before processing it.
- Arrange conditional statements from highest grade to lowest to avoid overlapping ranges.
- The ternary operator can simplify straightforward decision-making, though an if-else chain may be easier to read for beginners.