# Exercise 7-14 – Palindrome

## Description

Write a recursive method named `palindrome` that accepts a string as a parameter and determines whether the string is a palindrome.

A palindrome is a string that reads the same forwards and backwards.

Examples:

```text
level → palindrome
madam → palindrome
hello → not a palindrome
```

## Program Structure

```text
exercise-14-palindrome/
├── README.md
└── src/main/java/
    └── Palindrome.java
```

## Method

```java
public static boolean palindrome(String value)
```

The method returns:

- `true` if the string is a palindrome
- `false` if the string is not a palindrome

## Base Case

A string containing zero or one character is a palindrome:

```java
if (value.length() <= 1) {
    return true;
}
```

For example:

```text
palindrome("") → true
palindrome("a") → true
```

## Recursive Case

The first and last characters are compared:

```java
if (value.charAt(0) != value.charAt(value.length() - 1)) {
    return false;
}
```

If they are different, the string is not a palindrome.

If they are the same, the method recursively checks the characters between them:

```java
return palindrome(value.substring(1, value.length() - 1));
```

## Example

For:

```text
level
```

The method checks:

```text
l == l
```

Then recursively checks:

```text
eve
```

Next:

```text
e == e
```

Then recursively checks:

```text
v
```

Since `v` contains only one character, the base case returns `true`.

Therefore:

```text
level → palindrome
```

## Example Run

Input:

```text
Enter a string: level
```

Output:

```text
"level" is a palindrome.
```

Another example:

```text
Enter a string: hello
```

Output:

```text
"hello" is not a palindrome.
```

## How to Compile

From the exercise directory:

```bash
javac src/main/java/Palindrome.java
```

## How to Run

```bash
java -cp src/main/java Palindrome
```

## Complexity

The method checks the characters from the outside toward the middle.

The time complexity is approximately `O(n)`, where `n` is the length of the string.

The recursive calls use `O(n)` stack space in the worst case.