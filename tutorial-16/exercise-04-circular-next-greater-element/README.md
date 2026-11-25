# Exercise 3-4: Find Next Greater Element in a Circular Array

## Problem

Given an integer array, find the next greater element for every position.

The array is circular, meaning that after reaching the last element, the search continues from the beginning.

If no greater element exists, return `-1`.

## Examples

**Example 1**

Input:
```text
[4, 5, 2, 10, 3]
```

Output:
```text
[5, 10, 10, -1, 4]
```

**Example 2**

Input:
```text
[4, -2, 5, 8]
```

Output:
```text
[5, 5, 8, -1]
```

## Implementation

The solution uses a stack and traverses the array twice, from right to left.

The modulo operator (`%`) converts virtual indices into valid array indices, allowing the traversal to wrap around.

For each element:
1. Remove stack elements that are less than or equal to the current value.
2. If the stack is empty, record `-1`.
3. Otherwise, record the value at the top of the stack.
4. Push the current value onto the stack.

Answers are recorded only during the second pass.

## Data Structure

- `ArrayDeque<Integer>` implements the stack.
- `Deque<Integer>` provides the stack operations.
- The result is stored in an integer array.

## Complexity Analysis

Let `n` be the number of elements.

| Operation | Complexity |
|---|---|
| Traversal | O(n) |
| Push and pop operations | O(n) total |
| Overall time | **O(n)** |
| Auxiliary space | **O(n)** |
| Result array space | O(n) |

Although the algorithm makes two passes, it still has linear time complexity.

Each element is pushed once per pass, and each pushed element can be popped at most once.

## Files

- `CircularNextGreaterElement.java` – Contains the circular next greater element algorithm.
- `Main.java` – Tests the implementation with different arrays.