# Tutorial 12 — Exercise 2-4: Car Dealer

## Problem Description

Implement a `Car` class representing a car by its make, model, year of manufacture, and price.

Implement a `CarDealer` class that manages a collection of cars, available money, and accumulated profit.

The dealer must support the following operations:

- **`sellCar(String model)`**: Finds and removes the first car matching the specified model. The dealer receives 80% of its current price as available money and records the remaining 20% as profit.
- **`buyCar(Car c)`**: Purchases a car only if the dealer has sufficient money.
- **`removeOldCars(int year)`**: Removes cars manufactured before the specified year.
- **`discount(int currentYear)`**: Applies 2% annual compound depreciation to each car for every year since its manufacture.
- **`printCarList()`**: Displays all cars currently in the inventory.

A `Main` class tests the implementation.

## Project Structure

```text
exercise-04-car-dealer/
├── README.md
└── src/
    └── main/
        └── java/
            ├── Car.java
            ├── CarDealer.java
            └── Main.java
```

## Class Descriptions

### Car

The `Car` class contains the following attributes:

- `make`: The car manufacturer.
- `model`: The car model.
- `yearOfManufacture`: The year the car was manufactured.
- `price`: The car's current price.

Its constructor initializes all four attributes. Getter methods provide access to the attributes, and `setPrice()` allows the price to be updated.

### CarDealer

The `CarDealer` class contains:

- `cars`: An `ArrayList<Car>` holding the current inventory.
- `money`: The dealer's available funds.
- `profit`: The accumulated profit from completed sales.

The class implements the required buying, selling, inventory removal, depreciation, and printing operations.

### Main

The `Main` class creates sample cars and a dealer, then tests the required operations and displays the resulting inventory and financial information.

## Example

After applying discounts for 2026, selling the Toyota Corolla, purchasing the Kia Sportage, and removing cars manufactured before 2020, the dealer's inventory contains:

```text
Make: BMW, Model: X5, Year: 2024, Price: 28812.00
Make: Kia, Model: Sportage, Year: 2023, Price: 12000.00
```

The dealer's final financial information is approximately:

```text
Available money: 15378.94
Total profit: 1844.74
Cars in inventory: 2
```

## Depreciation Formula

The implementation uses annual compound depreciation:

\[
\text{New Price} = \text{Current Price} \times 0.98^{\text{Age}}
\]

where:

\[
\text{Age} = \text{Current Year} - \text{Year of Manufacture}
\]

The discount method should be called once for the intended valuation year because it applies depreciation to the car's current price.

## How to Compile and Run

Navigate to the exercise directory and compile all Java source files:

```bash
javac src/main/java/*.java
```

Run the main program:

```bash
java -cp src/main/java Main
```

## Concepts Practised

- Classes, objects, and constructors
- Encapsulation using private attributes
- Getters and setters
- `ArrayList` collections
- Searching and removing objects
- Iterators for safe collection modification
- Conditional statements and loops
- Financial calculations using `double`
- Annual compound depreciation
- Testing multiple classes through a `Main` method