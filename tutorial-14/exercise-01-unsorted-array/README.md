# Tutorial 14 — Exercise 1-1: Unsorted Array

## Objective

Implement a custom unsorted integer array using a standard Java array and an integer variable to track the number of stored elements.

## Class Design

### LinearArray

The class contains two instance variables:

- `arr`: Stores the integer elements.
- `size`: Tracks the current number of elements.

### Implemented Methods

| Method | Description |
|---|---|
| `insertLast(int x)` | Inserts an element at the end of the array. |
| `insertFirst(int x)` | Inserts an element at the beginning by shifting existing elements right. |
| `linearSearch(int x)` | Returns the index of the first matching element or `-1` if not found. |
| `delete(int x)` | Deletes the first occurrence of an element by shifting subsequent elements left. |
| `display()` | Prints the elements currently stored. |
| `getSize()` | Returns the current number of elements. |

## Implementation Details

### 1. Insertion at the end

The new element is stored at index `size`, after which `size` increases by one.

### 2. Insertion at the beginning

Existing elements are shifted one position to the right, starting from the last occupied position. The new element is then stored at index `0`.

### 3. Linear search

The method checks each element from index `0` to `size - 1`. It returns the first matching index or `-1` if the element does not exist.

### 4. Deletion

The method first searches for the requested element. If found, subsequent elements shift one position to the left and `size` decreases by one.

The implementation deletes only the first occurrence when duplicate values exist.

### 5. Capacity handling

The array has a fixed capacity specified through its constructor. Insertion methods check whether the array is full before adding an element.

## Sample Output

```text
Inserting elements at the end:
[5, 9, 3]

Inserting an element at the beginning:
[2, 5, 9, 3]

Searching for elements:
Position of 9: 2
Position of 7: -1

Deleting an element:
[2, 9, 3]

Deleting a non-existent element:
7 was not found.
[2, 9, 3]

Current size: 3
```

## Time Complexity

Let `n` represent the current number of elements.

| Operation | Time Complexity | Reason |
|---|---|---|
| `insertLast()` | O(1) | Adds an element at the next available index. |
| `insertFirst()` | O(n) | Shifts existing elements to the right. |
| `linearSearch()` | O(n) | May inspect every element. |
| `delete()` | O(n) | Searches for the element and may shift subsequent elements. |

## Key Concepts

- Array indexing and capacity.
- Tracking the number of stored elements.
- Insertion through element shifting.
- Sequential searching.
- Deletion through element shifting.
- Handling a full array.