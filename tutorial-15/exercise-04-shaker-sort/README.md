# Tutorial 15 – Exercise 2-4: Shaker Sort

## Problem

Implement Shaker Sort, a variation of Bubble Sort that performs passes in two directions:

1. Forward pass: examines adjacent elements from left to right and swaps them when necessary.
2. Backward pass: examines adjacent elements from right to left and swaps them when necessary.
3. Repeats the two passes until the array is sorted.

Given:

`[7, 5, 11, 10, 8]`

Expected output:

`[5, 7, 8, 10, 11]`

## 1. How the Algorithm Works

Shaker Sort maintains two boundaries:

- `left`: beginning of the unsorted section.
- `right`: end of the unsorted section.

### Forward pass

Compare adjacent elements from left to right.

If the left element is greater than the right element, swap them.

The largest element moves to the right boundary.

### Backward pass

Compare adjacent elements from right to left.

If the right element is smaller than the left element, swap them.

The smallest remaining element moves to the left boundary.

After a complete forward and backward cycle:

- Decrease `right`.
- Increase `left`.

Repeat until the array is sorted.

## 2. Trace of the Given Example

Initial array:

`[7, 5, 11, 10, 8]`

### Forward pass

1. Compare 7 and 5. Swap.

   `[5, 7, 11, 10, 8]`

2. Compare 7 and 11. No swap.

   `[5, 7, 11, 10, 8]`

3. Compare 11 and 10. Swap.

   `[5, 7, 10, 11, 8]`

4. Compare 11 and 8. Swap.

   `[5, 7, 10, 8, 11]`

The largest element, 11, reaches the rightmost position.

### Backward pass

1. Compare 11 and 8. No swap.

   `[5, 7, 10, 8, 11]`

2. Compare 8 and 10. Swap.

   `[5, 7, 8, 10, 11]`

3. Compare 7 and 5. No swap.

   `[5, 7, 8, 10, 11]`

The smallest element, 5, is already at the leftmost position.

### Second forward pass

The remaining unsorted section is:

`[7, 8, 10]`

No swaps occur during this pass, so the algorithm terminates.

**Final sorted array:**

`[5, 7, 8, 10, 11]`

## 3. Algorithm Invariant

After every complete forward and backward cycle:

- All elements before `left` are in their correct final sorted positions.
- All elements after `right` are in their correct final sorted positions.
- The elements between `left` and `right` form the remaining unsorted section.

The sorted prefix grows from left to right, while the sorted suffix grows from right to left.

When the boundaries meet, the entire array is sorted.

## 4. Complexity Analysis

| Case | Time complexity |
|---|---|
| Best case | O(n) |
| Average case | O(n²) |
| Worst case | O(n²) |

**Auxiliary space complexity:** O(1)

The algorithm sorts the original array without creating another array.

## 5. Stability

Shaker Sort is stable when implemented using strict comparison operators.

Equal elements are not swapped, so their original relative order is preserved.

## 6. Source Files

- `ShakerSort.java`: Implements the Shaker Sort algorithm.
- `Main.java`: Tests the required example and additional edge cases.