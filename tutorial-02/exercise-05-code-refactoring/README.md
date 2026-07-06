# Exercise 2-5 – Code Refactoring

## Goal
Reduce repeated statements while keeping logic identical.

---

## Program 1 (Refactored)

### Original issue
Duplicate print statement.

### Optimised version

```java
if (x > y) {
    System.out.println("Good Day");
} else {
    System.out.println("x is less than or equal to y");
    System.out.println("Good Day");
}
```

## Program 2 (Refactored)

### Observation
Multiple redundant checks.

### Simplified version

```java
if (x % 2 == 0) {
    System.out.println("x is even");
    System.out.println(x);
} else {
    System.out.println("x is odd");
    System.out.println(x);
}
```