# Tutorial 15 – Exercise 2-2: Modified Selection Sort

## Problem

Implement a modified Selection Sort algorithm that finds the smallest and largest elements in the unsorted section during a single loop.

- Move the smallest element to the beginning of the unsorted section.
- Move the largest element to the end of the unsorted section.
- Repeat until the array is sorted.

## 1. Algorithm

The algorithm maintains two boundaries:

- `left`: beginning of the unsorted section.
- `right`: end of the unsorted section.

For every pass:

1. Initialise `minIndex` and `maxIndex` to `left`.
2. Use one `for` loop to find the minimum and maximum indices.
3. Swap the minimum with the element at `left`.
4. If the maximum was originally at `left`, update `maxIndex` to `minIndex`.
5. Swap the maximum with the element at `right`.
6. Increment `left` and decrement `right`.

The algorithm stops when `left` is no longer smaller than `right`.

## 2. Special Case

Consider:

`[6, 4, 5]`

The minimum is 4 at index 1, while the maximum is 6 at index 0.

After swapping the minimum with the first element:

`[4, 6, 5]`

The maximum has moved from index 0 to index 1.

Therefore, update:

`maxIndex = minIndex`

This prevents the second swap from using an outdated maximum index.

The array then becomes:

`[4, 5, 6]`

## 3. Required Test Cases

### Test Case 1

Input:

`[6, 4, 5]`

Output:

`[4, 5, 6]`

### Test Case 2

Input:

`[2, 6, 8, 1, 7, 9, 4, 3, 5]`

Output:

`[1, 2, 3, 4, 5, 6, 7, 8, 9]`

## 4. Sorting Invariant

After every completed pass:

- The sorted prefix contains the smallest elements of the original array in their correct final positions.
- The sorted suffix contains the largest elements of the original array in their correct final positions.
- The remaining unsorted middle section contains all elements not yet placed in their final positions.

The sorted prefix grows from left to right, while the sorted suffix grows from right to left.

## 5. Complexity Analysis

| Measure | Complexity |
|---|---|
| Finding minimum and maximum per pass | O(n) |
| Number of passes | O(n) |
| Overall time complexity | O(n²) |
| Auxiliary space complexity | O(1) |

The algorithm uses one loop to find both the minimum and maximum during each pass. It sorts the array in place without creating another array.

## 6. Implementation

- `ModifiedSelectionSort.java`: Implements the modified Selection Sort algorithm.
- `Main.java`: Tests the required arrays and additional edge cases.