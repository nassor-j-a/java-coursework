package tutorial14.exercise04sortedarray;

public class Main {

    public static void main(String[] args) {

        LinearSortedArray array = new LinearSortedArray(10);

        // Insert elements in an unsorted order
        System.out.println("Inserting elements:");

        array.orderedInsert(40);
        array.orderedInsert(10);
        array.orderedInsert(50);
        array.orderedInsert(20);
        array.orderedInsert(30);

        array.display();

        System.out.println("\nCurrent size: " + array.getSize());

        // Test iterative binary search
        System.out.println("\nIterative Binary Search:");

        System.out.println("Position of 30: " + array.binarySearchIter(30));
        System.out.println("Position of 60: " + array.binarySearchIter(60));

        // Test recursive binary search
        System.out.println("\nRecursive Binary Search:");

        System.out.println("Position of 40: " + array.binarySearchRec(40));
        System.out.println("Position of 60: " + array.binarySearchRec(60));

        // Delete an existing element
        System.out.println("\nDeleting 30:");

        array.delete(30);
        array.display();

        System.out.println("Current size: " + array.getSize());

        // Delete a non-existent element
        System.out.println("\nDeleting 60:");

        array.delete(60);
        array.display();

        System.out.println("Current size: " + array.getSize());

        // Insert another element after deletion
        System.out.println("\nInserting 35:");

        array.orderedInsert(35);
        array.display();

        System.out.println("Current size: " + array.getSize());
    }
}