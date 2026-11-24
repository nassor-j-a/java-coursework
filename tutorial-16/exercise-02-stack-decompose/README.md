# Exercise 3-2: Stack Decompose

## Objective

Implement an external method:

`public static ArrayStack decompose(ArrayStack x)`

The method separates the original stack into two groups:

- Odd-positioned elements remain in the original stack `x`.
- Even-positioned elements are moved into a new stack `y`.

Position counting starts at the top, with position 1.

The relative order of elements must remain unchanged in both stacks.

## Implementation

### 1. ArrayStack.java

Implements the array-based stack and its basic operations:

- `push()`
- `pop()`
- `top()`
- `isEmpty()`
- `size()`
- `printStack()`

### 2. StackDecomposer.java

Implements the external `decompose()` method using only stacks.

The method uses:
- The original stack `x`.
- A temporary stack to reverse the original order.
- A new stack `y` for even-positioned elements.

### 3. Main.java

Creates the sample stack, calls `decompose()` and displays both resulting stacks.

## Algorithm

1. Create a temporary stack and a new stack `y`.
2. Record the original size of `x`.
3. Transfer all elements from `x` to the temporary stack.
4. Initialise the original position counter to the original stack size.
5. Pop elements from the temporary stack.
6. If the original position is even, push the element into `y`.
7. Otherwise, push it back into `x`.
8. Decrement the position counter.
9. Return `y`.

## Sample Input

Original stack, top to bottom:

`[7, 2, 1, 4, 5, 3, 9, 6]`

## Expected Output

Stack `x` (odd positions), top to bottom:

`[7, 1, 5, 9]`

Stack `y` (even positions), top to bottom:

`[2, 4, 3, 6]`

## Complexity Analysis

| Operation | Complexity |
|---|---|
| Transfer to temporary stack | O(n) |
| Distribute elements | O(n) |
| Total time | O(n) |
| Auxiliary space | O(n) |

## Algorithm Invariant

During distribution, every processed element has been placed in its correct destination stack according to its original position.

The elements are neither lost nor duplicated, and their relative order is preserved.

## Restrictions

Only stack data structures are used for storing and manipulating the elements. No arrays, lists, queues or other auxiliary data structures are used by the decomposition method.