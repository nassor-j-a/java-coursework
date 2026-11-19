package main.java.tutorial15.exercise05countingsort;

import java.util.Arrays;

public class CountingSort {

    // Part A: Boolean Sort
    // Sorts distinct positive integers.
    // Duplicate values are represented only once.
    public static int[] booleanSort(int[] x) {

        if (x == null) {
            return null;
        }

        if (x.length == 0) {
            return new int[0];
        }

        // Find the maximum value.
        int max = findMaximum(x);

        // Create a boolean array of size max + 1.
        boolean[] flags = new boolean[max + 1];

        // Mark every value found in the input array.
        for (int value : x) {
            flags[value] = true;
        }

        // Count the number of distinct values.
        int distinctCount = 0;

        for (boolean present : flags) {
            if (present) {
                distinctCount++;
            }
        }

        // Create the output array.
        int[] sorted = new int[distinctCount];

        // Reconstruct the sorted array.
        int index = 0;

        for (int value = 0; value < flags.length; value++) {

            if (flags[value]) {
                sorted[index] = value;
                index++;
            }
        }

        return sorted;
    }


    // Part B: Counting Sort
    // Sorts positive integers and preserves duplicates.
    public static int[] countingSort(int[] x) {

        if (x == null) {
            return null;
        }

        if (x.length == 0) {
            return new int[0];
        }

        // Find the maximum value.
        int max = findMaximum(x);

        // Create a frequency array.
        int[] counts = new int[max + 1];

        // Count how many times each value occurs.
        for (int value : x) {
            counts[value]++;
        }

        // Create an output array of the original length.
        int[] sorted = new int[x.length];

        // Reconstruct the sorted array.
        int index = 0;

        for (int value = 0; value < counts.length; value++) {

            // Insert each value according to its frequency.
            for (int j = 0; j < counts[value]; j++) {

                sorted[index] = value;
                index++;
            }
        }

        return sorted;
    }


    // Finds the largest value in the input array.
    private static int findMaximum(int[] x) {

        int max = x[0];

        for (int value : x) {

            if (value > max) {
                max = value;
            }
        }

        return max;
    }


    // Displays an array.
    public static void display(int[] array) {
        System.out.println(Arrays.toString(array));
    }
}