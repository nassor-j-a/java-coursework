# Exercise 4-7 – Fixed Length

## Objective

Write a Java program that prints two words separated by dots so that the total output length is exactly 30 characters.

---

## Problem Statement

The program should:

1. Read two strings.
2. Calculate the number of dots needed.
3. Print the first string.
4. Print one dot at a time.
5. Print the second string.

This format is commonly used when creating a table of contents or an index.

---

## Algorithm

1. Read the first word.
2. Read the second word.
3. Compute:

```
dots = 30 − firstWord.length() − secondWord.length()
```

4. Print the first word.
5. Print the required number of dots using a loop.
6. Print the second word.

---

## Pseudocode

```text
BEGIN

INPUT firstWord
INPUT secondWord

dots ← 30 − length(firstWord) − length(secondWord)

PRINT firstWord

FOR i ← 1 TO dots

    PRINT "."

END FOR

PRINT secondWord

END
```

---

## Sample Execution

### Example

```text
Enter first word:
Chapter 5

Enter second word:
153

Chapter 5..................153
```

---

## Test Cases

| First Word | Second Word | Output Length |
|------------|-------------|--------------:|
|Chapter 5|153|30|
|Introduction|1|30|
|Appendix|250|30|

---

## Time Complexity

```text
O(n)
```

where **n** is the number of dots printed.

---

## Space Complexity

```text
O(1)
```

---

## Java Concepts Demonstrated

- Strings
- `length()`
- `for` loops
- Formatted output

---

## Source Code

```text
src/main/java/FixedLength.java
```

---

## Lessons Learned

- The `length()` method returns the number of characters in a string.
- Loops can generate repeated output one character at a time.
- Output formatting often requires calculating spacing based on string lengths.