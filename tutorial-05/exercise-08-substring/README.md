# Exercise 5-8 – SubString

## Objective

Write a Java program that takes two strings, `s1` and `s2`, and determines whether `s1` is a substring of `s2`.

---

## Problem Statement

The program should check whether all characters of `s1` occur consecutively inside `s2` and in the same order.

For example:

```text
s1 = "abc"
s2 = "ababc"

Output:
true
```

Another example:

```text
s1 = "a"
s2 = "ababc"

Output:
true
```

If the characters do not occur consecutively:

```text
s1 = "abc"
s2 = "ababa"

Output:
false
```

---

## Algorithm

1. Read `s1` and `s2` from the user.
2. Assume that `s1` is not a substring of `s2`.
3. If `s1` is empty, consider it a substring.
4. Check every possible starting position in `s2`.
5. For each starting position:

   * Compare the characters of `s1` with the corresponding characters of `s2`.
   * If a character does not match, stop checking that position.
6. If all characters match, set the result to `true`.
7. Print the result.

---

## Sample Input 1

```text
Please enter first String (s1): abc
Please enter second String (s2): ababc
```

## Sample Output 1

```text
Output: true
```

---

## Sample Input 2

```text
Please enter first String (s1): a
Please enter second String (s2): ababc
```

## Sample Output 2

```text
Output: true
```

---

## Sample Input 3

```text
Please enter first String (s1): abc
Please enter second String (s2): ababa
```

## Sample Output 3

```text
Output: false
```

---

## Concepts Practiced

* `String`
* `charAt()`
* Nested `for` loops
* String length
* Character comparison
* Boolean variables
* Conditional statements
* Breaking out of loops
* Substring searching
* Boundary checking
