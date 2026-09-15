package main.java;

public class MergeRec {

    // Exercise 10-11 MergeRec - Final Exam 2015

    public static void mergeRec(int[] array1, int[] array2) {
        mergeRec(array1, array2, 0);
        System.out.println();
    }

    // Recursive helper method
    private static void mergeRec(int[] array1, int[] array2, int index) {

        // Base case: both arrays have been completely processed
        if (index >= array1.length && index >= array2.length) {
            return;
        }

        // Display an element from Array 1 if one is available
        if (index < array1.length) {
            System.out.print(array1[index] + " ");
        }

        // Display an element from Array 2 if one is available
        if (index < array2.length) {
            System.out.print(array2[index] + " ");
        }

        // Recursively move to the next position
        mergeRec(array1, array2, index + 1);
    }

    public static void main(String[] args) {

        int[] a = {1, 8, 3, 4};
        int[] b = {5, 2};

        mergeRec(a, b);
    }
}
