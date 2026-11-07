# Exercise 3-10: Calling an Overridden Method from a Constructor

## Objective

Understand constructor execution order and runtime polymorphism when a superclass constructor calls an overridden method.

## Classes

- `Animal`: An abstract superclass with a constructor that prints a message and calls the abstract `sound()` method.
- `Dog`: Extends `Animal`, implements `sound()`, and defines its own constructor.
- `Main`: Creates a `Dog` object.

## Expected Output

```text
Animal constructor
Woof
Dog constructor
```

## Explanation

### 1. Constructor execution order

When Java creates a `Dog` object, it executes the superclass constructor before the subclass constructor.

The execution order is:

1. `Animal` constructor begins.
2. Prints `Animal constructor`.
3. Calls `sound()`.
4. `Dog.sound()` executes and prints `Woof`.
5. `Animal` constructor finishes.
6. `Dog` constructor executes and prints `Dog constructor`.

### 2. Runtime polymorphism

Although `sound()` is called inside the `Animal` constructor, Java selects the implementation based on the actual object type.

Since the actual object is a `Dog`, Java executes `Dog.sound()`.

### 3. Calling overridden methods from constructors

Calling an overridable method from a constructor can cause unexpected behaviour.

The subclass constructor and instance field initializers have not yet executed when the superclass constructor calls the overridden method.

Subclass fields therefore still contain their default values at that point.

For example, an instance variable of type `String` initially contains `null`.

## Key Concepts

- **Constructor chaining:** Java executes the superclass constructor before the subclass constructor.
- **Runtime polymorphism:** The actual object type determines which overridden instance method executes.
- **Abstract method:** A method declared without an implementation that a concrete subclass must implement.
- **Constructor warning:** Avoid calling overridable methods from constructors because subclass initialization may not have completed.