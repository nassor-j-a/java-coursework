package main.java.tutorial14.exercise01unsortedarray;

public class Main {

    public static void main(String[] args) {

        // Create a LinearArray with capacity 8
        LinearArray array = new LinearArray(8);

        // Test insertLast()
        System.out.println("Inserting elements at the end:");

        array.insertLast(5);
        array.insertLast(9);
        array.insertLast(3);

        array.display();

        // Test insertFirst()
        System.out.println("\nInserting an element at the beginning:");

        array.insertFirst(2);

        array.display();

        // Test linearSearch()
        System.out.println("\nSearching for elements:");

        System.out.println("Position of 9: " + array.linearSearch(9));
        System.out.println("Position of 7: " + array.linearSearch(7));

        // Test delete()
        System.out.println("\nDeleting an element:");

        array.delete(5);

        array.display();

        // Test deleting a non-existent element
        System.out.println("\nDeleting a non-existent element:");

        array.delete(7);

        array.display();

        // Display the current size
        System.out.println("\nCurrent size: " + array.getSize());
    }
}