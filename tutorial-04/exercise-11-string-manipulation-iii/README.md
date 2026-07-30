# Exercise 4-11 – String Manipulation III

## Objective

Write a Java program that determines whether a given text is a palindrome.

A palindrome is a word or phrase that reads the same forwards and backwards.

Examples:

- racecar
- noon
- level
- madam

---

## Problem Statement

The program should:

1. Read a string from the user.
2. Compare the first and last characters.
3. Continue comparing characters moving toward the center.
4. If every pair matches, the string is a palindrome.
5. Otherwise, it is not a palindrome.

---

## Algorithm

1. Read the input string.
2. Assume the string is a palindrome.
3. Compare the first and last characters.
4. Continue until the middle of the string.
5. If any characters differ:
   - Mark the string as not a palindrome.
   - Stop checking.
6. Display the result.

---

## Pseudocode

```text
BEGIN

INPUT text

palindrome ← true

FOR i ← 0 TO length(text)/2

    j ← length(text) − 1 − i

    IF text[i] ≠ text[j]

        palindrome ← false
        EXIT LOOP

END FOR

IF palindrome

    PRINT "Palindrome"

ELSE

    PRINT "Not Palindrome"

END
```

---

## Sample Execution

```text
Please enter a text:
racecar

The text is a palindrome.
```

```text
Please enter a text:
computer

The text is not a palindrome.
```

---

## Time Complexity

```
O(n)
```

Only half of the characters are checked.

---

## Space Complexity

```
O(1)
```

---

## Java Concepts Demonstrated

- Strings
- `charAt()`
- `length()`
- `for` loop
- Boolean variables

---

## Source Code

```text
src/main/java/PalindromeChecker.java
```

---

## Lessons Learned

- A palindrome reads the same from both directions.
- Comparing characters from the ends toward the center is an efficient solution.
- The loop only needs to iterate through half of the string.