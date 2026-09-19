# Exercise 7-2 – Power

## Description

Write a recursive method `powerRec` to calculate:

```text
x^n
```

where `n` is a non-negative integer.

The program should also contain a `main` method to test the recursive method.

## Formula

The recursive definition of a power is:

```text
x^n = x × x^(n-1)
```

The base case is:

```text
x^0 = 1
```

## Algorithm

1. Check whether `n` is `0`.
2. If `n` is `0`, return `1`.
3. Otherwise, multiply `x` by the result of `powerRec(x, n - 1)`.
4. Continue until the exponent reaches `0`.

## Base Case

```java
if (n == 0) {
    return 1;
}
```

Any number raised to the power `0` is `1`.

## Recursive Case

```java
return x * powerRec(x, n - 1);
```

This reduces the exponent by `1` during every recursive call.

## Example

For:

```text
x = 2
n = 4
```

The recursive calls are:

```text
powerRec(2, 4)
    ↓
2 × powerRec(2, 3)
    ↓
2 × powerRec(2, 2)
    ↓
2 × powerRec(2, 1)
    ↓
2 × powerRec(2, 0)
```

The base case returns `1`, and the results are calculated as the recursive calls return:

```text
2^0 = 1
2^1 = 2
2^2 = 4
2^3 = 8
2^4 = 16
```

## Example Output

```text
Enter the base x: 2
Enter the exponent n: 4
2.0^4 = 16.0
```

Another example:

```text
Enter the base x: 5
Enter the exponent n: 0
5.0^0 = 1.0
```

## Concepts Used

* Recursion
* Base case
* Recursive case
* Mathematical powers
* Methods
* `Scanner`
* User input

## Complexity

For an exponent `n`:

* **Time Complexity:** `O(n)`
* **Space Complexity:** `O(n)` because of the recursive call stack.

## Compile and Run

From the exercise directory:

```bash
javac src/main/java/Power.java
java -cp src/main/java Power
```
