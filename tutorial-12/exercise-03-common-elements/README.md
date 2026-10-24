# Tutorial 12 — Exercise 2-3: Common Elements

## Problem Description

Write a Java program that finds the common elements between two `ArrayList` collections, stores them in a new `ArrayList`, and prints the resulting list.

## Project Structure

```text
exercise-03-common-elements/
├── README.md
└── src/
    └── main/
        └── java/
            └── CommonElements.java
```

## Implementation

The program creates two `ArrayList<Integer>` collections and a third empty `ArrayList<Integer>` to store the common elements.

It iterates through the first list and uses the `contains()` method to check whether each element also exists in the second list.

If an element is present in both lists and has not already been added to the result, it is added to `commonElements`.

Finally, the program prints both original lists and the list of common elements.

## Example

**First list:**

```text
[10, 20, 30, 40, 50]
```

**Second list:**

```text
[30, 40, 50, 60, 70]
```

**Output:**

```text
First list: [10, 20, 30, 40, 50]
Second list: [30, 40, 50, 60, 70]
Common elements: [30, 40, 50]
```

The resulting list contains each common value only once.

## How to Compile and Run

From the exercise directory, execute:

```bash
javac src/main/java/CommonElements.java
java -cp src/main/java CommonElements
```

## Concepts Practised

- Creating and initializing `ArrayList` collections
- Iterating through a list using a `for` loop
- Accessing elements using `get(index)`
- Checking membership using `contains()`
- Adding elements using `add()`
- Using conditional statements to avoid duplicates
- Working with multiple collections