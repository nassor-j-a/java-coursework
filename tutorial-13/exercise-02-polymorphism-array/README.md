# Tutorial 13 — Exercise 3-2: Polymorphism with an Array

## Problem

Predict the output of a Java program that stores `Animal`, `Dog`, and `Cat` objects in an `Animal` array and calls `sound()` on each object using a loop.

## Concepts Covered

- Inheritance
- Method overriding
- Runtime polymorphism
- Arrays of superclass references
- Constructor execution

## Explanation

The array contains three objects: an `Animal`, a `Dog`, and a `Cat`.

When each object is created, its constructor executes. The `Dog` constructor first invokes the `Animal` constructor because `Dog` extends `Animal`. Similarly, the `Cat` object invokes the `Animal` constructor through its implicit constructor.

The enhanced `for` loop visits each array element and calls `sound()`.

Although the loop variable is declared as `Animal`, Java invokes the overridden method belonging to each object's actual class:

- `Animal` prints `Animal sound`.
- `Dog` prints `Woof`.
- `Cat` prints `Meow!`.

This demonstrates runtime polymorphism: the method implementation is determined by the actual object's class rather than the reference variable's declared type.

## Expected Output

```text
Animal created
Animal created
Dog created
Animal created
Animal sound
Woof
Meow!
```

## How to Compile and Run

From the exercise directory:

```bash
javac src/main/java/Main.java
java -cp src/main/java Main
```