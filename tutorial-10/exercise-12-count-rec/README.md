# Exercise 7-12 – CountRec

## Description

Write a recursive method named `countRec` that accepts two arguments:

- A `String` value
- A `char` value

The method returns the total number of times the specified character appears in the string.

## Program Structure

```text
exercise-12-count-rec/
├── README.md
└── src/main/java/
    └── CountRec.java
```

## Method

```java
public static int countRec(String value, char character)
```

The method checks one character at a time using recursion.

### Base Case

When the string is empty, there are no more characters to check:

```java
if (value.length() == 0) {
    return 0;
}
```

### Recursive Case

The first character is checked using:

```java
value.charAt(0)
```

If it matches the character being counted, `1` is added:

```java
return 1 + countRec(value.substring(1), character);
```

If it does not match, the method continues without adding `1`:

```java
return countRec(value.substring(1), character);
```

`substring(1)` removes the first character and allows the recursive method to process the remaining string.

## Example

Input:

```text
Enter a string: banana
Enter a character to count: a
```

Output:

```text
The character 'a' appears 3 time(s).
```

The character `a` occurs three times in `banana`.

## Another Example

Input:

```text
Enter a string: programming
Enter a character to count: m
```

Output:

```text
The character 'm' appears 2 time(s).
```

## How to Compile

From the exercise directory:

```bash
javac src/main/java/CountRec.java
```

## How to Run

```bash
java -cp src/main/java CountRec
```

## Complexity

The method processes each character in the string once.

The time complexity is approximately `O(n)`, where `n` is the length of the string.

The recursive calls also use stack space, giving approximately `O(n)` recursive stack space.