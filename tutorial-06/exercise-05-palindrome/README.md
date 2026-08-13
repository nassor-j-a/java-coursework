# Exercise 6-5 – Palindrome

## Objective

Write a Java program that determines whether a piece of text entered by the user is a palindrome.

A palindrome is a piece of text that reads the same from left to right and from right to left.

Examples include:

- `racecar`
- `noon`
- `madam`

---

## Problem Statement

The program should:

1. Ask the user to enter a word.
2. Reverse the entered word.
3. Compare the reversed word with the original word.
4. Return `true` if they are the same.
5. Return `false` if they are different.

---

## Algorithm

1. Create a method called `isPalindrome`.
2. Receive the input string as a parameter.
3. Create an empty string called `reversed`.
4. Use a `for` loop starting from the last character of the string.
5. Add each character to `reversed`.
6. Compare `reversed` with the original string using `equals()`.
7. Return the result.
8. In `main`, ask the user for a word and display the result.

---

## Sample Input

```text
racecar