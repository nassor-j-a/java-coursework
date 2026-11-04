# Exercise 3-7: Private and Final Methods

## Objective

Understand how `private` and `final` methods behave in Java inheritance.

## Classes

- `Animal`: Defines a private method and a final instance method.
- `Dog`: Extends `Animal` and declares a private method with the same name as the superclass method.
- `Main`: Creates a `Dog` object using an `Animal` reference and calls `finalMethod()`.

## Expected Output

```text
Animal final
```

## Explanation

### 1. Private method

The `privateMethod()` declared in `Animal` is not inherited by `Dog`.

When `Dog` declares another private method with the same name, it creates a separate method. It does not override the method in `Animal`.

### 2. Final method

The `finalMethod()` declared in `Animal` is inherited by `Dog`.

However, Java does not allow a subclass to override a final method. Therefore, calling `a.finalMethod()` executes the implementation declared in `Animal`.

### 3. Runtime behaviour

```java
Animal a = new Dog();
a.finalMethod();
```

- The actual object is a `Dog`.
- The reference type is `Animal`.
- `finalMethod()` is inherited by `Dog` and has not been overridden.
- Java executes the method defined in `Animal`.

## Key Concepts

- **Private method:** Accessible only within the class that declares it; it is not inherited.
- **Method hiding is not involved:** The two private methods are separate declarations, not overrides.
- **Final method:** A method that a subclass cannot override.
- **Inheritance:** A subclass can use accessible inherited methods from its superclass.