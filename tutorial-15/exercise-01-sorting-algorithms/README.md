# Tutorial 15 – Exercise 2-1: Sorting Algorithms

## Problem

Given the following array of integers:

`[11, 5, 14, 10, 2]`

Sort the array in ascending order using:

1. Bubble Sort
2. Selection Sort
3. Insertion Sort

Each step shows the operation performed and the resulting array.

---

## 1. Bubble Sort

Bubble Sort compares adjacent elements and swaps them when the left element is greater than the right element. After each pass, the largest unsorted element moves to the end.

**Initial array:**

`[11, 5, 14, 10, 2]`

### Pass 1

1. Compare 11 and 5. Swap them.

   `[5, 11, 14, 10, 2]`

2. Compare 11 and 14. No swap.

   `[5, 11, 14, 10, 2]`

3. Compare 14 and 10. Swap them.

   `[5, 11, 10, 14, 2]`

4. Compare 14 and 2. Swap them.

   `[5, 11, 10, 2, 14]`

The largest element, 14, is now in its correct position.

### Pass 2

1. Compare 5 and 11. No swap.

   `[5, 11, 10, 2, 14]`

2. Compare 11 and 10. Swap them.

   `[5, 10, 11, 2, 14]`

3. Compare 11 and 2. Swap them.

   `[5, 10, 2, 11, 14]`

The next largest element, 11, is now in its correct position.

### Pass 3

1. Compare 5 and 10. No swap.

   `[5, 10, 2, 11, 14]`

2. Compare 10 and 2. Swap them.

   `[5, 2, 10, 11, 14]`

### Pass 4

1. Compare 5 and 2. Swap them.

   `[2, 5, 10, 11, 14]`

**Final sorted array:**

`[2, 5, 10, 11, 14]`

---

## 2. Selection Sort

Selection Sort finds the smallest element in the unsorted section and swaps it with the first element of that section.

**Initial array:**

`[11, 5, 14, 10, 2]`

### Pass 1

- Examine the entire array.
- The smallest element is 2.
- Swap 2 with the first element, 11.

Result:

`[2, 5, 14, 10, 11]`

### Pass 2

- Examine the remaining unsorted section: `[5, 14, 10, 11]`.
- The smallest element is 5.
- It is already in the correct position, so no swap is needed.

Result:

`[2, 5, 14, 10, 11]`

### Pass 3

- Examine the remaining unsorted section: `[14, 10, 11]`.
- The smallest element is 10.
- Swap 10 with 14.

Result:

`[2, 5, 10, 14, 11]`

### Pass 4

- Examine the remaining unsorted section: `[14, 11]`.
- The smallest element is 11.
- Swap 11 with 14.

Result:

`[2, 5, 10, 11, 14]`

**Final sorted array:**

`[2, 5, 10, 11, 14]`

---

## 3. Insertion Sort

Insertion Sort builds a sorted section from left to right. It takes the next element as the key, shifts larger elements to the right, and inserts the key into its correct position.

**Initial array:**

`[11, 5, 14, 10, 2]`

Initially, the first element, 11, is considered sorted.

### Pass 1 – Insert 5

- Key = 5.
- Compare 5 with 11.
- Since 11 is greater than 5, shift 11 one position to the right.
- Insert 5 at the beginning.

Result:

`[5, 11, 14, 10, 2]`

### Pass 2 – Insert 14

- Key = 14.
- Compare 14 with 11.
- Since 11 is smaller than 14, no shifting is needed.
- 14 remains in its current position.

Result:

`[5, 11, 14, 10, 2]`

### Pass 3 – Insert 10

- Key = 10.
- Compare 10 with 14. Shift 14 right.

  `[5, 11, 14, 14, 2]`

- Compare 10 with 11. Shift 11 right.

  `[5, 11, 11, 14, 2]`

- Compare 10 with 5. Since 5 is smaller, stop.
- Insert 10 after 5.

Result:

`[5, 10, 11, 14, 2]`

### Pass 4 – Insert 2

- Key = 2.
- Compare 2 with 14. Shift 14 right.

  `[5, 10, 11, 14, 14]`

- Compare 2 with 11. Shift 11 right.

  `[5, 10, 11, 11, 14]`

- Compare 2 with 10. Shift 10 right.

  `[5, 10, 10, 11, 14]`

- Compare 2 with 5. Shift 5 right.

  `[5, 5, 10, 11, 14]`

- Insert 2 at the beginning.

Result:

`[2, 5, 10, 11, 14]`

**Final sorted array:**

`[2, 5, 10, 11, 14]`

---

## 4. Summary

| Algorithm | Main operation |
|---|---|
| Bubble Sort | Repeatedly compares and swaps adjacent elements. |
| Selection Sort | Finds the smallest element in the unsorted section and moves it to the beginning. |
| Insertion Sort | Inserts each new element into its correct position in the sorted section. |

All three algorithms sort the given array into:

`[2, 5, 10, 11, 14]`