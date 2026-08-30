package main.java;

// Exercise 9-3 Student

public class Student {

    private String name;
    private double gpa;
    private boolean isSenior;

    // Default constructor
    public Student() {
    }

    // Constructor that initializes all instance variables
    public Student(String name, double gpa, boolean isSenior) {
        this.name = name;
        this.gpa = gpa;
        this.isSenior = isSenior;
    }

    public static void main(String[] args) {

        // Using the default constructor
        Student student1 = new Student();

        System.out.println("Student 1:");
        System.out.println("Name: " + student1.name);
        System.out.println("GPA: " + student1.gpa);
        System.out.println("Senior: " + student1.isSenior);

        System.out.println();

        // Using the overloaded constructor
        Student student2 = new Student("Jamal", 3.5, true);

        System.out.println("Student 2:");
        System.out.println("Name: " + student2.name);
        System.out.println("GPA: " + student2.gpa);
        System.out.println("Senior: " + student2.isSenior);
    }
}
