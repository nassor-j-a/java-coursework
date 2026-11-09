package main.java.tutorial14.exercise02unsortedarrayliststudents;

import java.util.ArrayList;

public class LinearArrayListStudents {

    private ArrayList<Student> students;
    private int size;

    public LinearArrayListStudents() {
        students = new ArrayList<>();
        size = 0;
    }

    // Inserts a student at the end of the ArrayList
    public void insert(Student x) {
        students.add(x);
        size++;
    }

    // Returns the position of a student, or -1 if not found
    public int linearSearch(Student x) {
        return students.indexOf(x);
    }

    // Deletes a specific student from the ArrayList
    public void delete(Student x) {

        if (students.remove(x)) {
            size--;
        } else {
            System.out.println("Student not found.");
        }
    }

    // Displays all students
    public void display() {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    // Returns the total number of students
    public int getSize() {
        return size;
    }
}
