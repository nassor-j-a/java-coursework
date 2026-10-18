# Tutorial 11 — Exercise 1-9: StudyGroup

## Description

This exercise implements a `StudyGroup` class that manages a group of students belonging to the same faculty and studying at the same current year level.

The implementation builds upon the `Student` class from Exercise 1-8.

## Project Structure

```text
exercise-09-study-group/
├── README.md
└── src/
    └── main/
        └── java/
            ├── Student.java
            └── StudyGroup.java
```

## Attributes

The `StudyGroup` class contains three instance variables:

- `students`: an array containing the students in the group.
- `faculty`: the faculty shared by all students in the group.
- `currentStudyYear`: the group's current study year, interpreted in this implementation as a calendar year.

## Constructors

The constructor accepts an array of students and the current study year.

It validates that:
- The student array is not null or empty.
- The array does not contain null elements.
- All students belong to the same faculty.
- The current study year is positive.

The constructor copies the supplied array to prevent changes to the original array from directly affecting the group's membership.

## Methods

### `getNumberOfStudents()`

Returns the number of students currently in the group.

### `getFaculty()`

Returns the faculty associated with the group.

### `getCurrentStudyYear()`

Returns the group's current study year.

### `changeStudyGroup(Student student, StudyGroup newGroup)`

Transfers a student from the current group to another group.

The method:
1. Validates the student and destination group.
2. Checks that the student belongs to the current group.
3. Checks that the groups have the same current study year.
4. Changes the student's faculty to match the destination group.
5. Removes the student from the current group.
6. Adds the student to the destination group.

Changing the faculty also recalculates the student's expected graduation year.

### `graduateClass()`

Advances the current study year by one and removes students whose graduation year has been reached.

### `toString()`

Returns a readable summary of the group, including its faculty, current study year, number of students, and student names.

## Implementation Concepts

This exercise demonstrates:

- Classes and objects.
- Instance variables and constructors.
- Encapsulation and getter methods.
- Arrays and array resizing.
- Array traversal using enhanced `for` loops.
- Object references.
- Interaction between two classes.
- Method overriding using `toString()`.
- Validation using `IllegalArgumentException`.
- Copying arrays with `Arrays.copyOf()`.

## Test Cases

The `main()` method tests the following:

1. Creating Computer Science and Engineering study groups.
2. Displaying the contents of each group.
3. Counting the students in a group.
4. Transferring a student between groups.
5. Updating the student's faculty and graduation year.
6. Advancing the study year.
7. Removing students who have reached their graduation year.

## Compilation and Execution

From the exercise directory, compile both Java files:

```bash
javac src/main/java/Student.java src/main/java/StudyGroup.java
```

Run the test program:

```bash
java -cp src/main/java StudyGroup
```

## Assumption

The current study year is treated as a calendar year because the implementation compares it with the graduation year calculated by the `Student` class.