# Exercise 7-19 – Search

## Description

Write a recursive method named `search()` that searches for a character inside a `String` and returns the character's position.

If the character does not appear in the string, the method returns `-1`.

## Program Structure

```text
exercise-19-search/
├── README.md
└── src/main/java/
    └── Search.java
```

## Method

```java
public static int search(String value, char character)
```

The method checks the string recursively from left to right.

## Base Case

If the string is empty, the character was not found:

```java
if (value.length() == 0) {
    return -1;
}
```

Therefore:

```text
search("", 'a') → -1
```

## First Character Matches

If the first character is the character being searched for, its position in the current string is `0`:

```java
if (value.charAt(0) == character) {
    return 0;
}
```

## Recursive Case

If the first character does not match, the method searches the remaining string:

```java
int position = search(value.substring(1), character);
```

If the character is not found in the remaining string, `-1` is returned:

```java
if (position == -1) {
    return -1;
}
```

If the character is found, `1` is added to its position because the recursive string starts one position later:

```java
return position + 1;
```

## Example

For:

```text
search("example", 'a')
```

the method checks:

```text
example
↑
e → not found
```

Then:

```text
xample
↑
x → not found
```

Then:

```text
ample
↑
a → found at position 0
```

The position is adjusted as the recursion returns:

```text
0 + 1 + 1 = 2
```

Therefore:

```text
search("example", 'a') → 2
```

## Example Run

Output:

```text
2
```

because the character `a` is at index `2`:

```text
example
0123456
  ↑
  a
```

## Character Not Found

For example:

```java
search("example", 'z')
```

returns:

```text
-1
```

because `z` does not occur in the string.

## How to Compile

From the exercise directory:

```bash
javac src/main/java/Search.java
```

## How to Run

```bash
java -cp src/main/java Search
```

## Expected Output

```text
2
```

## Complexity

The method may examine every character in the string.

The time complexity is approximately `O(n)`, where `n` is the length of the string.

The recursive calls use approximately `O(n)` stack space.