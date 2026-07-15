# Exercise 3-11 – Discount

## Objective

Write a Java program that calculates the total purchase cost and applies a 10% discount when the total cost exceeds EGP 1000.

---

## Problem Statement

A shop sells items at a fixed price of **EGP 100** per unit.

The program should:

1. Read the quantity purchased.
2. Calculate the total purchase cost.
3. Apply a **10% discount** if the total cost is greater than **EGP 1000**.
4. Display the final amount to be paid.

---

## Formula

```text
Original Cost = Quantity × Unit Price
```

If:

```text
Original Cost > 1000
```

then

```text
Final Cost = Original Cost − (Original Cost × 10%)
```

---

## Algorithm

1. Read the quantity.
2. Calculate the original cost.
3. Check whether the original cost exceeds EGP 1000.
4. Apply the discount if applicable.
5. Display the final amount.

---

## Pseudocode

```text
BEGIN

UNIT_PRICE ← 100

INPUT quantity

totalCost ← quantity × UNIT_PRICE

IF totalCost > 1000 THEN

    totalCost ← totalCost × 0.90

END IF

DISPLAY totalCost

END
```

---

## Sample Execution

### Example 1

Input

```text
Quantity: 8
```

Output

```text
Total Cost = EGP 800.00
```

---

### Example 2

Input

```text
Quantity: 15
```

Output

```text
Total Cost = EGP 1350.00
```

---

## Test Cases

| Quantity | Original | Final |
|---------:|---------:|------:|
|5|500|500|
|10|1000|1000|
|11|1100|990|
|15|1500|1350|
|20|2000|1800|

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

- if-else statement
- Arithmetic calculations
- Constants
- User input with Scanner

---

## Source Code

```text
src/main/java/Discount.java
```

---

## Lessons Learned

- Business rules should be applied to the correct value (total cost rather than quantity).
- Discounts reduce the total amount payable, not just calculate the discount value.
- Constants improve code readability and maintainability.