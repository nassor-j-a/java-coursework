# Exercise 3-3: Next Greater Element

## Objective

Find the Next Greater Element (NGE) for every element in an integer array.

The NGE is the first element to the right that is strictly greater than the current element.

If no greater element exists, return `-1`.

## Implementation

### 1. NextGreaterElement.java

Implements:

`public static int[] findNGE(int[] array)`

The method uses a stack implemented with Java's `ArrayDeque`.

The algorithm:
1. Traverse the array from right to left.
2. Remove stack elements that are smaller than or equal to the current element.
3. If the stack is empty, store `-1`.
4. Otherwise, store the top element as the NGE.
5. Push the current element onto the stack.
6. Return the result array.

### 2. Main.java

Tests the algorithm using:
- The required example.
- A descending array.
- An ascending array.
- Duplicate values.
- Negative values.
- An empty array.

## Sample Input

`[4, 5, 2, 10]`

## Expected Output

`[5, 10, 10, -1]`

## Complexity Analysis

| Complexity | Result | Explanation |
|---|---|---|
| Time | O(n) | Each element is pushed once and popped at most once. |
| Auxiliary space | O(n) | The stack can store up to n elements. |
| Total additional space | O(n) | Includes the result array and stack. |

## Algorithm Invariant

At the beginning of each iteration at index `i`, the result entries to the right of `i` have been correctly calculated.

The stack contains potential greater-element candidates from the processed right-hand portion of the array. Its elements are strictly increasing from top to bottom.

## Key Concepts

- Next Greater Element.
- Stack operations: push, pop and peek.
- Monotonic stack.
- Right-to-left traversal.
- Linear time complexity.

## Conclusion

The stack-based solution avoids nested searching by removing elements that cannot be the Next Greater Element. Each element enters and leaves the stack at most once, giving O(n) time complexity.