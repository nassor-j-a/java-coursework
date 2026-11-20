package main.java.tutorial15.exercise06studentrecords;

public class Student {

    private String name;
    private String studentId;
    private double gpa;

    public Student(String name, String studentId, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public String getStudentId() {
        return studentId;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return String.format(
            "Name: %-15s | ID: %-6s | GPA: %.2f",
            name, studentId, gpa
        );
    }
}