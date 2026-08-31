# Exercise 9-4 – Pair Of Dice

## Objective

Design a `PairofDice` class that represents two dice and allows them to be rolled, inspected, and added together.

---

## Problem Statement

The class contains two instance variables representing the numbers currently showing on each die.

The class should provide methods to:

- Roll both dice.
- Initialize the dice with random values.
- Get the value of the first die.
- Get the value of the second die.
- Get the total of both dice.
- Use a `main` method to test the class.

---

## Class Design

The class contains two private instance variables:

```java
private int firstDice;
private int secondDice;