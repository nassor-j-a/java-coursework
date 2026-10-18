# Tutorial 11 — Exercise 1-8: Student

## Description

This exercise implements a Java class called `Student`, representing a student using their name, GPA, faculty, enrollment year, and calculated graduation year.

The class demonstrates constructors, constructor overloading, constructor chaining, instance methods, and method overriding.

## Instance Variables

| Attribute | Type | Description |
|---|---|---|
| `name` | `String` | Student's name |
| `gpa` | `double` | Student's Grade Point Average |
| `faculty` | `String` | Student's faculty |
| `yearOfEnrollment` | `int` | Year the student enrolled |
| `yearOfGraduation` | `int` | Calculated graduation year |

## Faculty Durations

| Faculty | Duration |
|---|---:|
| Engineering | 5 years |
| Computer Science | 4 years |
| Medicine | 7 years |

The graduation year is calculated as:

`yearOfGraduation = yearOfEnrollment + facultyDuration`

## Constructors

### Constructor 1

`Student(String name, double gpa, String faculty, int yearOfEnrollment)`

Initializes a student using the name, GPA, faculty, and enrollment year. The graduation year is calculated automatically.

### Constructor 2

`Student(String name, String faculty, int yearOfEnrollment)`

Initializes a student without a supplied GPA. The GPA defaults to `0.0`, and the graduation year is calculated automatically.

The second constructor uses constructor chaining to reuse the first constructor's initialization logic.

## Methods

| Method | Purpose |
|---|---|
| `getYearOfGraduation()` | Returns the calculated graduation year |
| `changeFaculty(String faculty)` | Changes the faculty and recalculates the graduation year |
| `modifyGPA(double gpa)` | Updates the student's GPA |
| `toString()` | Returns the student's name |

A helper method determines the required duration for each faculty. Unsupported faculty names result in an `IllegalArgumentException`.

## Program Demonstration

The `main()` method:

1. Creates a student using the constructor that accepts a GPA.
2. Displays the student's attributes and graduation year.
3. Creates another student using the constructor without a GPA.
4. Changes the first student's faculty to Medicine.
5. Displays the updated graduation year.
6. Modifies the student's GPA.
7. Tests the overridden `toString()` method.

## Example Calculations

For a student enrolling in Computer Science in 2026:

`2026 + 4 = 2030`

If the student changes to Medicine:

`2026 + 7 = 2033`

The enrollment year remains unchanged.

## Compilation and Execution

From the exercise directory, run:

```bash
javac src/main/java/Student.java
java -cp src/main/java Student
```

## Concepts Practised

- Classes and objects
- Instance variables
- Default values
- Constructor overloading
- Constructor chaining using `this()`
- Calculating derived attributes
- Updating object attributes
- Helper methods
- Exception handling for unsupported faculty names
- Overriding `toString()`