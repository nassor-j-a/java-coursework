# Tutorial 11 — Exercise 1-10: Flight

## Description

This exercise implements a `Flight` class for a basic airport flight management system.

Each flight stores its current passenger count, maximum passenger capacity, departure country, destination country, duration, and departure time.

## Project Structure

```text
exercise-10-flight/
├── README.md
└── src/
    └── main/
        └── java/
            └── Flight.java
```

## Attributes

- `numberOfPassengers`: the current number of passengers on the flight.
- `maximumPassengers`: the maximum number of passengers the flight can accommodate.
- `departureCountry`: the country from which the flight departs.
- `destinationCountry`: the destination country.
- `duration`: the flight duration in minutes.
- `departureTime`: the scheduled departure time, represented using `java.sql.Time`.

## Constructors

### Default Constructor

Creates a flight using default values: zero passengers, a capacity of 200, unknown departure and destination countries, zero duration, and midnight as the departure time.

### Parameterized Constructor

Accepts all flight details as arguments and initializes the flight. It validates the passenger count, capacity, duration, and required values.

## Methods

### `getNumberOfPassengers()`

Returns the current number of passengers on the flight.

### `addPassenger()`

Adds one passenger if the flight has not reached its maximum capacity. Otherwise, it reports that the flight is full.

### `removePassenger()`

Removes one passenger if the flight has at least one passenger. Otherwise, it reports that the flight is empty.

### `delay(Time t)`

Changes the scheduled departure time to the supplied time.

### `toString()`

Returns a readable representation of the flight's departure country, destination country, and departure time.

## Concepts Demonstrated

- Classes and objects.
- Instance variables.
- Default and parameterized constructors.
- Constructor chaining with `this(...)`.
- Conditional statements.
- Encapsulation.
- Method overriding.
- Java's built-in `java.sql.Time` class.
- Input validation using `IllegalArgumentException`.

## Testing

The `main()` method tests:

1. Creating a flight using the parameterized constructor.
2. Displaying flight details.
3. Retrieving the passenger count.
4. Adding passengers up to the maximum capacity.
5. Preventing additional passengers when the flight is full.
6. Removing a passenger.
7. Changing the departure time.
8. Creating a flight using the default constructor.

## Compilation and Execution

Compile:

```bash
javac src/main/java/Flight.java
```

Run:

```bash
java -cp src/main/java Flight
```

## Note on Departure Date

The exercise specifies `java.sql.Time`, which stores a time of day but not a calendar date. This implementation therefore displays the departure time. A separate date field or a date-and-time class would be needed to represent the full departure date and time.