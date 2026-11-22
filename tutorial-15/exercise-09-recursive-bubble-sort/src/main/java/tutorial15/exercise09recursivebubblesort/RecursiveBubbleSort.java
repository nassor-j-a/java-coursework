package main.java.tutorial15.exercise09recursivebubblesort;

public class RecursiveBubbleSort {

    public static void bubbleSort(int[] array, int n) {

        // Base case: no sorting is needed for 0 or 1 element.
        if (n <= 1) {
            return;
        }

        // Perform one Bubble Sort pass.
        for (int i = 0; i < n - 1; i++) {

            if (array[i] > array[i + 1]) {

                int temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
            }
        }

        // Recursively sort the remaining unsorted section.
        bubbleSort(array, n - 1);
    }

    public static void bubbleSort(int[] array) {

        if (array == null) {
            throw new IllegalArgumentException("Array cannot be null.");
        }

        bubbleSort(array, array.length);
    }
}
