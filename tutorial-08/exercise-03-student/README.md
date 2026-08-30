# Exercise 9-3 – Student

## Objective

Implement a `Student` class using constructors and understand how Java initializes instance variables.

---

## Problem Statement

A student is defined by:

- `name` – the student's first name
- `gpa` – the student's GPA
- `isSenior` – indicates whether the student is in their final year

The original skeleton contains no constructors.

The exercise asks whether the class can run using the available `main` method and then asks us to add a constructor that initializes the student's attributes.

---

## Default Constructor

If a Java class does not contain any constructor, Java automatically provides a default no-argument constructor.

For example:

```java
public class Student {

    String name;
    double gpa;
    boolean isSenior;
}