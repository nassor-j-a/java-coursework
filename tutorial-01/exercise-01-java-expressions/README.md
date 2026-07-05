# Exercise 1 – Java Expressions

## Objective

Understand how Java evaluates expressions, performs type conversion, and distinguishes between syntax errors, runtime errors, and valid expressions.

---

## Summary

| Question | Status | Error Type |
|----------|--------|------------|
| A | Valid | None |
| B | Invalid | Syntax Error |
| C | Invalid | Syntax Error |
| D | Invalid | Runtime Error |
| E | Valid | None |
| F | Invalid | Syntax Error |
| G | Invalid | Syntax Error |
| H | Valid | None |
| I | Invalid | Syntax Error |
| J | Invalid | Syntax Error |
| K | Invalid | Syntax Error |
| L | Mixed | Several Syntax Errors |

---

# Question A

## Original Expression

```java
-(-1)
```

### Result

```
1
```

### Error Classification

None

### Explanation

The unary minus negates `-1`, producing `1`.

### Concepts

- Unary operator
- Integer literals

See `ExpressionA.java`.

---

# Question B

## Original Expression

```java
--1
```

### Result

Compilation Error

### Error Classification

Syntax Error

### Explanation

The decrement operator (`--`) requires a variable. A numeric literal cannot be decremented.

See `ExpressionB.java`.

---

# Question C

## Original Expression

```java
2 * 4(-6)
```

### Result

Compilation Error

### Error Classification

Syntax Error

### Explanation

Java does not allow implicit multiplication. Every multiplication must use the `*` operator.

Correct expression:

```java
2 * 4 * (-6)
```

See `ExpressionC.java`.

---

# Question D

## Original Expression

```java
1 / 0
```

### Result

Runtime Error

### Error Classification

Runtime Error

### Explanation

Integer division by zero throws an `ArithmeticException`.

See `ExpressionD.java`.

---

# Question E

## Original Expression

```java
1 / 0.0
```

### Result

```
Infinity
```

### Error Classification

None

### Explanation

Floating-point division by zero follows the IEEE 754 standard and returns positive infinity.

See `ExpressionE.java`.

---

# Question F

## Original Expression

```java
((10 - 2) * 4%)8)
```

### Result

Compilation Error

### Error Classification

Syntax Error

### Explanation

The expression contains misplaced parentheses and an incorrectly used modulus operator.

One corrected version is

```java
((10 - 2) * 4) % 8
```

Result:

```
0
```

See `ExpressionF.java`.

---

# Question G

Original code intentionally contains a type conversion error.

Result:

Compilation Error

Reason:

`x + 1` is promoted to an `int`, which cannot be assigned to a `byte` without casting.

See `ExpressionG.java`.

---

# Question H

Original code uses the increment operator.

Result

```
9
```

Reason

`x++` increments the byte variable by one without requiring an explicit cast.

See `ExpressionH.java`.

---

# Question I

Original code

```java
float x = 2.5;
```

Result

Compilation Error

Reason

Decimal literals are `double` by default.

Correct version

```java
float x = 2.5f;
float y = 3.4f;
```

See `ExpressionI.java`.

---

# Question J

Contains several integer literal problems.

Result

Compilation Error

Reason

Large numeric literals must use the `L` suffix.

See `ExpressionJ.java`.

---

# Question K

Adding two bytes produces an `int`.

Result

Compilation Error

Reason

The result of `x + y` cannot be assigned directly to a byte.

See `ExpressionK.java`.

---

# Question L

Contains multiple String conversion mistakes.

Result

Compilation Error

Reason

Java cannot automatically convert between `String` and `int`.

See `ExpressionL.java`.