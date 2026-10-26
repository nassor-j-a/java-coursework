# Tutorial 13 — Exercise 3-1: Polymorphism

## Problem Description

Given the `Animal`, `Dog`, and `Cat` classes, determine the output of a program that creates a `Dog` object, assigns it to an `Animal` reference, and invokes the `sound()` method.

## Project Structure

```text
exercise-01-polymorphism/
├── README.md
└── src/
    └── main/
        └── java/
            └── Main.java
```

## Expected Output

```text
Animal created
Dog created
Woof
```

## Explanation

1. `Dog d = new Dog();` creates a `Dog` object. The `Animal` constructor executes first, printing `Animal created`, followed by the `Dog` constructor, which prints `Dog created`.
2. `Animal a = d;` assigns the existing `Dog` object to an `Animal` reference. No additional object is created.
3. `a.sound();` invokes the overridden `sound()` method in `Dog`, printing `Woof`.

Although the reference type is `Animal`, the actual object is a `Dog`. Java uses runtime polymorphism to select the overridden instance method according to the object's actual class.

## Concepts Practised

- Inheritance
- Constructors and constructor execution order
- Upcasting a subclass object to a superclass reference
- Method overriding
- Runtime polymorphism

## How to Compile and Run

```bash
javac src/main/java/Main.java
java -cp src/main/java Main
```