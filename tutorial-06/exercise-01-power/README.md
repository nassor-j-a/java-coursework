# Exercise 6-1 – Power

## Objective

Write a Java program that implements the definition of power using a method. The program takes a base `m` and an exponent `n` from the user and calculates:

```text
power(m, n) = mⁿ
```

A `main` method is used to test the `power()` method.

---

## Problem Statement

The program should:

* Read the base `m` from the user.
* Read the exponent `n` from the user.
* Pass both values to a `power()` method.
* Calculate the result using multiplication.
* Return and display the result.

---

## Algorithm

1. Read the base `m`.
2. Read the exponent `n`.
3. Call the `power(m, n)` method.
4. Set the result to `1`.
5. Multiply the result by `m`, `n` times.
6. Return the result.
7. Display the result.

---

## Example

### Input

```text
Enter value for base: 2
Enter value for exponent: 5
```

### Output

```text
The result of 2 power 5 is 32
```

---

## Another Example

### Input

```text
Enter value for base: 3
Enter value for exponent: 4
```

### Output

```text
The result of 3 power 4 is 81
```

---

## Concepts Practiced

* Methods
* Method parameters
* Return values
* `for` loops
* Integer multiplication
* User input with `Scanner`
* Calling a method from `main`
* Basic mathematical operations
