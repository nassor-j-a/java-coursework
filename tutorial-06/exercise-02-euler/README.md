# Exercise 6-2 – Euler

## Objective

Write a Java program that calculates the mathematical constant `e` using the following definition:

```text
e = 1 + 1/1! + 1/2! + 1/3! + ... + 1/n!
```

The program should first implement a `factorial()` method and then use it to implement the `euler()` method.

---

## Problem Statement

The program should:

* Read an integer `n` from the user.
* Calculate factorial values using a `factorial()` method.
* Calculate an approximation of Euler's number using the first `n` terms of the series.
* Display the calculated value.

The mathematical constant is approximately:

```text
e ≈ 2.718281828459045
```

The calculated value becomes closer to this value as more terms are included.

---

## Algorithm

### Factorial Method

The factorial of `n` is defined as:

```text
n! = n × (n - 1) × ... × 2 × 1
```

The method uses recursion:

1. If `n` is `0` or `1`, return `1`.
2. Otherwise, return `n × factorial(n - 1)`.

### Euler Method

1. Set the result to `0`.
2. Start a loop from `0` to `n`.
3. Calculate:

```text
1 / i!
```

4. Add the term to the result.
5. Return the result.

---

## Example

### Input

```text
Enter the value of n: 5
```

### Calculation

```text
e ≈ 1 + 1/1! + 1/2! + 1/3! + 1/4! + 1/5!
```

```text
e ≈ 2.7166666666666663
```

### Output

```text
The value of e is: 2.7166666666666663
```

---

## Concepts Practiced

* Methods
* Method parameters
* Return values
* Recursion
* Factorials
* `for` loops
* Floating-point arithmetic
* Mathematical series
* User input with `Scanner`

## Note

This exercise uses the series approximation of `e`. Increasing `n` produces a more accurate approximation.
