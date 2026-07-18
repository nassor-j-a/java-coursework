# Exercise 3-15 – Suitcase Weight

## Objective

Write a Java program that determines whether two suitcases are accepted or rejected based on their weight and calculates any excess baggage charges.

---

## Problem Statement

Each passenger may check in two suitcases.

Rules:

- Weight up to **23 kg** is free.
- Weight between **24 kg and 32 kg** is accepted but charged **50 LE per extra kilogram**.
- Weight **greater than 32 kg** is rejected.

The program should:

1. Read the weight of two suitcases.
2. Determine whether each suitcase is accepted or rejected.
3. Calculate the total excess baggage charge.
4. Display the results.

---

## Charge Formula

```text
Extra Charge = (Weight − 23) × 50
```

Only applies when:

```text
23 < Weight ≤ 32
```

---

## Algorithm

1. Read the first suitcase weight.
2. Read the second suitcase weight.
3. For each suitcase:
   - Reject if weight > 32 kg.
   - Otherwise accept.
   - If weight > 23 kg, calculate the excess charge.
4. Add the charges.
5. Display both suitcase statuses and the total charge.

---

## Pseudocode

```text
BEGIN

INPUT suitcase1

INPUT suitcase2

charge ← 0

IF suitcase1 > 32

    status1 ← Rejected

ELSE

    status1 ← Accepted

    IF suitcase1 > 23

        charge ← charge + (suitcase1 − 23) × 50

    ENDIF

ENDIF

Repeat for suitcase2

DISPLAY statuses

DISPLAY total charge

END
```

---

## Sample Execution

### Example 1

Input

```text
Suitcase 1: 27

Suitcase 2: 25
```

Output

```text
Suitcase 1 accepted

Suitcase 2 accepted

Total charge = 300 LE
```

---

### Example 2

Input

```text
Suitcase 1: 45

Suitcase 2: 20
```

Output

```text
Suitcase 1 rejected

Suitcase 2 accepted

Total charge = 0 LE
```

---

### Example 3

Input

```text
Suitcase 1: 25

Suitcase 2: 40
```

Output

```text
Suitcase 1 accepted

Suitcase 2 rejected

Total charge = 100 LE
```

---

## Test Cases

| Suitcase 1 | Suitcase 2 | Charge | Result |
|-----------:|-----------:|-------:|--------|
|20|20|0|Accepted Accepted|
|23|23|0|Accepted Accepted|
|24|23|50|Accepted Accepted|
|27|25|300|Accepted Accepted|
|32|32|900|Accepted Accepted|
|33|20|0|Rejected Accepted|
|25|40|100|Accepted Rejected|

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
- Arithmetic operations
- User input using Scanner
- String variables
- Formatted output

---

## Source Code

```text
src/main/java/SuitcaseWeight.java
```

---

## Lessons Learned

- Multiple objects can be processed using the same decision logic.
- Boundary values are important in conditional statements.
- Intermediate variables simplify calculations and improve readability.