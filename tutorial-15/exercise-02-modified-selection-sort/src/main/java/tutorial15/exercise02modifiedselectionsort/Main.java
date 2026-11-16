package tutorial15.exercise02modifiedselectionsort;

public class Main {

    public static void main(String[] args) {

        // First required test case
        int[] array1 = {6, 4, 5};

        System.out.println("First test case:");
        System.out.print("Before sorting: ");
        ModifiedSelectionSort.display(array1);

        ModifiedSelectionSort.sort(array1);

        System.out.print("After sorting:  ");
        ModifiedSelectionSort.display(array1);


        // Second required test case
        int[] array2 = {2, 6, 8, 1, 7, 9, 4, 3, 5};

        System.out.println("\nSecond test case:");
        System.out.print("Before sorting: ");
        ModifiedSelectionSort.display(array2);

        ModifiedSelectionSort.sort(array2);

        System.out.print("After sorting:  ");
        ModifiedSelectionSort.display(array2);


        // Additional edge cases
        int[] array3 = {9, 2};

        System.out.println("\nTwo-element test case:");
        ModifiedSelectionSort.sort(array3);
        ModifiedSelectionSort.display(array3);

        int[] array4 = {5, 5, 5, 5};

        System.out.println("\nDuplicate-elements test case:");
        ModifiedSelectionSort.sort(array4);
        ModifiedSelectionSort.display(array4);

        int[] array5 = {};

        System.out.println("\nEmpty-array test case:");
        ModifiedSelectionSort.sort(array5);
        ModifiedSelectionSort.display(array5);
    }
}