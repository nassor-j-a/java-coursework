# Exercise 5-6: Extract Numbers

## Objective

Write a Java program that reads a string containing text and nonnegative numbers, then extracts and prints each number on a separate line.

The program uses nested loops to detect and collect consecutive digits that form a number.

## Sample Input

```
Please enter your string:
The year has 365 days and the day has 12 hours
```

## Sample Output

```
The numbers contained in your string are:
365
12
```

## How It Works

1. Read a complete line of text from the user.
2. Scan the string one character at a time using a `for` loop.
3. When a digit is found, use a nested `while` loop to collect all consecutive digits.
4. Print each extracted number on a separate line.
5. Continue scanning until the end of the string.

## Concepts Used

- `Scanner`
- `String`
- `charAt()`
- `for` loop
- `while` loop
- Nested loops
- String concatenation
- Conditional statements