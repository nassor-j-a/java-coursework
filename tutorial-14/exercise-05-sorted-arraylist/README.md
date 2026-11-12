# Tutorial 14 – Exercise 1-5: Sorted Array List

## Objective

Enhance the implementation from Exercise 1-4 by replacing the fixed-size integer array with Java's `ArrayList<Integer>`.

The list maintains its elements in ascending order.

## Class: LinearSortedArrayList

### Instance Variable

- `ArrayList<Integer> list` – stores the integers in ascending order.

### Implemented Methods

| Method | Description |
|---|---|
| `orderedInsert(int x)` | Inserts an integer at its correct position. |
| `binarySearchIter(int x)` | Iteratively searches for an integer and returns its index or -1. |
| `binarySearchRec(int x)` | Recursively searches for an integer and returns its index or -1. |
| `delete(int x)` | Removes the first occurrence of an integer. |
| `display()` | Displays the elements. |
| `getSize()` | Returns the current number of elements. |

## ArrayList Methods Used

- `add(index, element)` – inserts an element at a specified position.
- `get(index)` – retrieves an element at a specified index.
- `remove(index)` – removes an element at a specified index.
- `size()` – returns the number of elements.

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
| Get Size | O(1) |

## Compilation and Execution

Run these commands from the exercise directory:

```bash
javac -d out src/main/java/tutorial14/exercise05sortedarraylist/*.java

java -cp out tutorial14.exercise05sortedarraylist.Main
```