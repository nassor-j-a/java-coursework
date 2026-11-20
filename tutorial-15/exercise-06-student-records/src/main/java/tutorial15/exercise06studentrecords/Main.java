package main.java.tutorial15.exercise06studentrecords;

public class Main {

    public static void main(String[] args) {

        Student[] students = {
            new Student("Zainab Ali", "S004", 3.6),
            new Student("Adam Hassan", "S001", 3.8),
            new Student("Maryam Omar", "S003", 3.9),
            new Student("Bilal Ahmed", "S002", 3.4),
            new Student("Fatima Noor", "S005", 3.7)
        };

        System.out.println("Before sorting:");
        displayStudents(students);

        StudentSorter.insertionSort(students);

        System.out.println("\nAfter sorting by name:");
        displayStudents(students);
    }

    public static void displayStudents(Student[] students) {

        for (Student student : students) {
            System.out.println(student);
        }
    }
}
