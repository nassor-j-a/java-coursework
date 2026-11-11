# Tutorial 14 – Exercise 1-4: Sorted Array

## Objective

Implement a class called `LinearSortedArray` that stores integers in a fixed-size array and maintains them in ascending order.

## Class: LinearSortedArray

### Instance Variables

- `int[] arr` – stores the integer elements.
- `int size` – tracks the number of elements currently stored.

### Implemented Methods

| Method | Description |
|---|---|
| `orderedInsert(int x)` | Inserts an integer at its correct position while maintaining ascending order. |
| `binarySearchIter(int x)` | Iteratively searches for an integer and returns its index or -1. |
| `binarySearchRec(int x)` | Recursively searches for an integer and returns its index or -1. |
| `delete(int x)` | Deletes an integer and shifts subsequent elements to the left. |
| `display()` | Displays the elements currently stored. |
| `getSize()` | Returns the current number of elements. |

## Implementation Details

### Ordered Insertion

The method starts from the last occupied position and shifts larger elements one position to the right before inserting the new integer.

### Iterative Binary Search

Uses `low`, `high` and `mid` variables to repeatedly divide the search interval into two halves.

### Recursive Binary Search

Uses a helper method with `low` and `high` parameters. The recursion stops when the element is found or the search interval becomes empty.

### Deletion

Uses iterative binary search to locate the element, then shifts subsequent elements to the left.

## Testing

The Main class tests:

1. Inserting integers in an unsorted order.
2. Maintaining ascending order.
3. Iterative binary search.
4. Recursive binary search.
5. Deleting an existing element.
6. Attempting to delete a non-existent element.
7. Inserting another element after deletion.

## Complexity Analysis

| Operation | Time Complexity |
|---|---|
| Ordered Insert | O(n) |
| Iterative Binary Search | O(log n) |
| Recursive Binary Search | O(log n) |
| Delete | O(n) |

## Compilation and Execution

Run these commands from the exercise directory:

```bash
javac -d out src/main/java/tutorial14/exercise04sortedarray/*.java

java -cp out tutorial14.exercise04sortedarray.Main
```