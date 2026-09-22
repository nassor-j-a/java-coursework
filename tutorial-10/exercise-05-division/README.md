# Exercise 7-5 - Division

## Description

Write a recursive Java method `divideRec` that performs the integer division of two numbers.

The Java predefined division operator `/` must not be used to perform the division.

If `y` is negative, an error message must be displayed.

The method should be tested using a `main` method.

## File Structure

```text
exercise-05-division/
├── README.md
└── src/
    └── main/
        └── java/
            └── Division.java
```

## Approach

Integer division can be performed by repeatedly subtracting the divisor `y` from the dividend `x`.

The recursive definition is:

```text
x / y = 0                         if x < y

x / y = 1 + (x - y) / y          otherwise
```

### Base Case

When `x` becomes smaller than `y`, another complete subtraction of `y` is not possible.

Therefore, the quotient is `0`.

```java
if (x < y) {
    return 0;
}
```

### Recursive Case

When `x` is greater than or equal to `y`, subtract `y` from `x` and add `1` to the quotient.

```java
return 1 + divideRec(x - y, y);
```

### Negative Divisor

The exercise requires an error message when `y` is negative.

```java
if (y < 0) {
    System.out.println("Error: The divisor y cannot be negative.");
    return 0;
}
```

Division by zero is also handled separately to prevent infinite recursion.

## Example

For:

```text
x = 17
y = 5
```

The recursive calls are:

```text
divideRec(17, 5)
= 1 + divideRec(12, 5)
= 1 + 1 + divideRec(7, 5)
= 1 + 1 + 1 + divideRec(2, 5)
= 1 + 1 + 1 + 0
= 3
```

Therefore:

```text
17 / 5 = 3
```

The remainder is ignored because this is integer division.

## Sample Output

```text
Enter x: 17
Enter y: 5
17 / 5 = 3
```

## Error Example

```text
Enter x: 20
Enter y: -4
Error: The divisor y cannot be negative.
```

## Compilation and Execution

From the exercise directory:

```bash
javac src/main/java/Division.java
java -cp src/main/java Division
```

## Complexity

The recursive method subtracts `y` from `x` repeatedly.

* **Time Complexity:** O(x / y) for positive `x` and `y`
* **Space Complexity:** O(x / y) because of the recursive call stack.
