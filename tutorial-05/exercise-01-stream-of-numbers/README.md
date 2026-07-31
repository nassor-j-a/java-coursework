# Exercise 5-1 – Stream of Numbers

## Objective

Write a Java program that reads a sequence of non-negative integers and displays:

- The maximum number
- The minimum number
- The average of all numbers entered

The input ends when the user enters a negative number. The negative number is **not** included in the calculations.

The solution must use a **do-while loop**.

---

## Problem Statement

The program should repeatedly accept non-negative integers until the user enters a negative number.

After the input ends, the program should display:

- Maximum value
- Minimum value
- Average value

If no valid numbers are entered, an appropriate message should be displayed.

---

## Algorithm

1. Initialize variables for maximum, minimum, sum and counter.
2. Read integers using a do-while loop.
3. Stop when a negative number is entered.
4. Update:
   - Maximum
   - Minimum
   - Sum
   - Counter
5. Calculate the average.
6. Display the results.

---

## Pseudocode

```text
BEGIN

Initialize max, min, sum and counter

DO

    Read number

    IF number < 0
        EXIT LOOP

    IF first number
        max ← number
        min ← number

    IF number > max
        max ← number

    IF number < min
        min ← number

    sum ← sum + number
    counter ← counter + 1

WHILE true

IF counter > 0

    average ← sum / counter

    PRINT maximum
    PRINT minimum
    PRINT average

ELSE

    PRINT "No numbers were entered."

END
```

---

## Sample Execution

```text
Please enter a sequence of nonnegative numbers:
(Enter a negative number to stop)

2
3
5
4
-1

The maximum number is : 5
The minimum number is : 2
The average is : 3.50
```

---

## Time Complexity

```
O(n)
```

where **n** is the number of valid integers entered.

---

## Space Complexity

```
O(1)
```

---

## Java Concepts Demonstrated

- do-while loops
- Sentinel-controlled loops
- Conditional statements
- Arithmetic operations
- Variables

---

## Source Code

```
src/main/java/StreamOfNumbers.java
```

---

## Lessons Learned

- A sentinel value can terminate user input.
- The first valid input is useful for initializing the minimum and maximum values.
- Integer values should be cast to `double` when calculating averages.