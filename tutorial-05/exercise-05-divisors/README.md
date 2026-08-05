# Exercise 5-5 – Divisors

## Objective

Write a Java program that determines which integer between **1** and **10,000** has the largest number of divisors.

If more than one integer has the same maximum number of divisors, the program may display any one of them.

---

## Problem Statement

For every integer between **1** and **10,000**:

- Count its divisors.
- Keep track of the largest divisor count found.
- Display the integer with the greatest number of divisors together with its divisor count.

---

## Algorithm

1. Initialize:
   - `maxDivisors = 0`
   - `numberWithMax = 1`
2. Loop through every integer from **1** to **10,000**.
3. For each integer:
   - Count how many numbers divide it exactly.
4. If its divisor count is greater than the current maximum:
   - Update the maximum divisor count.
   - Store the current integer.
5. Print the results.

---

## Sample Output

```text
The integer with the largest number of divisors is: 7560
It has exactly 64 divisors.
```

> Note: Any integer with the maximum number of divisors is considered correct.

---

## Concepts Practiced

- Nested `for` loops
- Modulus operator (`%`)
- Counting
- Maximum-value search
- Algorithmic problem solving