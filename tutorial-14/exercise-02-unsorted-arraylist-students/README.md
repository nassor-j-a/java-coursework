# Tutorial 14 – Exercise 1-2: Unsorted ArrayList of Students

## Objective

Implement a class called `LinearArrayListStudents` represented by:
- An `ArrayList<Student>` containing student objects.
- An integer variable tracking the number of elements.

## Classes

### 1. Student
Represents an individual student with:
- `studentId`
- `name`

The class overrides `equals()` and `hashCode()` so students are identified by their student ID.

### 2. LinearArrayListStudents

Implements the following methods:

| Method | Description |
|---|---|
| `insert(Student x)` | Inserts a student at the end of the list. |
| `linearSearch(Student x)` | Returns the student's index or `-1` if not found. |
| `delete(Student x)` | Removes the specified student. |
| `display()` | Displays all students. |
| `getSize()` | Returns the current number of students. |

## ArrayList Methods Used

- `add(x)` – appends a student.
- `indexOf(x)` – searches for a student.
- `remove(x)` – removes the first matching student.

## Testing

The `Main` class tests:
1. Inserting four students.
2. Searching for an existing student.
3. Searching for a non-existent student.
4. Deleting an existing student.
5. Attempting to delete a non-existent student.
6. Checking the updated size.

## Complexity Analysis

| Operation | Time Complexity |
|---|---|
| Insert | O(1) amortised |
| Linear Search | O(n) |
| Delete | O(n) |
| Get Size | O(1) |

## Compilation and Execution

From the exercise directory:

```bash
javac -d out src/main/java/tutorial14/exercise02unsortedarrayliststudents/*.java
java -cp out tutorial14.exercise02unsortedarrayliststudents.Main
```