# Exercise 7-8 - Number of Digits

## Description

Write a recursive Java method `numberDigitsRec` which, given an integer, returns its number of digits.

For example:

```text
numberDigitsRec(12312)
```

returns:

```text
5
```

## File Structure

```text
exercise-08-number-digits/
├── README.md
└── src/
    └── main/
        └── java/
            └── NumberDigits.java
```

## Approach

Integer division by `10` removes the last digit of a number.

For example:

```text
12312 / 10 = 1231
1231  / 10 = 123
123   / 10 = 12
12    / 10 = 1
```

Each recursive call counts one digit.

### Base Case

When the number is a single digit, the method returns `1`.

```java
if (n < 10) {
    return 1;
}
```

### Recursive Case

Remove the last digit using integer division and add `1` for the digit that was removed.

```java
return 1 + numberDigitsRec(n / 10);
```

## Example

For:

```text
12312
```

the recursive calls are:

```text
numberDigitsRec(12312)
= 1 + numberDigitsRec(1231)
= 1 + 1 + numberDigitsRec(123)
= 1 + 1 + 1 + numberDigitsRec(12)
= 1 + 1 + 1 + 1 + numberDigitsRec(1)
= 1 + 1 + 1 + 1 + 1
= 5
```

Therefore:

```text
numberDigitsRec(12312) = 5
```

## Sample Output

```text
Enter an integer: 12312
Number of digits in 12312 = 5
```

## Compilation and Execution

From the exercise directory:

```bash
javac src/main/java/NumberDigits.java
java -cp src/main/java NumberDigits
```

## Complexity

If the number has `d` digits:

* **Time Complexity:** O(d)
* **Space Complexity:** O(d) because of the recursive call stack.
