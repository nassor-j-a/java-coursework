# Exercise 4-6 – String Manipulation I

## Objective

Write a Java program that analyzes a line of text and counts the number of vowels, consonants, punctuation characters, and spaces.

---

## Problem Statement

The program should:

1. Read a complete line of text.
2. Convert the text to lowercase.
3. Process each character using `charAt()`.
4. Count:
   - Vowels
   - Consonants
   - Punctuation characters
   - Spaces
5. Display the results.

---

## Algorithm

1. Read a line of text.
2. Convert it to lowercase.
3. Initialize counters.
4. Process each character:
   - If it is a vowel, increment the vowel counter.
   - If it is punctuation, increment the punctuation counter.
   - If it is a space, increment the space counter.
   - Otherwise, if it is a letter, increment the consonant counter.
5. Display all counters.

---

## Pseudocode

```text
BEGIN

INPUT text

CONVERT text to lowercase

INITIALIZE vowels
INITIALIZE consonants
INITIALIZE punctuation
INITIALIZE spaces

FOR each character

    SWITCH character

        vowel:
            vowels++

        punctuation:
            punctuation++

        space:
            spaces++

        default:

            IF character is a letter

                consonants++

            ENDIF

    END SWITCH

END FOR

DISPLAY all counters

END
```

---

## Sample Execution

### Example

```text
Enter a line:

Hello, World!

Consonants : 7
Vowels     : 3
Punctuation: 2
Spaces     : 1
```

---

### Example 2

```text
Input

Java Programming.

Output

Consonants : 10
Vowels     : 5
Punctuation: 1
Spaces     : 1
```

---

## Test Cases

| Input | Consonants | Vowels | Punctuation | Spaces |
|------|-----------:|--------:|------------:|--------:|
|Hello|3|2|0|0|
|Java Programming!|10|5|1|1|
|A,E,I,O,U|0|5|4|0|
|12345|0|0|0|0|

---

## Time Complexity

```text
O(n)
```

where **n** is the length of the input string.

---

## Space Complexity

```text
O(1)
```

Only a fixed number of counters are used.

---

## Java Concepts Demonstrated

- Strings
- `charAt()`
- `toLowerCase()`
- `switch`
- `for` loops
- Character processing

---

## Source Code

```text
src/main/java/StringManipulationI.java
```

---

## Lessons Learned

- Strings can be processed one character at a time using `charAt()`.
- Converting text to lowercase simplifies character comparisons.
- A `switch` statement can efficiently classify characters into different categories.