# Tutorial 11 — Exercise 1-11: Airport

## Description

This exercise implements an `Airport` class that manages a limited number of flights.

The class builds upon the `Flight` class from Exercise 1-10 and demonstrates how one class can manage and interact with objects of another class.

An airport has a maximum flight capacity. Each flight can be registered with only one airport at a time.

## Project Structure

```text
exercise-11-airport/
├── README.md
└── src/
    └── main/
        └── java/
            ├── Flight.java
            └── Airport.java
```

## Attributes

### `flights`

An array of `Flight` objects managed by the airport.

### `numberOfFlights`

Tracks the number of flights currently registered with the airport.

The array's length represents the maximum number of flights the airport can manage.

## Constructor

### `Airport(int maximumFlights)`

Creates an airport that can manage the specified number of flights.

The constructor rejects non-positive capacities.

## Methods

### `addFlight(Flight f)`

Adds a flight if:
- The flight is not null.
- The airport has available capacity.
- The flight is not already managed by another airport.

When the flight is added, the airport records the flight and marks it as managed.

### `transferPassenger(Flight f1, Flight f2)`

Transfers one passenger from flight `f1` to flight `f2`.

The method checks that:
- Both flights belong to the airport.
- The flights are different.
- The source flight has at least one passenger.
- The destination flight has available capacity.

The transfer removes one passenger from the source and adds one to the destination.

### `registerPassenger(String destination)`

Searches the airport's registered flights for one travelling to the requested destination.

The passenger is added to the first matching flight that has available capacity.

Destination comparisons are case-insensitive.

If no suitable flight is available, the method reports that registration was unsuccessful.

### `getNumberOfFlights()`

Returns the number of flights currently managed by the airport.

### `toString()`

Returns a readable summary of the airport's registered flights, including flight details and passenger counts.

## Concepts Demonstrated

- Classes and objects.
- Constructors and instance variables.
- Object references and object interaction.
- Arrays of objects.
- Array traversal.
- Encapsulation.
- Conditional statements and loops.
- Method calls between classes.
- Capacity validation.
- Method overriding using `toString()`.

## Testing

The `main()` method tests:

1. Creating an airport with a maximum capacity of three flights.
2. Adding three flights.
3. Attempting to exceed the airport's capacity.
4. Transferring a passenger between two flights.
5. Registering a passenger for a destination with available capacity.
6. Handling a destination for which no flight has available capacity.
7. Displaying the final airport status.

## Compilation

From the exercise directory, compile both Java files:

```bash
javac src/main/java/Flight.java src/main/java/Airport.java
```

## Execution

Run the airport test program:

```bash
java -cp src/main/java Airport
```

## Design Assumptions

- The airport manages a fixed maximum number of flights.
- A flight can be managed by only one airport at a time.
- Passenger registration selects the first matching flight with available capacity.
- Passenger transfers require both flights to be registered with the same airport.