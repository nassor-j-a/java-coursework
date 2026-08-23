# Exercise 8-1 – Airplane

## Objective

Write a Java program that defines an `AirplaneModel` class using object-oriented programming concepts.

The class represents an airplane using its name, empty weight, number of seats, and fuel consumption.

The exercise also demonstrates constructors, methods, method overloading, static methods, instance methods, and object comparison.

---

## Problem Statement

An airplane model can be described using the following attributes:

- `name` – String
- `emptyWeight` – double
- `numberOfSeats` – int
- `fuelConsumption` – double

The `AirplaneModel` class should provide:

- A default constructor.
- A constructor that accepts a name and number of seats.
- A constructor that accepts all four attributes.
- Getter methods for all attributes.
- A method to add seats.
- An instance `display()` method.
- A static `display(AirplaneModel a)` method.
- An instance `compare(AirplaneModel a)` method.
- A static `compare(AirplaneModel a, AirplaneModel b)` method.
- A `main` method to test the class.

---

## Algorithm

### Creating the first airplane

1. Create an airplane named `Boeing` with 200 seats.
2. Display its number of seats.
3. Add 50 seats.
4. Display the updated number of seats.
5. Display the complete airplane information.

### Creating the second airplane

1. Ask the user to enter:
   - Airplane name.
   - Empty weight.
   - Number of seats.
   - Fuel consumption.
2. Create a second `AirplaneModel` object using the four-parameter constructor.

### Comparing airplanes

1. Compare the two airplanes using the instance `compare()` method.
2. Display the airplane with the larger number of seats.
3. Compare the same airplanes using the static `compare()` method.
4. Display the airplane with the larger number of seats.

---

## Concepts Practiced

- Classes and objects
- Instance variables
- Constructors
- Constructor overloading
- Method overloading
- Instance methods
- Static methods
- Getters
- Object comparison
- `this` keyword
- `Scanner`
- Conditional statements
- Encapsulation

---

## Sample Input

```text
Enter airplane name: Airbus
Enter airplane empty weight: 41000
Enter airplane number of seats: 250
Enter airplane fuel consumption: 3.2