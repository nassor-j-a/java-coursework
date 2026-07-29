# Exercise 4-10 – String Manipulation II

## Objective

Write a Java program that compares two strings and determines whether they are equal **without using the `equals()` method**.

---

## Problem Statement

The program should:

1. Read two strings from the user.
2. Compare their lengths.
3. If the lengths differ, report that the strings are not equal.
4. Otherwise, compare the characters one by one using `charAt()`.
5. Display whether the strings are equal.

---

## Algorithm

1. Read the first string.
2. Read the second string.
3. If the lengths differ, print "Not equal".
4. Otherwise:
   - Compare each character.
   - If any pair differs, stop and report "Not equal".
5. If all characters match, report "Equal".

---

## Pseudocode

```text
BEGIN

INPUT string1
INPUT string2

IF length(string1) ≠ length(string2)

    PRINT "Not equal"

ELSE

    equal ← true

    FOR each character

        IF characters differ

            equal ← false
            EXIT LOOP

    END FOR

    IF equal

        PRINT "Equal"

    ELSE

        PRINT "Not equal"

END
```

---

## Sample Execution

```text
Enter first string:
Hello

Enter second string:
Hello

The two strings are equal.
```

```text
Enter first string:
Hello

Enter second string:
World

The two strings are not equal.
```

---

## Time Complexity

```
O(n)
```

where **n** is the number of characters in the string.

---

## Space Complexity

```
O(1)
```

---

## Java Concepts Demonstrated

- Strings
- `length()`
- `charAt()`
- `for` loops
- Boolean variables

---

## Source Code

```text
src/main/java/StringManipulationII.java
```

---

## Lessons Learned

- Strings can be compared character by character.
- Always compare lengths before accessing characters.
- `charAt()` uses zero-based indexing.