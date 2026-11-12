# Tutorial 14 – Exercise 1-3: Unsorted Array of Objects

## Objective

Modify the integer-based `LinearArray` implementation from Exercise 1-1 to store objects of type `Student`.

## Classes

### 1. Student

Represents a student using three attributes:

- `firstName`
- `lastName`
- `id`

The class includes a constructor, getter methods and an overridden `toString()` method.

### 2. LinearArrayStudents

Represents an unsorted array of Student objects.

Instance variables:

- `Student[] arr` – stores student references.
- `int size` – tracks the number of inserted students.

### Implemented Methods

| Method | Description |
|---|---|
| `insert(Student x)` | Inserts a student at the end of the array. |
| `linearSearch(Student x)` | Searches using the student ID and returns the index or -1. |
| `delete(Student x)` | Removes a student and shifts subsequent elements. |
| `display()` | Displays the stored students. |
| `getSize()` | Returns the current number of students. |

## Testing

The Main class tests:

1. Inserting students.
2. Searching for an existing student.
3. Searching for a non-existent student.
4. Deleting an existing student.
5. Attempting to delete a non-existent student.
6. Checking the updated array size.

## Complexity Analysis

| Operation | Time Complexity |
|---|---|
| Insert | O(1) |
| Linear Search | O(n) |
| Delete | O(n) |
| Get Size | O(1) |

## Compilation and Execution

Run these commands from the exercise directory:

```bash
javac -d out src/main/java/tutorial14/exercise03unsortedarrayobjects/*.java

java -cp out tutorial14.exercise03unsortedarrayobjects.Main
```