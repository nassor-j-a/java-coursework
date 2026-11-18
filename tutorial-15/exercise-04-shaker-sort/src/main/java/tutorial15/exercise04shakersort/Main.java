package main.java.tutorial15.exercise04shakersort;

public class Main {

    public static void main(String[] args) {

        // Required example
        int[] array1 = {7, 5, 11, 10, 8};

        System.out.println("First test case:");
        System.out.print("Before sorting: ");
        ShakerSort.display(array1);

        ShakerSort.shakerSort(array1);

        System.out.print("After sorting:  ");
        ShakerSort.display(array1);


        // Reverse-sorted array
        int[] array2 = {9, 8, 7, 6, 5, 4, 3, 2, 1};

        System.out.println("\nSecond test case (reverse sorted):");
        ShakerSort.shakerSort(array2);
        ShakerSort.display(array2);


        // Already sorted array
        int[] array3 = {1, 2, 3, 4, 5};

        System.out.println("\nThird test case (already sorted):");
        ShakerSort.shakerSort(array3);
        ShakerSort.display(array3);


        // Array with duplicate values
        int[] array4 = {5, 2, 5, 1, 2, 4};

        System.out.println("\nFourth test case (duplicates):");
        ShakerSort.shakerSort(array4);
        ShakerSort.display(array4);


        // Single-element array
        int[] array5 = {7};

        System.out.println("\nFifth test case (single element):");
        ShakerSort.shakerSort(array5);
        ShakerSort.display(array5);


        // Empty array
        int[] array6 = {};

        System.out.println("\nSixth test case (empty array):");
        ShakerSort.shakerSort(array6);
        ShakerSort.display(array6);
    }
}