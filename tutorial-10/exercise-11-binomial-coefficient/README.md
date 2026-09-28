# Exercise 7-11 – Binomial Coefficient

## Description

The binomial coefficient, also called a combination, represents the number of ways of choosing `k` unordered outcomes from `n` possibilities.

It is written as:

\[
\binom{n}{k}
\]

The binomial coefficient is defined recursively as:

\[
\binom{n}{k} =
\begin{cases}
1 & \text{if } k = 0\\
1 & \text{if } n = k\\
\binom{n-1}{k} + \binom{n-1}{k-1} & \text{otherwise}
\end{cases}
\]

The program implements this definition using a recursive Java method.

## Program Structure

```text
exercise-11-binomial-coefficient/
├── README.md
└── src/main/java/
    └── BinomialCoefficient.java
```

## Method

```java
public static int binomial(int n, int k)
```

The method calculates the binomial coefficient recursively.

### Base cases

If `k` is `0`:

```java
if (k == 0) {
    return 1;
}
```

If `n` equals `k`:

```java
if (n == k) {
    return 1;
}
```

### Recursive case

Otherwise:

```java
return binomial(n - 1, k) + binomial(n - 1, k - 1);
```

This directly follows:

\[
\binom{n}{k}
=
\binom{n-1}{k}
+
\binom{n-1}{k-1}
\]

## Input Validation

The program requires:

```text
0 <= k <= n
```

If `k` is negative or greater than `n`, an error message is displayed.

## Example

Input:

```text
Enter n: 5
Enter k: 2
```

Output:

```text
C(5, 2) = 10
```

Because:

\[
\binom52 = 10
\]

## How to Compile

From the exercise directory:

```bash
javac src/main/java/BinomialCoefficient.java
```

## How to Run

```bash
java -cp src/main/java BinomialCoefficient
```

## Example Run

```text
Enter n: 5
Enter k: 2
C(5, 2) = 10
```

## Complexity

The recursive method makes multiple recursive calls at each step, so its time complexity grows exponentially in the worst case.

The recursion also uses stack space because each recursive call must wait for the calls below it to finish.