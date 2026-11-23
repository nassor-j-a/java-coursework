# Exercise 3-1: Search in a Stack

## Objective

Implement a method that searches for an element in a stack and returns its position, counting from the top.

The method must:
- Return `0` if the element is at the top.
- Return `1` if one element is above it.
- Return the corresponding position for other occurrences.
- Return `-1` if the element does not exist.
- Return the position of the topmost occurrence when duplicates exist.
- Preserve the original stack contents and order.

## Implementation

The solution uses two approaches.

### 1. Internal Search – ArrayStack.java

The `search(int target)` method is implemented directly inside the `ArrayStack` class.

It traverses the underlying array from the top index towards index zero.

The method does not modify the stack.

**Complexity:**
- Time: O(n)
- Auxiliary space: O(1)

### 2. External Search – StackSearching.java

The `searchFor(ArrayStack original, int target)` method is implemented in a separate class.

It uses a temporary stack to inspect the original stack:

1. Pop elements from the original stack.
2. Push them onto the temporary stack.
3. Record the position of the first matching element.
4. Continue until the original stack is empty.
5. Transfer all elements back to the original stack.

**Complexity:**
- Time: O(n)
- Auxiliary space: O(n)

### 3. Main.java

Tests both implementations using:
- An element at the top.
- An element occurring multiple times.
- An element in the middle.
- An element that does not exist.

It also displays the stack before and after searching to verify that its contents and order remain unchanged.

## Sample Stack

Bottom to top:

`[20, 4, 7, 20, 1]`

Expected search results:

| Target | Position |
|---|---:|
| 1 | 0 |
| 20 | 1 |
| 7 | 2 |
| 4 | 3 |
| 99 | -1 |

## Key Concepts

- LIFO (Last In, First Out).
- Array-based stack implementation.
- Stack traversal.
- Temporary stacks.
- Preserving stack contents and order.
- Time and space complexity.