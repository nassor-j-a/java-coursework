# Exercise 6-4 – Maximum

## Objective

Write a Java program that uses method overloading to define three versions of the `max` method.

The methods should:

- Find the maximum of two integers.
- Find the maximum of two floating-point numbers.
- Compare two strings and return the string that appears later in lexicographical order.

---

## Problem Statement

The program should implement three overloaded `max` methods:

1. `max(int x, int y)` – returns the larger integer.
2. `max(double x, double y)` – returns the larger floating-point number.
3. `max(String x, String y)` – returns the string that comes later in dictionary order.

The `String` version uses the `compareTo()` method for lexicographical comparison.

---

## Algorithm

### Maximum of Two Integers

1. Receive two integers.
2. Compare the two values.
3. Return the larger value.

### Maximum of Two Floating-Point Numbers

1. Receive two `double` values.
2. Compare the two values.
3. Return the larger value.

### Maximum of Two Strings

1. Receive two strings.
2. Use `compareTo()` to compare them lexicographically.
3. Return the string that appears later in dictionary order.

---

## Sample Input

The program tests the following values:

```text
1, 5
1.5, 5.5
"Hello", "World"