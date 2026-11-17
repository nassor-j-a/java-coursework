package main.java.tutorial15.exercise03indexsort;

import java.util.Arrays;

public class IndexSort {

    public static int[] indexSort(int[] x) {

        // Handle a null input.
        if (x == null) {
            return null;
        }

        // Create an output array of the same length.
        int[] y = new int[x.length];

        // Examine every element in the input array.
        for (int i = 0; i < x.length; i++) {

            // Initially assume the element belongs at index 0.
            int position = 0;

            // Compare the current element with every other element.
            for (int j = 0; j < x.length; j++) {

                // Count elements that must appear before x[i].
                if (x[j] < x[i] ||
                    (x[j] == x[i] && j < i)) {

                    position++;
                }
            }

            // Place the current element at its calculated position.
            y[position] = x[i];
        }

        return y;
    }

    public static void display(int[] array) {
        System.out.println(Arrays.toString(array));
    }
}