# Exercise 10-4 – Split Array

## Objective

Write a Java method `split(int array[], int pivot, int size)` that partitions an
array into two parts:

- Elements less than or equal to the pivot.
- Elements greater than the pivot.

The array must be partitioned without creating a new array.

The resulting array does not need to be sorted.

---

## Problem Statement

Given an array of integers and a pivot value, rearrange the elements so that all
values less than or equal to the pivot appear before all values greater than
the pivot.

For example:

```text
Array:
13 -42 8 35 -7 46 28 -19

Pivot:
10