# Exercise 7-20 – Put At Front

## Description

Write a recursive method named `putAtFront` that accepts:

- A `String` `s`
- A `char` `c`

The method returns a new string where:

1. All occurrences of `c` are placed at the front.
2. All other characters follow them.
3. The other characters remain in the same order as they appeared in the original string.

If `c` does not occur in the string, the original string is returned unchanged.

## Program Structure

```text
exercise-20-put-at-front/
├── README.md
└── src/main/java/
    └── PutAtFront.java
```

## Method

```java
public static String putAtFront(String s, char c)
```

## Base Case

When the string is empty, there is nothing left to process:

```java
if (s.length() == 0) {
    return "";
}
```

Therefore:

```text
putAtFront("", 'a') → ""
```

## Recursive Case

The first character is stored:

```java
char firstCharacter = s.charAt(0);
```

The remaining characters are processed recursively:

```java
String remaining = putAtFront(s.substring(1), c);
```

If the first character is the target character, it is placed at the front:

```java
if (firstCharacter == c) {
    return c + remaining;
}
```

If it is not the target character, it is placed after the recursively processed result:

```java
return remaining + firstCharacter;
```

This ensures that all occurrences of `c` move to the front while the remaining characters keep their original order.

## Example 1

```text
putAtFront("sce", 'c')
```

The character `c` is moved to the front:

```text
cse
```

## Example 2

```text
putAtFront("static", 't')
```

There are two occurrences of `t`.

The result is:

```text
ttsaic
```

Both `t` characters are at the front, while `s`, `a`, `i`, and `c` remain in their original order.

## Example 3

```text
putAtFront("banana", 'a')
```

There are three occurrences of `a`.

The result is:

```text
aaabnn
```

## Example 4

```text
putAtFront("java", 'j')
```

There is only one `j`, and it is already at the beginning.

The result remains:

```text
java
```

## Example 5

```text
putAtFront("ALL", 'L')
```

Both `L` characters are moved to the front:

```text
LLA
```

## Example Run

Input:

```text
Enter a string: banana
Enter the character to put at front: a
```

Output:

```text
Result: aaabnn
```

## How to Compile

From the exercise directory:

```bash
javac src/main/java/PutAtFront.java
```

## How to Run

```bash
java -cp src/main/java PutAtFront
```

## Complexity

The method makes one recursive call for each character in the string.

The recursive process takes approximately `O(n)` recursive calls, where `n` is the length of the string.

The recursive calls require `O(n)` stack space.