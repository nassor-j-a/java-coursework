package main.java.tutorial15.exercise04shakersort;

import java.util.Arrays;

public class ShakerSort {

    public static void shakerSort(int[] array) {

        // Handle null arrays and arrays with fewer than 2 elements.
        if (array == null || array.length < 2) {
            return;
        }

        // Define the boundaries of the unsorted section.
        int left = 0;
        int right = array.length - 1;

        // Continue while at least two elements remain unsorted.
        while (left < right) {

            boolean swapped = false;

            // FORWARD PASS: Move the largest element to the right.
            for (int i = left; i < right; i++) {

                if (array[i] > array[i + 1]) {

                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;

                    swapped = true;
                }
            }

            // If no swap occurred, the remaining section is sorted.
            if (!swapped) {
                break;
            }

            // The largest element is now in its correct position.
            right--;

            swapped = false;

            // BACKWARD PASS: Move the smallest element to the left.
            for (int i = right; i > left; i--) {

                if (array[i] < array[i - 1]) {

                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;

                    swapped = true;
                }
            }

            // If no swap occurred, the remaining section is sorted.
            if (!swapped) {
                break;
            }

            // The smallest element is now in its correct position.
            left++;
        }
    }

    public static void display(int[] array) {
        System.out.println(Arrays.toString(array));
    }
}