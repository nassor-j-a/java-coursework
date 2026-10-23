# Tutorial 12 — Exercise 2-2: Find String Indices

## Problem Description

Write a Java method that takes an `ArrayList<String>` and a `String` as parameters and returns an `ArrayList<Integer>` containing the indices at which the specified string occurs in the list.

## Project Structure

```text
exercise-02-find-string-indices/
├── README.md
└── src/
    └── main/
        └── java/
            └── FindOccurrences.java
```

## Implementation

The program implements the following method:

```java
public static ArrayList<Integer> findOccurrences(
        ArrayList<String> strings, String target)
```

The method traverses the list, compares each element with the target string using `.equals()`, and adds the index of each matching element to a result list.

The method returns the result list after checking every element.

## Example

**Input list:**

```text
[apple, banana, apple, orange, banana, apple]
```

**Target string:**

```text
apple
```

**Output:**

```text
[0, 2, 5]
```

The target string occurs at indices `0`, `2`, and `5`.

If the target string does not occur in the list, the method returns an empty list.

## How to Compile and Run

From the exercise directory, execute:

```bash
javac src/main/java/FindOccurrences.java
java -cp src/main/java FindOccurrences
```

## Concepts Practised

- Java methods and parameters
- `ArrayList<String>` and `ArrayList<Integer>`
- Iterating through an `ArrayList`
- Accessing elements using `get(index)`
- Comparing strings using `.equals()`
- Returning a collection from a method
- Time complexity: O(n)