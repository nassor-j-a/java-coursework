# Exercise 2-9: Recursive Bubble Sort

## Objective

Re-implement the Bubble Sort algorithm by replacing its outer loop with recursion.

## Implementation

The solution contains two Java classes:

### 1. RecursiveBubbleSort.java

Contains two overloaded methods:

- `bubbleSort(int[] array)`: Entry point that passes the array length to the recursive method.
- `bubbleSort(int[] array, int n)`: Performs one Bubble Sort pass and recursively sorts the remaining unsorted section.

### 2. Main.java

Tests the implementation using:
- An unordered array.
- An already sorted array.
- A reverse-sorted array.
- An array containing duplicates.
- An empty array.
- A single-element array.

## Algorithm

1. Check the base case. If `n <= 1`, return.
2. Perform one Bubble Sort pass through the first `n` elements.
3. Move the largest element in that section to index `n - 1`.
4. Recursively call `bubbleSort(array, n - 1)`.
5. Repeat until the base case is reached.

## Complexity Analysis

| Case | Time Complexity |
|---|---|
| Best | O(n²) |
| Average | O(n²) |
| Worst | O(n²) |

Auxiliary space complexity: O(n), due to recursive call stack frames.

## Sorting Invariant

At the beginning of each recursive call with parameter `n`, all elements from index `n` to the end of the array are already in their final sorted positions.

## Key Observation

The inner loop remains iterative. Recursion replaces only the outer loop.

Unlike an optimised Bubble Sort, this implementation does not stop early when a pass makes no swaps. Therefore, even an already sorted array requires O(n²) comparisons.

## Conclusion

Recursive Bubble Sort performs the same adjacent comparisons and swaps as conventional Bubble Sort. It replaces repeated outer-loop iterations with recursive method calls.