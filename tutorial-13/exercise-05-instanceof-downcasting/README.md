# Exercise 3-5 — What's the Output?

## Objective

Understand the `instanceof` operator and downcasting in Java.

## Question

Predict the output:

```java
class Animal {}

class Dog extends Animal {
    void bark() {
        System.out.println("Bark");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a = new Dog();

        if (a instanceof Dog) {
            ((Dog)a).bark();
        }
    }
}
```

## Explanation

1. `Animal a = new Dog();` creates a Dog object and assigns its reference to an Animal variable.
2. `a instanceof Dog` checks whether the referenced object is an instance of Dog. The result is `true`.
3. `((Dog)a)` performs downcasting, allowing access to methods declared in Dog.
4. `bark()` executes and prints `Bark`.

## Expected Output

```text
Bark
```

## Key Concepts

- **Inheritance:** Dog extends Animal.
- **Upcasting:** Assigning a Dog object to an Animal reference.
- **instanceof:** Checks the actual object's type.
- **Downcasting:** Casting an Animal reference back to Dog.
- **Method access:** Downcasting allows access to subclass-specific methods.

## How to Compile and Run

From the exercise directory:

```bash
javac -d out src/main/java/tutorial13/exercise05instanceofdowncasting/Main.java

java -cp out tutorial13.exercise05instanceofdowncasting.Main
```
