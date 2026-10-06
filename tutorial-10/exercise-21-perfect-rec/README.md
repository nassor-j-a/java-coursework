# Exercise 7-21 – PerfectRec

## Description

A positive integer is called a **perfect number** if the sum of its factors, excluding the number itself, is equal to the number.

For example, `6` is a perfect number because its proper divisors are:

```text
1, 2, 3
```

and:

```text
1 + 2 + 3 = 6
```

The program uses a recursive method to calculate the sum of the proper divisors and then determines whether the number is perfect.

## Program Structure

```text
exercise-21-perfect-rec/
├── README.md
└── src/main/java/
    └── PerfectRec.java
```

## Methods

The program uses two methods:

```java
public static int sumDivisors(int n, int divisor)
```

and:

```java
public static boolean perfectRec(int n)
```

### `sumDivisors()`

This method recursively checks possible divisors of `n`.

If the current divisor divides `n` exactly:

```java
if (n % divisor == 0) {
    return divisor + sumDivisors(n, divisor + 1);
}
```

the divisor is added to the sum.

If it does not divide `n`, the method simply checks the next number:

```java
return sumDivisors(n, divisor + 1);
```

### Base Case

When the divisor reaches `n`, the recursion stops:

```java
if (divisor == n) {
    return 0;
}
```

This prevents `n` itself from being included in the sum.

## `perfectRec()`

The method calculates the sum of the proper divisors:

```java
int sum = sumDivisors(n, 1);
```

It then checks whether the sum equals `n`:

```java
return sum == n;
```

If they are equal, the number is perfect.

## Example: 6

The possible divisors are checked:

```text
1 → divisor
2 → divisor
3 → divisor
4 → not a divisor
5 → not a divisor
```

The sum is:

```text
1 + 2 + 3 = 6
```

Therefore:

```text
6 is a perfect number.
```

## Example Run

Input:

```text
Enter a positive integer: 6
```

Output:

```text
Sum of proper divisors = 6
6 is a perfect number.
```

## Another Example

Input:

```text
Enter a positive integer: 10
```

Output:

```text
Sum of proper divisors = 8
10 is not a perfect number.
```

The proper divisors of `10` are `1`, `2`, and `5`:

```text
1 + 2 + 5 = 8
```

Since `8 != 10`, `10` is not perfect.

## How to Compile

From the exercise directory:

```bash
javac src/main/java/PerfectRec.java
```

## How to Run

```bash
java -cp src/main/java PerfectRec
```

## Complexity

The method checks every integer from `1` through `n - 1`.

Therefore, the time complexity is approximately `O(n)`.

The recursive calls use `O(n)` stack space in the worst case.