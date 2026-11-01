# Exercise 3-4 — What's the Output?

## Objective

Understand how reference types affect method accessibility and how to access subclass-specific methods using type casting.

## Question

Consider the following code:

```java
public class Main {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.bark();
    }
}
```

Why does this code produce a compilation error, and how can you fix it?

## Explanation

The reference variable `a` has the declared type `Animal`, while the actual object is a `Dog`.

The compiler checks whether `Animal` declares or inherits the `bark()` method. Since it does not, the method cannot be called through the `Animal` reference.

## Solution: Type Casting

Use `instanceof` to check the object's type before casting:

```java
if (a instanceof Dog) {
    Dog d = (Dog) a;
    d.bark();
}
```

## Expected Output

```text
Animal created
Dog created
Woof!
```

## Key Concepts

- **Reference type:** Determines which methods can be accessed at compile time.
- **Object type:** Determines the actual class of the object at runtime.
- **Type casting:** Converts a reference to another compatible reference type.
- **instanceof:** Checks whether an object belongs to a particular class or its subclass.

## How to Compile and Run

From the exercise directory:

```bash
javac -d out src/main/java/tutorial13/exercise04subclassmethod/Main.java

java -cp out tutorial13.exercise04subclassmethod.Main
```
