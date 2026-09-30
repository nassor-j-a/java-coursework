# Exercise 7-13 – Reverse

## Description

Write a recursive Java method named `reverseRec` that returns a new string containing the same characters as the original string, but in reversed order.

For example:

```text
reverseRec("ABCDE") → "EDCBA"
```

## Program Structure

```text
exercise-13-reverse/
├── README.md
└── src/main/java/
    └── Reverse.java
```

## Method

```java
public static String reverseRec(String value)
```

The method uses recursion to reverse the string.

### Base Case

An empty string is already reversed:

```java
if (value.length() == 0) {
    return "";
}
```

Therefore:

```text
reverseRec("") → ""
```

### Recursive Case

The recursive case is:

```java
return reverseRec(value.substring(1)) + value.charAt(0);
```

`substring(1)` returns the string without its first character.

For example:

```text
"CSEN202".substring(1)
```

returns:

```text
"SEN202"
```

`charAt(0)` gets the first character.

For example:

```text
"CSEN202".charAt(0)
```

returns:

```text
'C'
```

The recursive call reverses the remaining string, and the original first character is then added to the end.

## Example

For:

```text
ABCDE
```

the recursive process is:

```text
reverseRec("ABCDE")
= reverseRec("BCDE") + "A"
= reverseRec("CDE") + "B" + "A"
= reverseRec("DE") + "C" + "B" + "A"
= reverseRec("E") + "D" + "C" + "B" + "A"
= reverseRec("") + "E" + "D" + "C" + "B" + "A"
= "EDCBA"
```

## Example Run

Input:

```text
Enter a string: ABCDE
```

Output:

```text
Reversed string: EDCBA
```

Another example:

```text
Enter a string: CSEN202
Reversed string: 202NESC
```

## How to Compile

From the exercise directory:

```bash
javac src/main/java/Reverse.java
```

## How to Run

```bash
java -cp src/main/java Reverse
```

## Complexity

The method makes one recursive call for each character in the string.

The recursive process takes approximately `O(n)` time and uses `O(n)` recursive stack space, where `n` is the length of the string.