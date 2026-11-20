# Exercise 2-6: Student Records

## Objective

Implement a sorting algorithm to sort student records alphabetically by name.

Each student record contains:
- Name
- Student ID
- GPA

## Implementation

The solution uses **Insertion Sort** to arrange student records in alphabetical order based on their names.

### Classes

1. `Student.java`
   - Represents a student.
   - Stores the student's name, ID and GPA.
   - Provides getter methods and a formatted `toString()` method.

2. `StudentSorter.java`
   - Implements the Insertion Sort algorithm.
   - Compares student names using `compareToIgnoreCase()`.
   - Moves complete student objects to preserve their associated information.

3. `Main.java`
   - Creates sample student records.
   - Displays the original records.
   - Calls the sorting method.
   - Displays the sorted records.

## Algorithm

1. Begin with the second student.
2. Store the current student temporarily.
3. Compare the current student's name with names in the sorted section.
4. Shift students whose names come alphabetically after the current student one position to the right.
5. Insert the current student into the available position.
6. Repeat until all students have been processed.

## Complexity Analysis

| Case | Time Complexity |
|---|---|
| Best | O(n) |
| Average | O(n²) |
| Worst | O(n²) |

Auxiliary space complexity: O(1).

## Stability

The algorithm is stable because it does not move records past other records with equal names.

## Sorting Invariant

At the beginning of each iteration, all student records from index `0` to `i - 1` are sorted alphabetically by name.

## Assumptions

- Student names are compared without distinguishing uppercase and lowercase letters.
- Student IDs and GPAs remain attached to their respective student records.
- The original array is sorted in place.