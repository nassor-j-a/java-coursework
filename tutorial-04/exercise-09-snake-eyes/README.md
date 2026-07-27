# Exercise 4-9 – Snake Eyes

## Objective

Write a Java program that simulates rolling two dice until both dice show **1** (snake eyes). The program should count the number of rolls required.

---

## Problem Statement

A pair of six-sided dice is rolled repeatedly.

- Each die generates a random number from **1 to 6**.
- Continue rolling until both dice show **1**.
- Display how many rolls were required.

---

## Algorithm

1. Initialize the roll counter to zero.
2. Repeat:
   - Roll the first die.
   - Roll the second die.
   - Increment the counter.
3. Stop when both dice equal 1.
4. Display the number of rolls.

---

## Pseudocode

```text
BEGIN

rolls ← 0

DO

    die1 ← random number from 1 to 6
    die2 ← random number from 1 to 6

    rolls ← rolls + 1

WHILE die1 ≠ 1 OR die2 ≠ 1

PRINT rolls

END
```

---

## Sample Execution

```text
Rolling...

Die 1 = 4
Die 2 = 2

Die 1 = 6
Die 2 = 5

Die 1 = 1
Die 2 = 1

It took 3 rolls to get snake eyes.
```

---

## Time Complexity

Expected time is **O(n)**, where **n** is the number of rolls needed. On average, snake eyes occurs once every **36 rolls** because the probability of both dice showing 1 is \(1/36\).

---

## Space Complexity

```text
O(1)
```

---

## Java Concepts Demonstrated

- `Math.random()`
- Random number generation
- `while` loop
- Counter variables
- Boolean conditions

---

## Source Code

```text
src/main/java/SnakeEyes.java
```

---

## Lessons Learned

- `Math.random()` generates values between 0.0 (inclusive) and 1.0 (exclusive).
- Random integers in a range can be generated using arithmetic and casting.
- Loop conditions should match the problem requirements exactly.