# Exercise 4-5 – Caesar Cipher

## Objective

Write a Java program that encrypts a message using the Caesar Cipher technique by shifting each alphabetic character by a specified key.

---

## Problem Statement

The program should:

1. Read a message.
2. Read an integer key.
3. Shift each alphabetic character forward by the key.
4. Wrap around the alphabet when necessary.
5. Display the encrypted message.

Example:

```
Message : Hat
Key     : 3

Output:
Kdw
```

---

## Algorithm

1. Read the message.
2. Read the encryption key.
3. For every character:
   - If uppercase:
     - Shift within A–Z.
   - Else if lowercase:
     - Shift within a–z.
   - Otherwise:
     - Leave unchanged.
4. Append the encrypted character.
5. Display the encrypted message.

---

## Pseudocode

```text
BEGIN

INPUT message
INPUT key

encrypted ← ""

FOR each character c in message

    IF c is uppercase

        shift within A-Z

    ELSE IF c is lowercase

        shift within a-z

    ELSE

        keep c unchanged

END FOR

DISPLAY encrypted

END
```

---

## Sample Execution

### Example 1

```
Please enter the message:
Hat

Please enter the key:
3

Encrypted message:
Kdw
```

---

### Example 2

```
Message:
xyz

Key:
3

Encrypted message:
abc
```

---

## Test Cases

| Message | Key | Output |
|---------|----:|--------|
|abc|3|def|
|xyz|3|abc|
|Hat|3|Kdw|
|Java|2|Lcxc|
|Hello World|5|Mjqqt Btwqi|

---

## Time Complexity

```
O(n)
```

where *n* is the message length.

---

## Space Complexity

```
O(n)
```

---

## Java Concepts Demonstrated

- Strings
- Characters
- ASCII values
- `charAt()`
- `for` loops
- Modulus operator (`%`)

---

## Source Code

```
src/main/java/CaesarCipher.java
```

---

## Lessons Learned

- Characters can be manipulated using their ASCII values.
- The modulus operator allows characters to wrap around the alphabet.
- Strings are immutable, so a new encrypted string is constructed character by character.