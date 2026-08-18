# Exercise 6-10 – Z-Algorithm

## Objective

Write a Java method that implements the Z-Algorithm.

The method takes a string `S` and returns a string containing the Z-values for every position in `S`.

For each position `i`, the Z-value represents the length of the longest substring starting at position `i` that matches a prefix of the original string.

The Z-value at position `0` is always `0`.

---

## Problem Statement

Given a string `S` of length `n`, calculate the Z-value for every position.

For each position `i > 0`, compare the characters starting at `S.charAt(i)` with the characters at the beginning of the string.

Continue comparing while the characters match.

The number of matching characters is the Z-value for that position.

---

## Examples

```text
zAlgo("ababa")       → 00301
zAlgo("axbyaxba")    → 00003001
zAlgo("ababababx")   → 006040200
zAlgo("CSEN")        → 0000