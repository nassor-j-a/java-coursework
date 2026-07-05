# Exercise 1 Corrections

This document explains every code segment from Exercise 1, identifies any errors, and presents the corrected solution.

---

# Question A

## Original

```java
-(-1)
```

### Classification

No Error

### Explanation

The unary minus operator negates `-1`, producing the value `1`.

### Correct Version

```java
System.out.println(-(-1));
```

Output

```text
1
```

---

# Question B

## Original

```java
--1
```

### Classification

Syntax Error

### Cause

The decrement operator (`--`) can only be applied to variables.

### Correct Version

```java
int x = 1;
--x;
System.out.println(x);
```

Output

```text
0
```

---

# Question C

## Original

```java
2 * 4(-6)
```

### Classification

Syntax Error

### Cause

Java requires explicit multiplication operators.

### Correct Version

```java
System.out.println(2 * 4 * (-6));
```

Output

```text
-48
```

---

# Question D

## Original

```java
1 / 0
```

### Classification

Runtime Error

### Exception

```text
ArithmeticException: / by zero
```

### Explanation

Integer division by zero is undefined.

---

# Question E

## Original

```java
1 / 0.0
```

### Classification

No Error

### Output

```text
Infinity
```

### Explanation

Floating-point division follows the IEEE 754 standard.

---

# Question F

## Original

```java
((10 - 2) * 4%)8)
```

### Classification

Syntax Error

### Cause

Incorrect use of parentheses and modulus operator.

### Correct Version

```java
System.out.println(((10 - 2) * 4) % 8);
```

Output

```text
0
```

---

# Question G

### Classification

Syntax Error

### Cause

`x + 1` is promoted to `int`.

### Correct Version

```java
x = (byte)(x + 1);
```

or

```java
x++;
```

---

# Question H

### Classification

No Error

### Explanation

The increment operator performs the narrowing conversion automatically.

Output

```text
9
```

---

# Question I

### Classification

Syntax Error

### Cause

Floating-point literals default to `double`.

### Correct Version

```java
float x = 2.5f;
float y = 3.4f;
```

Output

```text
The value is 5.9
```

---

# Question J

### Classification

Syntax Error

### Cause

Large integer literals assigned to `long` require an `L` suffix.

### Correct Version

```java
long y = 46547864784282L;
```

---

# Question K

### Classification

Syntax Error

### Cause

Adding two `byte` values produces an `int`.

### Correct Version

```java
byte z = (byte)(x + y);
```

Output

```text
The value is 20
```

---

# Question L

### Classification

Syntax Errors

### Problems

- Cannot assign an `int` directly to a `String`.
- Cannot assign a `String` directly to an `int`.

### Correct Version

```java
String v = String.valueOf(y);

int o = Integer.parseInt(m);
```

Output

```text
CSEN 202!
202CSEN !
202
204
```

---

# Summary

| Question | Error Type | Corrected |
|----------|------------|-----------|
| A | None | Not Required |
| B | Syntax | Yes |
| C | Syntax | Yes |
| D | Runtime | No |
| E | None | Not Required |
| F | Syntax | Yes |
| G | Syntax | Yes |
| H | None | Not Required |
| I | Syntax | Yes |
| J | Syntax | Yes |
| K | Syntax | Yes |
| L | Syntax | Yes |