# Tutorial 15 – Exercise 2-3: Index Sort

## Problem

Implement an `indexSort` method that sorts an integer array by calculating the final destination index of every element.

The algorithm creates a second array of the same length as the input array.

For every element:

1. Compare it with all other elements.
2. Count the elements that should appear before it.
3. Use that count as its destination index in the output array.
4. Place the element directly at that position.

The algorithm must handle duplicate values.

## 1. Example

Input:

`[4, 3, 8, 2]`

Output:

`[2, 3, 4, 8]`

### Step-by-step placement

**First element: 4**

Two elements (2 and 3) are smaller than 4.

Destination index: 2.

Output:

`[_, _, 4, _]`

**Second element: 3**

One element (2) is smaller than 3.

Destination index: 1.

Output:

`[_, 3, 4, _]`

**Third element: 8**

Three elements (2, 3 and 4) are smaller than 8.

Destination index: 3.

Output:

`[_, 3, 4, 8]`

**Fourth element: 2**

No elements are smaller than 2.

Destination index: 0.

Output:

`[2, 3, 4, 8]`

## 2. Handling Duplicate Values

Consider:

`[4, 2, 4, 1, 2]`

Simply counting smaller elements would give duplicate values the same destination index.

To solve this, the algorithm uses the original indices as a tie-breaker.

An element at index `j` comes before the current element at index `i` if:

- `x[j] < x[i]`, or
- `x[j] == x[i]` and `j < i`.

Java condition:

```java
if (x[j] < x[i] ||
    (x[j] == x[i] && j < i)) {
    position++;
}
```

This gives every element a distinct destination index and preserves the original order of equal elements.

For the example:

Input:

`[4, 2, 4, 1, 2]`

Output:

`[1, 2, 2, 4, 4]`

## 3. Time Complexity

The algorithm uses two nested loops.

- The outer loop executes `n` times.
- The inner loop executes `n` times for each outer iteration.

Total comparisons:

`n × n = n²`

Therefore:

**Time complexity: O(n²)**

The algorithm creates a second array containing `n` elements.

**Auxiliary space complexity: O(n)**

The input array remains unchanged.

## 4. Algorithm Invariant

After processing the first `k` elements of the input array, each processed element occupies its correct final sorted position in the output array.

No two processed elements occupy the same position.

The positions of processed elements do not change during subsequent iterations.

After all input elements have been processed, every output position contains exactly one element, and the output array is sorted.

## 5. Test Cases

| Input | Expected output |
|---|---|
| `[4, 3, 8, 2]` | `[2, 3, 4, 8]` |
| `[4, 2, 4, 1, 2]` | `[1, 2, 2, 4, 4]` |
| `[1, 2, 3, 4, 5]` | `[1, 2, 3, 4, 5]` |
| `[5, 4, 3, 2, 1]` | `[1, 2, 3, 4, 5]` |
| `[7, 7, 7, 7]` | `[7, 7, 7, 7]` |
| `[]` | `[]` |

## 6. Source Files

- `IndexSort.java`: Implements the Index Sort algorithm.
- `Main.java`: Tests the algorithm using different input arrays.