# Tutorial 15 – Exercise 2-5: Counting Sort

## Problem

Implement two sorting methods for arrays of positive integers:

1. `booleanSort`: Uses a boolean array to record the presence of each value.
2. `countingSort`: Uses an integer array to record the frequency of each value, preserving duplicates.

Both methods reconstruct a sorted output array.

## 1. Boolean Sort

Boolean Sort creates an auxiliary boolean array of length `maximum value + 1`.

Each index represents a possible input value.

### Steps

1. Find the maximum input value.
2. Create a boolean array of length `max + 1`.
3. Loop through the input and set `flags[value] = true`.
4. Count the true flags to determine the output length.
5. Examine the flags in ascending index order.
6. Add each index whose flag is true to the output array.

### Example

Input:

`[4, 3, 8, 2]`

After marking the values:

```text
Index:  0  1  2  3  4  5  6  7  8
Flags:  F  F  T  T  T  F  F  F  T
```

Output:

`[2, 3, 4, 8]`

### Limitation

Boolean Sort cannot preserve duplicates because setting the same flag to true multiple times does not record additional occurrences.

For example:

Input:

`[4, 2, 4, 1, 3, 2, 4]`

Output:

`[1, 2, 3, 4]`

## 2. Counting Sort

Counting Sort modifies Boolean Sort by using an integer frequency array instead of a boolean array.

Each index stores the number of occurrences of its corresponding value.

### Steps

1. Find the maximum input value.
2. Create an integer array of length `max + 1`.
3. Loop through the input and increment `counts[value]`.
4. Create an output array with the same length as the input.
5. Examine the frequency array in ascending index order.
6. Insert each value into the output as many times as its frequency.

### Example

Input:

`[4, 2, 4, 1, 3, 2, 4]`

Frequency array:

```text
Index:  0  1  2  3  4
Counts: 0  1  2  1  3
```

Output:

`[1, 2, 2, 3, 4, 4, 4]`

Counting Sort preserves all duplicate occurrences.

## 3. Time Complexity

Let:

- `n` = number of input elements.
- `M` = maximum input value.
- `k = M + 1` = auxiliary array length.

| Operation | Boolean Sort | Counting Sort |
|---|---|---|
| Find maximum | O(n) | O(n) |
| Initialise auxiliary array | O(k) | O(k) |
| Record values | O(n) | O(n) |
| Reconstruct output | O(k) | O(n + k) |
| Overall time | O(n + k) | O(n + k) |

Since `k = M + 1`, both algorithms have:

**Time complexity: O(n + M)**

## 4. Space Complexity

- Boolean Sort uses a boolean array of length `M + 1`.
- Counting Sort uses a frequency array of length `M + 1` and an output array of length `n`.

Excluding the returned output array:

- Boolean Sort: O(M) auxiliary space.
- Counting Sort: O(M) auxiliary space.

Including all additional arrays:

- Boolean Sort: O(n + M) space in the general case.
- Counting Sort: O(n + M) space.

## 5. Drawbacks

1. **Large maximum values:** A large maximum value requires a large auxiliary array, even when the input contains very few elements.
2. **Negative integers:** The implementation uses values as array indices, so negative values require an offset or modification.
3. **Limited data types:** The algorithm is designed for integer keys and does not directly sort arbitrary objects or strings.
4. **Additional memory:** It creates auxiliary arrays instead of sorting entirely within the original array.

## 6. Algorithm Invariant

During the counting phase, each counter stores the exact number of occurrences of its corresponding value among the input elements processed so far.

After processing the complete input, the frequency array represents all input values and their occurrences.

During reconstruction, values are inserted into the output in ascending order according to their frequencies.

When reconstruction finishes, the output contains every input element in sorted order.

## 7. Test Cases

| Input | Boolean Sort | Counting Sort |
|---|---|---|
| `[4, 3, 8, 2]` | `[2, 3, 4, 8]` | `[2, 3, 4, 8]` |
| `[4, 2, 4, 1, 3, 2, 4]` | `[1, 2, 3, 4]` | `[1, 2, 2, 3, 4, 4, 4]` |
| `[5, 5, 5, 5]` | `[5]` | `[5, 5, 5, 5]` |
| `[1, 2, 3, 4, 5]` | `[1, 2, 3, 4, 5]` | `[1, 2, 3, 4, 5]` |
| `[]` | `[]` | `[]` |

## 8. Source Files

- `CountingSort.java`: Implements Boolean Sort, Counting Sort and the maximum-value helper method.
- `Main.java`: Tests both algorithms using different input arrays.