# Exercise 3 – Errors and Conventions

## Objective

Compile each code segment from **Exercise 1** and identify the type of error encountered. Where necessary, explain why the error occurs and provide a corrected version of the code.

---

## Problem Statement

For each code segment in Exercise 1, identify the following:

- Syntax Errors
- Runtime Errors
- Logic Errors

In addition, describe the specific cause of each error and demonstrate how it can be corrected.

---

## Error Categories

### 1. Syntax Errors

Syntax errors occur when the source code violates the Java language grammar. These errors are detected during compilation, preventing the program from running.

Examples include:

- Missing semicolons
- Misspelled keywords
- Incorrect capitalization
- Invalid identifiers
- Missing operators
- Invalid assignments
- Type incompatibilities detected at compile time

---

### 2. Runtime Errors

Runtime errors occur after successful compilation while the program is executing.

Examples include:

- Division by zero (integer arithmetic)
- Accessing an array outside its bounds
- NullPointerException
- ArithmeticException

---

### 3. Logic Errors

Logic errors do not prevent compilation or execution, but the program produces incorrect results because the implemented logic is wrong.

Examples include:

- Incorrect mathematical formulas
- Wrong comparison operators
- Incorrect algorithm design

---

## Error Classification

| Question | Syntax | Runtime | Logic | Notes |
|----------|:------:|:-------:|:-----:|------|
| A | ❌ | ❌ | ❌ | Valid expression |
| B | ✅ | ❌ | ❌ | Invalid use of decrement operator |
| C | ✅ | ❌ | ❌ | Missing multiplication operator |
| D | ❌ | ✅ | ❌ | Integer division by zero |
| E | ❌ | ❌ | ❌ | Produces `Infinity` |
| F | ✅ | ❌ | ❌ | Invalid expression syntax |
| G | ✅ | ❌ | ❌ | Implicit narrowing conversion |
| H | ❌ | ❌ | ❌ | Valid increment operation |
| I | ✅ | ❌ | ❌ | Float literals require `f` suffix |
| J | ✅ | ❌ | ❌ | Long literal missing `L` suffix |
| K | ✅ | ❌ | ❌ | Byte addition promotes to `int` |
| L | ✅ | ❌ | ❌ | Multiple String conversion errors |

---

## Java Naming Conventions

Java follows standard naming conventions to improve readability and maintainability.

| Element | Convention | Example |
|---------|------------|---------|
| Class | PascalCase | `TimeConversion` |
| Method | camelCase | `calculateArea()` |
| Variable | camelCase | `totalSeconds` |
| Constant | UPPER_CASE | `MAX_SIZE` |
| Package | lowercase | `tutorial01` |

---

## Example

### Incorrect

```java
String Word = "Hello World!";
system.out.print(Word)
```

### Errors

| Issue | Category |
|------|----------|
| `system` should be `System` | Syntax |
| Missing semicolon | Syntax |
| Variable name not camelCase | Naming convention |

### Correct

```java
String word = "Hello World!";
System.out.println(word);
```

---

## Source Files

A complete explanation for every Exercise 1 question is available in:

```text
Corrections.md
```

---

## Learning Outcomes

After completing this exercise, you should be able to:

- Distinguish syntax, runtime, and logic errors.
- Read compiler error messages.
- Apply Java naming conventions.
- Correct common programming mistakes.