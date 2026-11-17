package main.java.tutorial15.exercise03indexsort;

public class Main {

    public static void main(String[] args) {

        // Required example
        int[] array1 = {4, 3, 8, 2};

        System.out.println("First test case:");
        System.out.print("Original array: ");
        IndexSort.display(array1);

        int[] sorted1 = IndexSort.indexSort(array1);

        System.out.print("Sorted array:   ");
        IndexSort.display(sorted1);


        // Test duplicate values
        int[] array2 = {4, 2, 4, 1, 2};

        System.out.println("\nSecond test case (duplicates):");
        System.out.print("Original array: ");
        IndexSort.display(array2);

        int[] sorted2 = IndexSort.indexSort(array2);

        System.out.print("Sorted array:   ");
        IndexSort.display(sorted2);


        // Test an already sorted array
        int[] array3 = {1, 2, 3, 4, 5};

        System.out.println("\nThird test case (already sorted):");
        IndexSort.display(IndexSort.indexSort(array3));


        // Test a reverse-sorted array
        int[] array4 = {5, 4, 3, 2, 1};

        System.out.println("\nFourth test case (reverse sorted):");
        IndexSort.display(IndexSort.indexSort(array4));


        // Test an array containing identical values
        int[] array5 = {7, 7, 7, 7};

        System.out.println("\nFifth test case (identical values):");
        IndexSort.display(IndexSort.indexSort(array5));


        // Test an empty array
        int[] array6 = {};

        System.out.println("\nSixth test case (empty array):");
        IndexSort.display(IndexSort.indexSort(array6));
    }
}