package tutorial15.exercise02modifiedselectionsort;

import java.util.Arrays;

public class ModifiedSelectionSort {

    public static void sort(int[] array) {

        // Nothing to sort if the array is null or has fewer than 2 elements.
        if (array == null || array.length < 2) {
            return;
        }

        // These boundaries define the unsorted section.
        int left = 0;
        int right = array.length - 1;

        // Continue while at least two positions remain unsorted.
        while (left < right) {

            // Initially assume the first unsorted element
            // is both the smallest and the largest.
            int minIndex = left;
            int maxIndex = left;

            // Find the minimum and maximum in ONE loop.
            for (int i = left + 1; i <= right; i++) {

                if (array[i] < array[minIndex]) {
                    minIndex = i;
                }

                if (array[i] > array[maxIndex]) {
                    maxIndex = i;
                }
            }

            // Step 1: Move the smallest element to the left.
            int temp = array[left];
            array[left] = array[minIndex];
            array[minIndex] = temp;

            // Special case:
            // If the maximum was originally at 'left',
            // the first swap moved it to 'minIndex'.
            if (maxIndex == left) {
                maxIndex = minIndex;
            }

            // Step 2: Move the largest element to the right.
            temp = array[right];
            array[right] = array[maxIndex];
            array[maxIndex] = temp;

            // The two boundary positions are now sorted.
            left++;
            right--;
        }
    }

    public static void display(int[] array) {
        System.out.println(Arrays.toString(array));
    }
}