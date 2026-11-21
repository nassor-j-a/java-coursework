package tutorial15.exercise08bogosort;

import java.util.Random;

public class BogoSort {

    private static final Random random = new Random();

    public static void bogoSort(int[] a) {

        if (a == null) {
            throw new IllegalArgumentException("Array cannot be null.");
        }

        // Keep shuffling until the array is sorted.
        while (!isSorted(a)) {
            shuffle(a);
        }
    }

    public static boolean isSorted(int[] a) {

        // Check each pair of adjacent elements.
        for (int i = 0; i < a.length - 1; i++) {

            if (a[i] > a[i + 1]) {
                return false;
            }
        }

        return true;
    }

    public static void shuffle(int[] a) {

        // Fisher-Yates shuffle.
        for (int i = a.length - 1; i > 0; i--) {

            // Choose a random index between 0 and i, inclusive.
            int j = random.nextInt(i + 1);

            // Swap the elements at indices i and j.
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
    }
}