package tutorial14.exercise05sortedarraylist;

public class Main {

    public static void main(String[] args) {

        LinearSortedArrayList list = new LinearSortedArrayList();

        // Insert elements in an unsorted order
        System.out.println("Inserting elements:");

        list.orderedInsert(40);
        list.orderedInsert(10);
        list.orderedInsert(50);
        list.orderedInsert(20);
        list.orderedInsert(30);

        list.display();

        System.out.println("\nCurrent size: " + list.getSize());

        // Test iterative binary search
        System.out.println("\nIterative Binary Search:");

        System.out.println("Position of 30: " + list.binarySearchIter(30));
        System.out.println("Position of 60: " + list.binarySearchIter(60));

        // Test recursive binary search
        System.out.println("\nRecursive Binary Search:");

        System.out.println("Position of 40: " + list.binarySearchRec(40));
        System.out.println("Position of 60: " + list.binarySearchRec(60));

        // Delete an existing element
        System.out.println("\nDeleting 30:");

        list.delete(30);
        list.display();

        System.out.println("Current size: " + list.getSize());

        // Delete a non-existent element
        System.out.println("\nDeleting 60:");

        list.delete(60);
        list.display();

        System.out.println("Current size: " + list.getSize());

        // Insert another element after deletion
        System.out.println("\nInserting 35:");

        list.orderedInsert(35);
        list.display();

        System.out.println("Current size: " + list.getSize());
    }
}