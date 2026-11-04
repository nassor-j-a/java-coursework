# Exercise 3-6: What’s the Output?

## Objective
Understand downcasting in Java and why casting an object to an incompatible subclass causes a `ClassCastException`.

## Classes

- `Animal`: The superclass.
- `Dog`: A subclass of `Animal` that defines the `bark()` method.
- `Main`: Creates an `Animal` object and attempts to cast it to `Dog`.

## Code

```java
Animal a = new Animal();
((Dog) a).bark();
```

## Explanation

1. `new Animal()` creates an object whose actual type is `Animal`.
2. The reference variable `a` has type `Animal`.
3. `(Dog) a` attempts to cast the `Animal` object to `Dog`.
4. Java allows the cast at compile time but rejects it at runtime because the object is not a `Dog`.
5. The program throws a `ClassCastException`, and `bark()` is never executed.

## Expected Result

The program compiles but terminates with a `ClassCastException` at runtime.

## Correct Downcasting

A valid downcast requires the actual object to be an instance of the subclass:

```java
Animal a = new Dog();
((Dog) a).bark();
```

You can check the object's type before casting:

```java
if (a instanceof Dog) {
    ((Dog) a).bark();
}
```

## Key Concepts

- **Upcasting:** Assigning a subclass object to a superclass reference.
- **Downcasting:** Casting a superclass reference back to a subclass type.
- **ClassCastException:** A runtime exception caused by an invalid object cast.
- **instanceof:** Checks whether an object is an instance of a particular class or its subclass.