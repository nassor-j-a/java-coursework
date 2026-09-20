# Exercise 7-3 – Natural Logarithm

## Description

Write a recursive method `constantRec` to calculate an approximation of the mathematical constant `e`.

The constant is defined using the following series:

```text
e(n) = 1/0! + 1/1! + 1/2! + 1/3! + ... + 1/n!
```

The exercise also requires a recursive `factorial` method to calculate:

```text
n!
```

## Factorial

The factorial of `n` is defined as:

```text
n! = n × (n - 1)!
```

with the base case:

```text
0! = 1
```

The recursive method is:

```java
public static long factorial(int n) {

    if (n == 0) {
        return 1;
    }

    return n * factorial(n - 1);
}
```

## Constant e

The recursive definition used is:

```text
e(n) = e(n - 1) + 1/n!
```

The base case is:

```text
e(0) = 1/0! = 1
```

The recursive method is:

```java
public static double constantRec(int n) {

    if (n == 0) {
        return 1.0 / factorial(0);
    }

    return constantRec(n - 1) + 1.0 / factorial(n);
}
```

## Example

For `n = 3`:

```text
e(3) = 1/0! + 1/1! + 1/2! + 1/3!
```

Since:

```text
0! = 1
1! = 1
2! = 2
3! = 6
```

we get:

```text
e(3) = 1 + 1 + 0.5 + 0.166666...
     = 2.666666...
```

## Important Concept

The expression:

```java
1.0 / factorial(n)
```

uses decimal division.

Using `1` instead of `1.0` would perform integer division because `factorial(n)` returns an integer type.

## Concepts Used

* Recursion
* Base cases
* Recursive cases
* Factorials
* Mathematical series
* `double`
* `long`
* `Scanner`

## Complexity

The `factorial` method takes `O(n)` time.

The `constantRec` method makes recursive calls for each value from `n` down to `0`, and each level calculates a factorial.

Therefore, with this direct implementation:

* **Time Complexity:** `O(n²)`
* **Space Complexity:** `O(n)` due to the recursive call stacks.

## Compile and Run

From the exercise directory:

```bash
javac src/main/java/NaturalLogarithm.java
java -cp src/main/java NaturalLogarithm
```

## Example Output

For input `3`:

```text
Enter n: 3
e(3) = 2.6666666666666665
```

The result approaches the mathematical constant:

```text
e ≈ 2.718281828...
```

as `n` increases.
