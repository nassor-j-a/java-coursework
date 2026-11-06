# Exercise 3-9: Field Hiding vs Method Overriding

## Objective

Understand how Java resolves inherited fields and overridden instance methods when using superclass references.

## Classes

- `Animal`: Defines a field called `type` and a method called `printType()`.
- `Dog`: Extends `Animal`, declares another `type` field, and overrides `printType()`.
- `Main`: Creates a `Dog` object using an `Animal` reference and accesses the field and method.

## Expected Output

```text
Animal
Dog
```

## Explanation

### 1. Field hiding

```java
Animal a = new Dog();
System.out.println(a.type);
```

Java resolves fields using the declared reference type.

Since `a` is declared as `Animal`, Java accesses `Animal.type`, which contains `"Animal"`.

The `type` field declared in `Dog` hides the inherited field. It does not override it.

### 2. Method overriding

```java
a.printType();
```

Java resolves overridden instance methods using the actual object type.

The actual object is a `Dog`, so Java executes `Dog.printType()`.

Inside that method, `type` refers to the field declared in `Dog`, which contains `"Dog"`.

### 3. Accessing the superclass field

A subclass can explicitly access its superclass field using `super`:

```java
System.out.println(super.type);
```

This accesses `Animal.type`.

## Key Concepts

- **Field hiding:** A subclass declares a field with the same name as a field in its superclass.
- **Method overriding:** A subclass provides a new implementation of an inherited instance method.
- **Reference type:** Determines which fields are accessible and which field is selected.
- **Actual object type:** Determines which overridden instance method executes.
- **super:** Provides access to members of the superclass.