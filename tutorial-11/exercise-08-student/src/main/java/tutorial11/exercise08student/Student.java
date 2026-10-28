package tutorial11.exercise08student;

public class Student {

    // Tutorial 11 - Exercise 1-8: Student

    // Instance variables
    private String name;
    private double gpa;
    private String faculty;
    private int yearOfEnrollment;
    private int yearOfGraduation;

    /*
     * Returns the number of years required to complete
     * the degree for the specified faculty.
     */
    private static int getFacultyDuration(String faculty) {

        switch (faculty) {
            case "Engineering":
                return 5;

            case "Computer Science":
                return 4;

            case "Medicine":
                return 7;

            default:
                throw new IllegalArgumentException(
                        "Invalid faculty: " + faculty
                );
        }
    }

    /*
     * Calculates the graduation year using the
     * enrollment year and the faculty duration.
     */
    private void calculateGraduationYear() {
        yearOfGraduation = yearOfEnrollment
                + getFacultyDuration(faculty);
    }

    /*
     * Constructor 1:
     * Initializes a student using name, GPA, faculty,
     * and year of enrollment.
     */
    public Student(String name, double gpa,
                   String faculty, int yearOfEnrollment) {

        this.name = name;
        this.gpa = gpa;
        this.faculty = faculty;
        this.yearOfEnrollment = yearOfEnrollment;

        // Calculate the graduation year
        calculateGraduationYear();
    }

    /*
     * Constructor 2:
     * Initializes a student using name, faculty,
     * and year of enrollment.
     *
     * GPA is initialized to 0.0.
     */
    public Student(String name, String faculty,
                   int yearOfEnrollment) {

        this(name, 0.0, faculty, yearOfEnrollment);
    }

    /*
     * Returns the year of graduation.
     */
    public int getYearOfGraduation() {
        return yearOfGraduation;
    }

    /*
     * Changes the student's faculty and recalculates
     * the graduation year.
     */
    public void changeFaculty(String faculty) {
        this.faculty = faculty;
        calculateGraduationYear();
    }

    /*
     * Modifies the student's GPA.
     */
    public void modifyGPA(double gpa) {
        this.gpa = gpa;
    }

    /*
     * Returns the student's name as a String.
     */
    @Override
    public String toString() {
        return name;
    }

    /*
     * Main method: tests the Student class.
     */
    public static void main(String[] args) {

        // Test constructor 1
        Student s1 = new Student(
                "Jamal Ali",
                3.7,
                "Computer Science",
                2026
        );

        System.out.println("Student 1: " + s1);
        System.out.println("Faculty: " + s1.faculty);
        System.out.println("GPA: " + s1.gpa);
        System.out.println("Enrollment Year: "
                + s1.yearOfEnrollment);
        System.out.println("Graduation Year: "
                + s1.getYearOfGraduation());

        // Test constructor 2
        Student s2 = new Student(
                "Sara Ahmed",
                "Engineering",
                2026
        );

        System.out.println("\nStudent 2: " + s2);
        System.out.println("Faculty: " + s2.faculty);
        System.out.println("GPA: " + s2.gpa);
        System.out.println("Graduation Year: "
                + s2.getYearOfGraduation());

        // Test changeFaculty()
        System.out.println("\nChanging Jamal's faculty to Medicine...");
        s1.changeFaculty("Medicine");

        System.out.println("New Faculty: " + s1.faculty);
        System.out.println("New Graduation Year: "
                + s1.getYearOfGraduation());

        // Test modifyGPA()
        s1.modifyGPA(3.9);

        System.out.println("Updated GPA: " + s1.gpa);

        // Test toString()
        System.out.println("\ntoString() test: " + s1);
    }
}