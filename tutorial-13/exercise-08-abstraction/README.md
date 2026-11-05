# Exercise 3-8: Abstraction

## Objective

Understand abstract classes, abstract methods, inheritance, and polymorphism in Java.

## Classes

- `Animal`: An abstract superclass containing a concrete method (`sleep()`) and an abstract method (`sound()`).
- `Cat`: A concrete subclass that implements the abstract `sound()` method.
- `Main`: Creates a `Cat` object using an `Animal` reference and calls both methods.

## Expected Output

```text
Animal sleeps
Meow
```

## Explanation

### 1. Abstract class

The `Animal` class is declared using the `abstract` keyword.

An abstract class cannot be instantiated directly. However, it can be used as a reference type.

### 2. Concrete method

The `sleep()` method has a complete implementation in `Animal`.

The `Cat` class inherits this method and uses it without overriding it.

### 3. Abstract method

The `sound()` method has no implementation in `Animal`.

The concrete subclass `Cat` must implement this method.

### 4. Polymorphism

```java
Animal a = new Cat();
```

The reference type is `Animal`, but the actual object is `Cat`.

When `a.sound()` executes, Java calls the implementation in `Cat`, which prints `Meow`.

When `a.sleep()` executes, Java calls the inherited implementation in `Animal`.

## Key Concepts

- **Abstraction:** Defining common behaviour while leaving specific implementation details to subclasses.
- **Abstract class:** A class that cannot be instantiated directly.
- **Abstract method:** A method declared without a body.
- **Concrete method:** A method with a complete implementation.
- **Polymorphism:** Calling an overridden method through a superclass reference.