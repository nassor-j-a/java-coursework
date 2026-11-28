# Exercise 3-5: Daily Temperatures

## Problem

Given an array of daily temperatures, return an array where each element represents the number of days to wait until a warmer temperature occurs.

If no warmer future day exists, return `0`.

The solution must:
- Use a stack.
- Have O(n) time complexity.
- Use the provided integer Stack class.

## Example

Input:
```text
[73, 74, 75, 71, 69, 72, 76, 73]
```

Output:
```text
[1, 1, 4, 2, 1, 1, 0, 0]
```

## Algorithm

The solution traverses the temperature array from right to left.

The stack stores array indices rather than temperature values.

For each index:

1. Pop indices whose temperatures are less than or equal to the current temperature.
2. If the stack is empty, store `0`.
3. Otherwise, subtract the current index from the index at the top of the stack.
4. Push the current index onto the stack.

Storing indices allows the algorithm to calculate the number of days between two temperatures.

## Data Structure

An array-based integer stack provides these operations:

- `push(k)`
- `pop()`
- `top()`
- `size()`
- `isEmpty()`
- `isFull()`

Only the stack is used as an auxiliary data structure. The result array stores the required answers.

## Complexity Analysis

Let `n` represent the number of temperatures.

| Operation | Complexity |
|---|---|
| Traversal | O(n) |
| Push operations | O(n) total |
| Pop operations | O(n) total |
| Overall time | **O(n)** |
| Auxiliary space | **O(n)** |
| Result array | O(n) |

Each index is pushed once and popped at most once. Therefore, the algorithm runs in linear time.

## Files

- `Stack.java` – Array-based integer stack implementation.
- `DailyTemperatures.java` – Contains the `warmerDays()` method.
- `Main.java` – Tests the implementation.

## Key Concept

The solution uses a monotonic stack. The stack stores candidate future days, removing candidates that cannot be the next warmer day.

Scanning from right to left allows each day's answer to be calculated efficiently.