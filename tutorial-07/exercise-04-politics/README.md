# Exercise 8-4 – Politics

## Objective

Develop a Java class named `Country` that represents a country using information such as its name, population, royal status, continent, and political state.

The exercise demonstrates encapsulation, constructors, instance methods, static methods, method overloading, and object comparison.

---

## Problem Statement

The `Country` class contains the following attributes:

- `countryName` – String
- `noOfCitizens` – int
- `isRoyal` – boolean
- `continent` – String
- `politicalState` – int

The political state uses the following values:

| Value | State |
|---:|---|
| 4 | Peace |
| 3 | Increase intelligence |
| 2 | Increase in force readiness |
| 1 | War |

---

## Constructors

The class provides two constructors.

### Default Constructor

The default constructor initializes the attributes with default values.

### Parameterized Constructor

The parameterized constructor accepts:

```text
countryName
noOfCitizens
isRoyal
continent
politicalState