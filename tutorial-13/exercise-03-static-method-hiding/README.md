# Exercise 3-3 — What's the Output?

## Objective

Understand constructor chaining and static method hiding in Java inheritance.

## Question

Predict the output of the following code:

```java
Animal a = new Dog();
a.move();
```

## Concepts

### 1. Constructor chaining

When an instance of `Dog` is created, Java invokes the `Animal` constructor first, followed by the `Dog` constructor.

### 2. Static method hiding

Static methods are associated with classes rather than individual objects. When a static method is called through a reference, the declared reference type determines which version is invoked.

Because `a` is declared as `Animal`, `a.move()` invokes `Animal.move()`, even though the object is a `Dog`.

## Expected Output

```text
Animal created
Dog created
Animal moves
```

## How to Compile and Run

From the exercise directory:

```bash
javac -d out src/main/java/tutorial13/exercise03statichiding/Main.java
java -cp out tutorial13.exercise03statichiding.Main
```
