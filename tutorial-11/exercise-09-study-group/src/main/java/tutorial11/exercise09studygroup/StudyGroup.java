package tutorial11.exercise09studygroup;

import java.util.Arrays;

public class StudyGroup {

    // Tutorial 11 - Exercise 1-9: StudyGroup

    // Instance variables
    private Student[] students;
    private String faculty;
    private int currentStudyYear;

    /*
     * Constructor:
     * Creates a study group from an array of students
     * and the current study year.
     *
     * All students must belong to the same faculty.
     */
    public StudyGroup(Student[] students, int currentStudyYear) {

        // A group must contain at least one student
        if (students == null || students.length == 0) {
            throw new IllegalArgumentException(
                    "A study group must contain at least one student."
            );
        }

        if (currentStudyYear < 1) {
            throw new IllegalArgumentException(
                    "The current study year must be positive."
            );
        }

        // Validate that no array element is null
        for (Student student : students) {
            if (student == null) {
                throw new IllegalArgumentException(
                        "The student array cannot contain null values."
                );
            }
        }

        // Use the first student's faculty as the group faculty
        this.faculty = students[0].getFaculty();

        // Validate that all students belong to the same faculty
        for (Student student : students) {
            if (!student.getFaculty().equals(this.faculty)) {
                throw new IllegalArgumentException(
                        "All students must belong to the same faculty."
                );
            }
        }

        // Copy the array so that the caller's array is not stored directly
        this.students = Arrays.copyOf(students, students.length);

        this.currentStudyYear = currentStudyYear;
    }

    /*
     * Returns the number of students in the group.
     */
    public int getNumberOfStudents() {
        return students.length;
    }

    /*
     * Returns the faculty of the group.
     */
    public String getFaculty() {
        return faculty;
    }

    /*
     * Returns the current study year of the group.
     */
    public int getCurrentStudyYear() {
        return currentStudyYear;
    }

    /*
     * Checks whether a particular student belongs
     * to this group.
     */
    private boolean containsStudent(Student student) {

        for (Student currentStudent : students) {

            if (currentStudent == student) {
                return true;
            }
        }

        return false;
    }

    /*
     * Removes a student from the group.
     */
    private void removeStudent(Student student) {

        Student[] updatedStudents =
                new Student[students.length - 1];

        int index = 0;

        for (Student currentStudent : students) {

            // Skip the student being removed
            if (currentStudent != student) {
                updatedStudents[index] = currentStudent;
                index++;
            }
        }

        students = updatedStudents;
    }

    /*
     * Adds a student to the group.
     */
    private void addStudent(Student student) {

        // The student must belong to this group's faculty
        if (!student.getFaculty().equals(faculty)) {
            throw new IllegalArgumentException(
                    "The student's faculty does not match the group."
            );
        }

        // Do not add the same student twice
        if (containsStudent(student)) {
            throw new IllegalArgumentException(
                    "The student already belongs to this group."
            );
        }

        Student[] updatedStudents =
                Arrays.copyOf(students, students.length + 1);

        updatedStudents[updatedStudents.length - 1] = student;

        students = updatedStudents;
    }

    /*
     * Transfers a student from this group to another group.
     *
     * The student's faculty is changed to match the
     * destination group's faculty.
     */
    public void changeStudyGroup(
            Student student,
            StudyGroup newGroup) {

        if (student == null || newGroup == null) {
            throw new IllegalArgumentException(
                    "Student and destination group cannot be null."
            );
        }

        if (newGroup == this) {
            throw new IllegalArgumentException(
                    "The destination must be a different study group."
            );
        }

        if (!containsStudent(student)) {
            throw new IllegalArgumentException(
                    "The student does not belong to this group."
            );
        }

        // Both groups must be at the same study-year level
        if (currentStudyYear != newGroup.currentStudyYear) {
            throw new IllegalArgumentException(
                    "Both groups must have the same current study year."
            );
        }

        if (newGroup.containsStudent(student)) {
            throw new IllegalArgumentException(
                    "The student already belongs to the destination group."
            );
        }

        // Change the student's faculty to match the new group
        student.changeFaculty(newGroup.faculty);

        // Remove the student from the current group
        removeStudent(student);

        // Add the student to the destination group
        newGroup.addStudent(student);
    }

    /*
     * Advances the study year and removes students
     * whose graduation year has been reached.
     */
    public void graduateClass() {

        // Advance the group's current year
        currentStudyYear++;

        // Count the students who will remain
        int remainingCount = 0;

        for (Student student : students) {

            if (student.getYearOfGraduation() > currentStudyYear) {
                remainingCount++;
            }
        }

        // Create an array large enough for the remaining students
        Student[] remainingStudents =
                new Student[remainingCount];

        int index = 0;

        for (Student student : students) {

            // Keep students who have not yet reached graduation
            if (student.getYearOfGraduation() > currentStudyYear) {
                remainingStudents[index] = student;
                index++;
            }
        }

        // Replace the original array
        students = remainingStudents;
    }

    /*
     * Returns all students in the study group.
     */
    @Override
    public String toString() {

        StringBuilder result = new StringBuilder();

        result.append("Faculty: ")
              .append(faculty)
              .append("\nCurrent Study Year: ")
              .append(currentStudyYear)
              .append("\nNumber of Students: ")
              .append(students.length)
              .append("\nStudents:\n");

        for (Student student : students) {
            result.append("- ")
                  .append(student)
                  .append("\n");
        }

        return result.toString();
    }

    /*
     * Main method: tests the StudyGroup class.
     */
    public static void main(String[] args) {

        // Create students in Computer Science
        Student s1 = new Student(
                "Jamal Ali",
                3.7,
                "Computer Science",
                2026
        );

        Student s2 = new Student(
                "Sara Ahmed",
                3.5,
                "Computer Science",
                2026
        );

        Student s3 = new Student(
                "Omar Hassan",
                3.8,
                "Computer Science",
                2026
        );

        // Create a student in Engineering
        Student s4 = new Student(
                "Amina Yusuf",
                3.6,
                "Engineering",
                2026
        );

        // Create the study groups
        StudyGroup computerScienceGroup = new StudyGroup(
                new Student[]{s1, s2, s3},
                2029
        );

        StudyGroup engineeringGroup = new StudyGroup(
                new Student[]{s4},
                2029
        );

        // Display the initial groups
        System.out.println("=== Computer Science Group ===");
        System.out.println(computerScienceGroup);

        System.out.println("=== Engineering Group ===");
        System.out.println(engineeringGroup);

        // Test getNumberOfStudents()
        System.out.println(
                "Number of Computer Science students: "
                + computerScienceGroup.getNumberOfStudents()
        );

        // Transfer Jamal from Computer Science to Engineering
        System.out.println("\n=== Transferring Jamal ===");

        computerScienceGroup.changeStudyGroup(
                s1,
                engineeringGroup
        );

        System.out.println("Updated Jamal's faculty: "
                + s1.getFaculty());

        System.out.println("\nComputer Science Group:");
        System.out.println(computerScienceGroup);

        System.out.println("Engineering Group:");
        System.out.println(engineeringGroup);

        // Test graduateClass()
        System.out.println("=== Advancing the Study Year ===");

        // Advance the Computer Science group from 2029 to 2030
        computerScienceGroup.graduateClass();

        System.out.println(computerScienceGroup);

        // Advance the Engineering group from 2029 to 2030
        engineeringGroup.graduateClass();

        System.out.println(engineeringGroup);
    }
}