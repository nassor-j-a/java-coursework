# Exercise 4 – Count Change

## Objective

Develop a Java program that calculates the total monetary value of a collection of coins. The program accepts the number of quarters, dimes, nickels, and pennies, then converts the total into dollars and remaining pennies.

---

## Problem Statement

Write a Java program named **CountChange** that determines the total amount of money represented by a collection of coins.

The program should prompt the user to enter the number of:

- Quarters
- Dimes
- Nickels
- Pennies

It should then display the total value in dollars and cents.

---

## Assumptions

| Coin | Value |
|------|-------:|
| Quarter | 25 cents |
| Dime | 10 cents |
| Nickel | 5 cents |
| Penny | 1 cent |
| 1 Dollar | 100 cents |

---

## Mathematical Approach

First, convert every denomination into pennies.

```text
totalPennies =
(quarters × 25)
+ (dimes × 10)
+ (nickels × 5)
+ pennies
```

Next, separate dollars from the remaining pennies.

```text
dollars = totalPennies / 100

remainingPennies = totalPennies % 100
```

---

## Algorithm

1. Start.
2. Prompt the user for the number of quarters.
3. Prompt the user for the number of dimes.
4. Prompt the user for the number of nickels.
5. Prompt the user for the number of pennies.
6. Convert each denomination to pennies.
7. Calculate the total number of pennies.
8. Convert pennies into dollars and remaining pennies.
9. Display the result.
10. End.

---

## Pseudocode

```text
BEGIN

INPUT quarters

INPUT dimes

INPUT nickels

INPUT pennies

totalPennies =
quarters × 25 +
dimes × 10 +
nickels × 5 +
pennies

dollars = totalPennies / 100

remainingPennies = totalPennies % 100

DISPLAY dollars
DISPLAY remainingPennies

END
```

---

## Flowchart

```text
            +-------+
            | Start |
            +-------+
                 |
                 v
      Read quarters, dimes,
      nickels and pennies
                 |
                 v
   Convert each coin to pennies
                 |
                 v
      Compute total pennies
                 |
                 v
   dollars = total / 100
                 |
                 v
 pennies = total % 100
                 |
                 v
 Display total value
                 |
                 v
            +-----+
            | End |
            +-----+
```

---

## Example Execution

### Example 1

Input

```text
Quarters : 3

Dimes : 2

Nickels : 1

Pennies : 6
```

Calculation

```text
75 + 20 + 5 + 6 = 106 cents
```

Output

```text
$1.06
```

---

### Example 2

Input

```text
Quarters : 10

Dimes : 4

Nickels : 3

Pennies : 8
```

Calculation

```text
250 + 40 + 15 + 8 = 313 cents
```

Output

```text
$3.13
```

---

## Sample Test Cases

| Quarters | Dimes | Nickels | Pennies | Expected Output |
|----------:|-------:|---------:|---------:|----------------|
| 0 | 0 | 0 | 0 | $0.00 |
| 1 | 0 | 0 | 0 | $0.25 |
| 3 | 2 | 1 | 6 | $1.06 |
| 4 | 0 | 0 | 0 | $1.00 |
| 12 | 8 | 4 | 3 | $3.23 |

---

## Time Complexity

Every operation is a simple arithmetic calculation.

```text
O(1)
```

---

## Space Complexity

Only a fixed number of integer variables are used.

```text
O(1)
```

---

## Java Concepts Demonstrated

- Variables
- Integer arithmetic
- Integer division
- Modulus operator
- User input using `Scanner`
- Formatted console output

---

## Source Code

```text
src/main/java/CountChange.java
```

---

## Lessons Learned

- Integer division separates whole dollars from cents.
- The modulus operator calculates the remaining cents.
- Breaking a problem into smaller arithmetic steps produces readable code.