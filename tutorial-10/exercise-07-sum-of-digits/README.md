# Exercise 7-7 - Sum of Digits

## Description

Write a recursive method to determine the sum of the digits of an integer.

For example:

```text
51624
```

The sum of its digits is:

```text
5 + 1 + 6 + 2 + 4 = 18
```

## File Structure

```text
exercise-07-sum-of-digits/
├── README.md
└── src/
    └── main/
        └── java/
            └── SumOfDigits.java
```

## Approach

The method processes one digit at a time.

The last digit is obtained using:

```java
n % 10
```

Integer division by `10` removes the last digit:

```java
n / 10
```

The recursive method adds the last digit to the sum of the remaining digits.

### Base Case

When the number contains only one digit, that digit is returned.

```java
if (n < 10) {
    return n;
}
```

### Recursive Case

The last digit is extracted and added to the result of the recursive call.

```java
int lastDigit = n % 10;
int remainingNumber = n / 10;

return lastDigit + sumDigits(remainingNumber);
```

## Example

For:

```text
51624
```

The recursive calls are:

```text
sumDigits(51624)
= 4 + sumDigits(5162)

= 4 + 2 + sumDigits(516)

= 4 + 2 + 6 + sumDigits(51)

= 4 + 2 + 6 + 1 + sumDigits(5)

= 4 + 2 + 6 + 1 + 5

= 18
```

## Sample Output

```text
Enter an integer: 51624
Sum of digits of 51624 = 18
```

## Compilation and Execution

From the exercise directory:

```bash
javac src/main/java/SumOfDigits.java
java -cp src/main/java SumOfDigits
```

## Complexity

If the number has `d` digits:

* **Time Complexity:** O(d)
* **Space Complexity:** O(d) because of the recursive call stack.
