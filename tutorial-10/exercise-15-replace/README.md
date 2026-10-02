# Exercise 7-15 – Replace

## Description

Write a recursive method named `replace` that accepts two arguments:

- A `String`
- A `char`

The method replaces every occurrence of the specified character with `'*'` and returns the resulting string.

## Program Structure

```text
exercise-15-replace/
├── README.md
└── src/main/java/
    └── Replace.java
```

## Method

```java
public static String replace(String value, char character)
```

The method recursively processes the string one character at a time.

## Base Case

When the string is empty, there are no more characters to process:

```java
if (value.length() == 0) {
    return "";
}
```

An empty string therefore returns another empty string.

## Recursive Case

The first character is obtained using:

```java
char firstCharacter = value.charAt(0);
```

If it matches the character provided by the user, it is changed to `'*'`:

```java
if (firstCharacter == character) {
    firstCharacter = '*';
}
```

The remaining characters are processed recursively:

```java
return firstCharacter + replace(value.substring(1), character);
```

`substring(1)` removes the first character and returns the rest of the string.

## Example

For:

```text
String: banana
Character: a
```

The method processes:

```text
b → b
a → *
n → n
a → *
n → n
a → *
```

The final result is:

```text
b*n*n*
```

## Example Run

Input:

```text
Enter a string: banana
Enter the character to replace: a
```

Output:

```text
Result: b*n*n*
```

Another example:

```text
Enter a string: programming
Enter the character to replace: m
```

Output:

```text
Result: progra**ing
```

## How to Compile

From the exercise directory:

```bash
javac src/main/java/Replace.java
```

## How to Run

```bash
java -cp src/main/java Replace
```

## Complexity

The method processes each character in the string once.

The time complexity is approximately `O(n)`, where `n` is the length of the string.

The recursive calls use approximately `O(n)` stack space.