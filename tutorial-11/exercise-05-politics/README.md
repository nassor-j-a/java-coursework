# Tutorial 11 — Exercise 1-5: Politics

## Description

This exercise implements a `Country` class to represent a country and its political state.

The class demonstrates object-oriented programming concepts in Java, including attributes, constructors, instance methods, static methods, and object comparison.

## Attributes

The `Country` class contains the following private attributes:

| Attribute | Type | Description |
|---|---|---|
| `countryName` | `String` | Name of the country |
| `noOfCitizens` | `int` | Number of citizens |
| `isRoyal` | `boolean` | Indicates whether the country is royal |
| `continent` | `String` | Continent where the country is located |
| `politicalState` | `int` | Current political state |

### Political states

| Value | Description |
|---:|---|
| 4 | Peace |
| 3 | Increase intelligence |
| 2 | Increase in force readiness |
| 1 | War |

## Constructors

### Default constructor

`Country()`

Creates a country with default values:

- Country name: `Unknown`
- Number of citizens: `0`
- Royal status: `false`
- Continent: `Unknown`
- Political state: `4`

### Parameterized constructor

`Country(String countryName, int noOfCitizens, boolean isRoyal, String continent, int politicalState)`

Initializes a country with the supplied attribute values.

## Methods

| Method | Purpose |
|---|---|
| `getState()` | Returns the political state |
| `getRoyalState()` | Returns whether the country is royal |
| `setDefCon(int p)` | Changes the political state |
| `increaseCitizen(int c)` | Increases the number of citizens |
| `display()` | Displays the country's report |
| `compareTo(Country a)` | Returns the difference between the current country's citizen count and that of country `a` |
| `static compareTo(Country a, Country b)` | Returns the difference between the citizen counts of countries `a` and `b` |

The `compareTo()` methods return:

- A positive value if the first country being compared has more citizens.
- A negative value if the first country being compared has fewer citizens.
- Zero if both countries have the same number of citizens.

## Program Demonstration

The `main()` method:

1. Creates and initializes the first country, `c1`.
2. Displays the first country's report.
3. Changes its political state.
4. Creates and initializes the second country, `c2`.
5. Compares both countries using the instance `compareTo(Country a)` method.
6. Compares both countries using the static `compareTo(Country a, Country b)` method.
7. Displays the country with the larger number of citizens.

The example uses Kenya, with 55,000,000 citizens, and Japan, with 124,000,000 citizens.

The expected comparison result is that Japan has 69,000,000 more citizens than Kenya.

## Compilation and Execution

From this exercise's directory, run:

```bash
javac src/main/java/Country.java
java -cp src/main/java Country
```

## Concepts Practised

- Classes and objects
- Private attributes and encapsulation
- Default and parameterized constructors
- The `this` keyword
- Getters and setters
- Instance methods
- Static methods
- Method overloading
- Comparing objects using their attributes
- Conditional statements and `switch`