# Exercise 7-4 - MultiplyRec

## Description

Write a recursive method `multiplyRec` that performs the multiplication of two numbers.

The method must use only the **addition (`+`)** and **subtraction (`-`)** operators to perform the multiplication.

The method should be tested using a `main` method.

## File Structure

```text
exercise-04-multiply-rec/
├── README.md
└── src/
    └── main/
        └── java/
            └── MultiplyRec.java
```

## Approach

Multiplication can be represented as repeated addition.

For example:

```text
5 × 3 = 5 + 5 + 5 = 15
```

Therefore, the recursive method can add `x` repeatedly until `y` reaches `0`.

### Base Case

When `y` is `0`:

```java
if (y == 0) {
    return 0;
}
```

Any number multiplied by zero is zero.

### Recursive Case

For a positive `y`:

```java
return x + multiplyRec(x, y - 1);
```

For a negative `y`, subtraction is used:

```java
return -x + multiplyRec(x, y + 1);
```

This allows the method to handle both positive and negative numbers.

## Example

For:

```text
x = 4
y = 3
```

The recursive calls are:

```text
multiplyRec(4, 3)
= 4 + multiplyRec(4, 2)
= 4 + 4 + multiplyRec(4, 1)
= 4 + 4 + 4 + multiplyRec(4, 0)
= 12
```

## Sample Output

```text
Enter x: 4
Enter y: 3
4 * 3 = 12
```

## Compilation and Execution

From the exercise directory:

```bash
javac src/main/java/MultiplyRec.java
java -cp src/main/java MultiplyRec
```

## Complexity

If `y` is positive, the method makes approximately `|y|` recursive calls.

* **Time Complexity:** O(|y|)
* **Space Complexity:** O(|y|) because of the recursive call stack.
