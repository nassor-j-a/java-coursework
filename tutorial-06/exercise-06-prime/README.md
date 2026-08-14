# Exercise 6-6 – Prime

## Objective

Write a Java program that determines whether a number is a prime number.

A prime number is a positive integer greater than 1 that is divisible only by 1 and itself.

Examples:

- `3` is prime.
- `11` is prime.
- `14` is not prime.
- `1` is not prime.

---

## Problem Statement

The program should:

1. Ask the user to enter a number.
2. Pass the number to a method called `isPrime`.
3. Determine whether the number is prime.
4. Display the appropriate result.

---

## Algorithm

1. Create a method called `isPrime`.
2. If the number is less than or equal to `1`, return `false`.
3. Start a loop with `i = 2`.
4. Continue while `i * i <= x`.
5. Check whether `x` is divisible by `i`.
6. If `x % i == 0`, return `false`.
7. If no divisor is found, return `true`.
8. In `main`, ask the user for a number and display the result.

---

## Sample Input

```text
3