# Exercise 6-3 – Fibonacci

## Objective

Write a Java program that calculates the `nth` Fibonacci number.

The Fibonacci sequence is defined as:

```text
Fib(0) = 0
Fib(1) = 1
Fib(n) = Fib(n - 1) + Fib(n - 2)
```

Each Fibonacci number after the first two is the sum of the two preceding numbers.

---

## Problem Statement

The program should:

* Implement a method called `fib` that calculates the `nth` Fibonacci number.
* Ask the user to enter `n`.
* Display the `nth` Fibonacci number.

The beginning of the Fibonacci sequence is:

```text
0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ...
```

---

## Algorithm

1. Read the value of `n`.
2. If `n` is `0`, return `0`.
3. If `n` is `1`, return `1`.
4. Store the first two Fibonacci values:

   * `prev2 = 0`
   * `prev1 = 1`
5. Start a loop from `2` to `n`.
6. Calculate the next Fibonacci number by adding the previous two values.
7. Shift the values forward.
8. Return the final Fibonacci number.
9. Display the result.

---

## Example 1

### Input

```text
Enter the value of n to calculate the Fibonacci number: 0
```

### Output

```text
The 0th Fibonacci number is: 0
```

---

## Example 2

### Input

```text
Enter the value of n to calculate the Fibonacci number: 7
```

### Output

```text
The 7th Fibonacci number is: 13
```

---

## Example 3

### Input

```text
Enter the value of n to calculate the Fibonacci number: 10
```

### Output

```text
The 10th Fibonacci number is: 55
```

---

## Fibonacci Sequence

|  n | Fib(n) |
| -: | -----: |
|  0 |      0 |
|  1 |      1 |
|  2 |      1 |
|  3 |      2 |
|  4 |      3 |
|  5 |      5 |
|  6 |      8 |
|  7 |     13 |
|  8 |     21 |
|  9 |     34 |
| 10 |     55 |

---

## Concepts Practiced

* Methods
* Method parameters
* Return values
* `if` statements
* `for` loops
* Variables
* Iterative algorithms
* Sequence calculations
* User input with `Scanner`
