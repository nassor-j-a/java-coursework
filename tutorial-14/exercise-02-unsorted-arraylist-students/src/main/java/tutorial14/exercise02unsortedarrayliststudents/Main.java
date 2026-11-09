package main.java.tutorial14.exercise02unsortedarrayliststudents;

public class Main {

    public static void main(String[] args) {

        LinearArrayListStudents list = new LinearArrayListStudents();

        Student s1 = new Student(101, "Jamal");
        Student s2 = new Student(102, "Ali");
        Student s3 = new Student(103, "Maryam");
        Student s4 = new Student(104, "Ahmed");

        // Insert students
        System.out.println("Inserting students:");

        list.insert(s1);
        list.insert(s2);
        list.insert(s3);
        list.insert(s4);

        list.display();

        System.out.println("\nTotal students: " + list.getSize());

        // Search for an existing student
        System.out.println("\nSearching for student 102:");

        Student searchStudent = new Student(102, "Ali");

        int position = list.linearSearch(searchStudent);

        System.out.println("Position: " + position);

        // Search for a non-existent student
        System.out.println("\nSearching for student 105:");

        Student missingStudent = new Student(105, "Fatma");

        System.out.println("Position: " + list.linearSearch(missingStudent));

        // Delete an existing student
        System.out.println("\nDeleting student 103:");

        list.delete(s3);

        list.display();

        System.out.println("Total students: " + list.getSize());

        // Attempt to delete a non-existent student
        System.out.println("\nDeleting student 105:");

        list.delete(missingStudent);

        System.out.println("Total students: " + list.getSize());
    }
}