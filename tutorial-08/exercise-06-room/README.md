# Exercise 9-6 — Room

## Problem

Implement a `Room` class for a small hotel room booking system.

Each room keeps track of:

* Guest name
* Room number
* Rental rate
* Number of days rented
* Number of beds

A room can have either **1 or 2 beds**.

## Requirements

The `Room` class should provide:

1. A constructor that accepts:

   * Guest name
   * Room number
   * Number of beds
   * Nightly rental rate
   * Number of days rented

2. A `calculateTotal()` method that calculates the total rent.

3. An `addBed()` method that adds a bed, up to a maximum of 2 beds.

4. A `toString()` method that returns the room information with one attribute on each line.

5. A `main()` method to test the class.

## Class Attributes

```java
private String guestName;
private int roomNumber;
private double rate;
private int daysRented;
private int beds;
```

### Attribute descriptions

| Attribute    | Type     | Description                       |
| ------------ | -------- | --------------------------------- |
| `guestName`  | `String` | Name of the guest                 |
| `roomNumber` | `int`    | Hotel room number                 |
| `rate`       | `double` | Nightly rental rate               |
| `daysRented` | `int`    | Number of days the room is rented |
| `beds`       | `int`    | Number of beds, either 1 or 2     |

## Constructor

```java
public Room(String guestName, int roomNumber, int beds,
            double rate, int daysRented)
```

The constructor initializes all five room attributes.

Example:

```java
Room room = new Room("Blake", 123, 1, 123.50, 5);
```

## `calculateTotal()`

The total rent is calculated as:

```text
total = rate × daysRented
```

For example:

```text
Rate = 123.50
Days rented = 5

Total = 123.50 × 5
      = 617.50
```

The method is:

```java
public double calculateTotal() {
    return rate * daysRented;
}
```

## `addBed()`

The `addBed()` method increases the number of beds by one, but only when the room currently has fewer than two beds.

```java
public void addBed() {
    if (beds < 2) {
        beds++;
    }
}
```

Therefore:

```text
1 bed → addBed() → 2 beds
2 beds → addBed() → remains 2 beds
```

## `toString()`

The `toString()` method displays the room information with one attribute on each line.

Example:

```text
Guest name: Blake
Room number: 123
Room beds: 1
Rate: 123.50
Rented for: 5 days
```

The rate is formatted to two decimal places using:

```java
String.format("%.2f", rate)
```

The newline escape sequence `\n` is used to place each attribute on a separate line.

## Testing

The `main()` method creates a room:

```java
Room room = new Room("Blake", 123, 1, 123.50, 5);
```

It tests:

* Displaying room details
* Calculating the total rent
* Adding a second bed
* Attempting to add a third bed

Expected total rent:

```text
123.50 × 5 = 617.50
```

## Concepts Practiced

* Classes and objects
* Instance variables
* Constructors
* Methods
* Conditional statements
* `toString()`
* String formatting
* Arithmetic calculations
* Object testing using `main()`
* Enforcing a maximum value with a condition

## Compilation and Execution

From the exercise directory:

```bash
cd tutorial-08/exercise-06-room
javac src/main/java/Room.java
java -cp src/main/java Room
```
