package main.java.tutorial15.exercise06studentrecords;

public class StudentSorter {

    public static void insertionSort(Student[] students) {

        // Start at index 1 because the first element is already sorted.
        for (int i = 1; i < students.length; i++) {

            // Store the current student.
            Student current = students[i];

            // Start comparing with the student immediately before it.
            int j = i - 1;

            // Move students with names alphabetically after current to the right.
            while (j >= 0 &&
                   students[j].getName().compareToIgnoreCase(current.getName()) > 0) {

                students[j + 1] = students[j];

                j--;
            }

            // Insert current into its correct position.
            students[j + 1] = current;
        }
    }
}