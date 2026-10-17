# Tutorial 11 — Exercise 1-7: Triangle

## Description

This exercise implements a Java class called `Triangle`, representing a triangle using three `Point` objects.

The implementation reuses the `Point` class from Exercise 1-6 and demonstrates constructors, object copying, cyclic rotation, method overriding, and class variables.

## Attributes

| Attribute | Type | Description |
|---|---|---|
| `p1` | `Point` | First vertex |
| `p2` | `Point` | Second vertex |
| `p3` | `Point` | Third vertex |
| `numberOfTriangles` | `static int` | Counts the number of `Triangle` objects created |

## Constructors

### Default constructor

`Triangle()`

Creates a triangle whose three vertices are initialized to `(0, 0)`.

### Parameterized constructor

`Triangle(Point p1, Point p2, Point p3)`

Creates a triangle using three supplied points.

Each successfully constructed triangle increments the class variable `numberOfTriangles`.

## Methods

| Method | Purpose |
|---|---|
| `copy()` | Returns a new triangle with the same coordinate values as the original |
| `rotate()` | Cyclically rotates the three vertices |
| `toString()` | Returns a readable representation of the triangle |
| `static getNumberOfTriangles()` | Returns the total number of triangle objects created |

### Copying a Triangle

The `copy()` method creates three new `Point` objects using the original vertices' coordinates, then uses them to construct a new triangle.

The copied triangle has the same coordinate values but does not share its point objects with the original triangle.

### Rotating a Triangle

The `rotate()` method cyclically rearranges the vertices:

- The original third vertex becomes the first.
- The original first vertex becomes the second.
- The original second vertex becomes the third.

The coordinate values themselves are not modified.

## Program Demonstration

The `main()` method:

1. Creates three points.
2. Constructs a triangle using the parameterized constructor.
3. Constructs a triangle using the default constructor.
4. Copies the first triangle.
5. Rotates the first triangle.
6. Displays the copied triangle to verify that it remains unchanged.
7. Displays the total number of `Triangle` and `Point` objects created.

The expected final counts are:

- Triangle objects: `3`
- Point objects: `9`

## Compilation and Execution

From the exercise directory, run:

```bash
javac src/main/java/Point.java src/main/java/Triangle.java
java -cp src/main/java Triangle
```

## Concepts Practised

- Classes and objects
- Constructors and constructor chaining
- Composition: a triangle contains three points
- Static class variables
- Object copying
- Independent copies of mutable objects
- Cyclic rotation and temporary variables
- Method overriding using `toString()`
- Reusing a class from a previous exercise
- Counting object creation