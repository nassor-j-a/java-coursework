# Exercise 3-12 – Gas Station

## Objective

Write a Java program that determines whether a driver should stop for fuel before continuing a journey.

---

## Problem Statement

A gas station is the last one available before a 200-mile stretch of road.

The program should:

1. Read the fuel tank capacity (gallons).
2. Read the current fuel level as a percentage.
3. Read the vehicle's fuel economy in miles per gallon (MPG).
4. Determine whether the remaining fuel is enough to travel 200 miles.

If the car cannot travel at least 200 miles, the program should display:

```text
Get Gas!
```

Otherwise:

```text
Safe to Proceed!
```

---

## Formula

Remaining Fuel

```text
Remaining Fuel = Tank Capacity × (Fuel Percentage / 100)
```

Maximum Distance

```text
Distance = Remaining Fuel × Miles Per Gallon
```

---

## Algorithm

1. Read the tank capacity.
2. Read the fuel gauge percentage.
3. Read the vehicle's MPG.
4. Calculate the remaining fuel.
5. Calculate the maximum travel distance.
6. Compare the distance with 200 miles.
7. Display the appropriate message.

---

## Pseudocode

```text
BEGIN

INPUT tankCapacity

INPUT fuelPercentage

INPUT milesPerGallon

remainingFuel = tankCapacity × fuelPercentage / 100

distance = remainingFuel × milesPerGallon

IF distance < 200

    DISPLAY "Get Gas!"

ELSE

    DISPLAY "Safe to Proceed!"

END
```

---

## Sample Execution

### Example 1

Input

```text
Tank Capacity: 12

Fuel Gauge: 50

Miles Per Gallon: 30
```

Output

```text
Get Gas!
```

Explanation

```text
Remaining Fuel = 6 gallons

Distance = 6 × 30 = 180 miles
```

---

### Example 2

Input

```text
Tank Capacity: 15

Fuel Gauge: 60

Miles Per Gallon: 30
```

Output

```text
Safe to Proceed!
```

---

## Test Cases

| Tank | Fuel % | MPG | Distance | Expected |
|----:|-------:|----:|---------:|----------|
|12|50|30|180|Get Gas|
|15|60|30|270|Safe to Proceed|
|20|25|40|200|Safe to Proceed|
|10|40|25|100|Get Gas|
|18|75|20|270|Safe to Proceed|

---

## Time Complexity

```text
O(1)
```

---

## Space Complexity

```text
O(1)
```

---

## Java Concepts Demonstrated

- if-else statements
- Arithmetic calculations
- User input using Scanner

---

## Source Code

```text
src/main/java/GasStation.java
```

---

## Lessons Learned

- Percentages are converted into decimal form before calculations.
- Business decisions can be made from calculated values.
- Breaking calculations into intermediate variables improves readability.