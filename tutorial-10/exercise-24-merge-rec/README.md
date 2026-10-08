# Exercise 7-24 — MergeRec

## Description

Write a recursive method `mergeRec` that prints the characters of two strings in alternating order.

The strings may have different lengths. When one string is exhausted, the remaining characters of the other string are printed.

The solution should not declare additional strings or arrays.

## Example

Given:

```java
String a = "hlo";
String b = "el";

mergeRec(a, b);
```

Output:

```text
hello
```

The characters are printed in the following order:

```text
h (from a)
e (from b)
l (from a)
l (from b)
o (from a)
```

## Files

```text
exercise-24-merge-rec/
├── README.md
└── src/main/java/
    └── MergeRec.java
```

## Recursive Logic

The public method calls a helper method with a boolean flag indicating which string should provide the next character.

- If both strings are empty, recursion stops.
- If one string is empty, the remaining characters of the other string are printed.
- Otherwise, one character is printed and the helper is called recursively with the turn switched.

## Base Case

```java
if (a.length() == 0 && b.length() == 0) {
    return;
}
```

The method stops when both strings have no characters remaining.

## Compile and Run

From the exercise directory:

```bash
javac src/main/java/MergeRec.java
java -cp src/main/java MergeRec
```

Expected output:

```text
hello
```