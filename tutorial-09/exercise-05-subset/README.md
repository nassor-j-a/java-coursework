# Exercise 10-5 – Subset

## Objective

Write a Java method `subset` that takes two arrays of integers and returns
`true` if and only if the first array is a subset of the second array.

The arrays are assumed not to contain duplicate values.

---

## Problem Statement

The method should determine whether every element in Array 1 also exists in
Array 2.

For example:

```text
subset({1, 2, 3}, {1, 2, 3, 5, 6}) → true

subset({1, 2, 3}, {2, 4, 5, 1, 3}) → true

subset({}, {1, 2, 3, 5, 6}) → true

subset({1, 2, 3}, {2, 4, 5, 1}) → false