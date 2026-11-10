package tutorial14.exercise03unsortedarrayobjects;

public class Main {

    public static void main(String[] args) {

        LinearArrayStudents array = new LinearArrayStudents(5);

        Student s1 = new Student("Jamal", "Ali", 101);
        Student s2 = new Student("Maryam", "Hassan", 102);
        Student s3 = new Student("Ahmed", "Omar", 103);
        Student s4 = new Student("Fatma", "Said", 104);

        // Insert students
        System.out.println("Inserting students:");

        array.insert(s1);
        array.insert(s2);
        array.insert(s3);
        array.insert(s4);

        array.display();

        System.out.println("\nCurrent size: " + array.getSize());

        // Search for an existing student
        System.out.println("\nSearching for student ID 103:");

        Student searchStudent = new Student("Ahmed", "Omar", 103);

        System.out.println("Position: " + array.linearSearch(searchStudent));

        // Search for a non-existent student
        System.out.println("\nSearching for student ID 105:");

        Student missingStudent = new Student("John", "Doe", 105);

        System.out.println("Position: " + array.linearSearch(missingStudent));

        // Delete an existing student
        System.out.println("\nDeleting student ID 102:");

        array.delete(s2);

        array.display();

        System.out.println("\nCurrent size: " + array.getSize());

        // Attempt to delete a non-existent student
        System.out.println("\nDeleting student ID 105:");

        array.delete(missingStudent);

        System.out.println("\nCurrent size: " + array.getSize());
    }
}