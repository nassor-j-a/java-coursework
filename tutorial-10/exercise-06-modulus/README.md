# Exercise 7-6 - Modulus

## Description

Write a recursive Java method `modulusRec` that performs the modulus operation of two integers.

The Java predefined modulus operator `%` must not be used to perform the operation.

If `y` is negative, an error message must be displayed.

The method should be tested using a `main` method.

## File Structure

```text
exercise-06-modulus/
├── README.md
└── src/
    └── main/
        └── java/
            └── Modulus.java
```

## Approach

The modulus operation finds the remainder after integer division.

The recursive definition provided in the exercise is:

```text
x % y = 0          if x = 0

x % y = x          if x < y

x % y = (x - y)%y  otherwise
```

The method repeatedly subtracts `y` from `x` until `x` becomes smaller than `y`.

### Base Case 1

If `x` is `0`, the remainder is `0`.

```java
if (x == 0) {
    return 0;
}
```

### Base Case 2

If `x` is smaller than `y`, then `x` is already the remainder.

```java
if (x < y) {
    return x;
}
```

### Recursive Case

If `x` is greater than or equal to `y`, subtract `y` and call the method again.

```java
return modulusRec(x - y, y);
```

### Negative Divisor

The exercise requires an error message when `y` is negative.

```java
if (y < 0) {
    System.out.println("Error: The divisor y cannot be negative.");
    return 0;
}
```

Modulus by zero is also handled separately because it is undefined.

## Example

For:

```text
x = 17
y = 5
```

The recursive calls are:

```text
modulusRec(17, 5)
→ modulusRec(12, 5)
→ modulusRec(7, 5)
→ modulusRec(2, 5)
```

Since:

```text
2 < 5
```

the method returns `2`.

Therefore:

```text
17 % 5 = 2
```

## Sample Output

```text
Enter x: 17
Enter y: 5
17 % 5 = 2
```

## Compilation and Execution

From the exercise directory:

```bash
javac src/main/java/Modulus.java
java -cp src/main/java Modulus
```

## Complexity

The method repeatedly subtracts `y` from `x`.

* **Time Complexity:** O(x / y) for positive `x` and `y`
* **Space Complexity:** O(x / y) because of the recursive call stack.
