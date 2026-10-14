# Tutorial 11 — Exercise 1-6: Point

## Description

This exercise implements a Java class called `Point` to represent a point in the Cartesian plane using its X and Y coordinates.

The class demonstrates constructors, instance methods, static methods, method overriding, object modification, and class variables.

## Attributes

| Attribute | Type | Description |
|---|---|---|
| `x` | `double` | X coordinate of the point |
| `y` | `double` | Y coordinate of the point |
| `numberOfPoints` | `static int` | Counts the number of `Point` objects created |

The coordinates are private, while `numberOfPoints` is static and shared by all `Point` objects.

## Constructors

### Default constructor

`Point()`

Creates a point at the origin:

`(0, 0)`

### Parameterized constructor

`Point(double x, double y)`

Creates a point using the supplied X and Y coordinates.

Each newly created point increments the class variable `numberOfPoints`.

## Methods

| Method | Purpose |
|---|---|
| `static add(Point p1, Point p2)` | Creates and returns a new point whose coordinates are the sums of the two input points |
| `add(Point p)` | Adds the coordinates of `p` to the current point |
| `static swap(Point p1, Point p2)` | Exchanges the coordinates of two points |
| `swap(Point p)` | Exchanges the coordinates of the current point and another point |
| `toString()` | Returns the point as a readable string in the form `(x, y)` |
| `static distance(Point p1, Point p2)` | Calculates the Manhattan distance between two points |
| `static getNumberOfPoints()` | Returns the total number of `Point` objects created |

## Manhattan Distance

The Manhattan distance between two points is calculated as:

`distance = |x1 - x2| + |y1 - y2|`

For example, the distance between `(2, 3)` and `(7, 6)` is:

`|2 - 7| + |3 - 6| = 5 + 3 = 8`

## Program Demonstration

The `main()` method tests:

1. Creating points using the parameterized constructor.
2. Adding points using the static method.
3. Adding points using the instance method.
4. Swapping points using the static method.
5. Swapping points using the instance method.
6. Displaying points using the overridden `toString()` method.
7. Calculating Manhattan distance.
8. Creating a point using the default constructor.
9. Displaying the total number of objects created.

## Compilation and Execution

From the exercise directory, run:

```bash
javac src/main/java/Point.java
java -cp src/main/java Point
```

## Concepts Practised

- Classes and objects
- Constructors
- Static and instance methods
- Method overloading
- Method overriding
- The `this` keyword
- The `static` keyword
- Object mutation
- Temporary variables for swapping values
- Manhattan distance
- Object creation counting