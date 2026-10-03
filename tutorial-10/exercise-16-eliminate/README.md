# Exercise 7-16 – Eliminate

## Description

Write a recursive method named `eliminate` that accepts:

- A `String`
- A `char`

The method deletes every occurrence of the specified character from the string and returns the resulting string.

## Program Structure

```text
exercise-16-eliminate/
├── README.md
└── src/main/java/
    └── Eliminate.java
```

## Method

```java
public static String eliminate(String value, char character)
```

The method processes one character at a time using recursion.

## Base Case

When the string is empty, there are no more characters to process:

```java
if (value.length() == 0) {
    return "";
}
```

Therefore, the empty string returns an empty string.

## Recursive Case

The first character is obtained using:

```java
char firstCharacter = value.charAt(0);
```

If the first character matches the character that should be eliminated, it is skipped:

```java
if (firstCharacter == character) {
    return eliminate(value.substring(1), character);
}
```

If the character does not match, it is kept:

```java
return firstCharacter + eliminate(value.substring(1), character);
```

The method then recursively processes the rest of the string.

## Example

For:

```text
String: banana
Character: a
```

The characters are processed as follows:

```text
b → keep
a → eliminate
n → keep
a → eliminate
n → keep
a → eliminate
```

The final result is:

```text
bnn
```

## Example Run

Input:

```text
Enter a string: banana
Enter the character to eliminate: a
```

Output:

```text
Result: bnn
```

Another example:

```text
Enter a string: programming
Enter the character to eliminate: m
```

Output:

```text
Result: prograing
```

## How to Compile

From the exercise directory:

```bash
javac src/main/java/Eliminate.java
```

## How to Run

```bash
java -cp src/main/java Eliminate
```

## Complexity

The method processes each character in the string once.

The time complexity is approximately `O(n)`, where `n` is the length of the string.

The recursive calls use approximately `O(n)` stack space.