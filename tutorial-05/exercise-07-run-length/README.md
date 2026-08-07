# Exercise 5-7 – Run Length

## Objective

Write Java programs that perform run-length compression and decompression on a string containing uppercase characters.

---

## Problem Statement

### Part (a) – Compression

Given a `String` containing uppercase characters from `A-Z`, compress repeated runs of the same character by storing the number of repetitions followed by the character.

For example:

```text
Input:
WWWWWWWWWWWWBWWWWWWWWWWWWBBB

Output:
12W1B12W3B
```

### Part (b) – Decompression

Given a compressed string, reverse the compression and reconstruct the original string.

For example:

```text
Input:
12W1B12W3B

Output:
WWWWWWWWWWWWBWWWWWWWWWWWWBBB
```

---

## Algorithm

### Part (a) – Compression

1. Read the input string.
2. Start a counter at `1`.
3. Compare each character with the previous character.
4. If they are the same, increment the counter.
5. If they are different:

   * Print the counter.
   * Print the previous character.
   * Reset the counter to `1`.
6. After the loop, print the count and the final character.

### Part (b) – Decompression

1. Read the compressed string.
2. Build the number by reading consecutive digits.
3. When a letter is encountered:

   * Convert the collected digits into an integer.
   * Print the letter the specified number of times.
   * Reset the number.
4. Continue until the complete compressed string has been processed.

---

## Sample Input

### Compression

```text
WWWWWWWWWWWWBWWWWWWWWWWWWBBB
```

### Decompression

```text
12W1B12W3B
```

---

## Sample Output

### Compression

```text
12W1B12W3B
```

### Decompression

```text
WWWWWWWWWWWWBWWWWWWWWWWWWBBB
```

---

## Concepts Practiced

* `String`
* `charAt()`
* `for` loops
* Nested loops
* Character comparison
* String concatenation
* `Integer.parseInt()`
* Run-length encoding
* String compression and decompression
* Building multi-digit numbers from characters
* `Scanner` input
