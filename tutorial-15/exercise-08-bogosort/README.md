# Exercise 2-8: Bogosort

## Objective

Implement Bogosort, a theoretical sorting algorithm that repeatedly shuffles an array randomly until its elements appear in ascending order.

## Implementation

The solution contains two Java classes:

### 1. BogoSort.java

Implements three methods:

- `bogoSort(int[] a)`: Repeatedly shuffles the array until it is sorted.
- `shuffle(int[] a)`: Randomly rearranges all elements using the Fisher–Yates shuffle.
- `isSorted(int[] a)`: Checks whether the array is in ascending order.

### 2. Main.java

Tests the algorithm using:
- An unordered array.
- An already sorted array.
- A reverse-sorted array.
- An array containing duplicates.
- An empty array.

## Algorithm

1. Check whether the array is sorted.
2. If it is sorted, terminate.
3. Otherwise, shuffle the entire array.
4. Repeat until the array is sorted.

## Complexity Analysis

| Case | Time Complexity | Explanation |
|---|---|---|
| Best | O(n) | The input is already sorted, so only one sortedness check is needed. |
| Expected (distinct elements) | O(n × n!) | There are n! possible permutations, and each attempt takes O(n). |
| Worst | Unbounded | There is no finite upper limit on the number of shuffles. |

Space complexity: O(1) auxiliary space.

## Algorithm Invariant

At the beginning of every iteration, the array contains exactly the same elements, with the same frequencies, as the original input array.

The shuffle operation only changes the positions of elements.

## Limitations

- The algorithm has extremely poor performance.
- It has no finite worst-case running-time guarantee.
- It is unsuitable for practical sorting applications.
- Its running time depends heavily on random permutations.

## Conclusion

Bogosort demonstrates how random shuffling can eventually produce a sorted array, but its expected running time grows factorially for distinct elements.