# Exercise 7-9 - Prime

## Description

Write two recursive Java methods that determine whether an integer is prime.

A prime number is an integer greater than 1 that cannot be divided evenly by any integer other than `1` and itself.

For example:

* `7` is prime.
* `8` is not prime because `2` divides `8`.

The exercise provides the following recursive definition:

```text
prime(N) = prime(N, N - 1)

prime(N, 1) = true

prime(N, D) = false       if D divides N

prime(N, D) = prime(N, D - 1) otherwise
```

The `%` operator is used to test divisibility.

## File Structure

```text id="7m1h5q"
exercise-09-prime/
├── README.md
└── src/
    └── main/
        └── java/
            ├── Prime.java
            └── PrimeTest.java
```

## Approach

The solution uses two recursive methods.

### Method 1: `prime(int n)`

This method starts the recursive process by calling:

```java id="6t5z2d"
return prime(n, n - 1);
```

For example:

```text id="k21x9v"
prime(7)
→ prime(7, 6)
```

### Method 2: `prime(int n, int d)`

This method checks whether `d` divides `n`.

If:

```java id="m5u2z8"
n % d == 0
```

then `d` divides `n`, so `n` is not prime.

Otherwise, the method checks the next smaller divisor:

```java id="8q6d7f"
return prime(n, d - 1);
```

### Base Case

When `d` reaches `1`, no divisor has been found.

Therefore, the number is prime:

```java id="7k9x3s"
if (d == 1) {
    return true;
}
```

## Example: 4

The recursive calls are:

```text id="w2m5q6"
prime(4)
→ prime(4, 3)
→ prime(4, 2)
```

Since:

```text id="1t6x9b"
4 % 2 == 0
```

the method returns `false`.

Therefore:

```text id="w8s4e2"
4 is not prime.
```

## Example: 7

The recursive calls are:

```text id="r7f1k2"
prime(7)
→ prime(7, 6)
→ prime(7, 5)
→ prime(7, 4)
→ prime(7, 3)
→ prime(7, 2)
→ prime(7, 1)
```

When `d` reaches `1`, the method returns `true`.

Therefore:

```text id="q1m6b9"
7 is prime.
```

## Sample Output

```text id="c2n7w4"
Enter an integer: 7
7 is prime.
```

Another test:

```text id="k4p8r0"
Enter an integer: 8
8 is not prime.
```

## Compilation and Execution

From the exercise directory:

```bash id="7m3v1x"
javac src/main/java/Prime.java src/main/java/PrimeTest.java
java -cp src/main/java PrimeTest
```

## Complexity

The method checks possible divisors from `n - 1` down to `2`.

* **Time Complexity:** O(n) in the worst case.
* **Space Complexity:** O(n) because of the recursive call stack.
