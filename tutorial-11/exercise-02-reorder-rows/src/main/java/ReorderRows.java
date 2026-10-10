package main.java;

public class ReorderRows {

    // Tutorial 11 - Exercise 1-2: 2-D Arrays

    /*
     * Step (a): Calculate the sum of one row.
     */
    public static int rowSum(int[] row) {

        int sum = 0;

        for (int i = 0; i < row.length; i++) {
            sum += row[i];
        }

        return sum;
    }

    /*
     * Step (b): Find the index of the row with the maximum sum.
     */
    public static int indexOfMaxRow(int[][] array) {

        // Handle an empty array
        if (array.length == 0) {
            return -1;
        }

        // Assume the first row has the highest sum
        int maxIndex = 0;
        int maxSum = rowSum(array[0]);

        // Check the remaining rows
        for (int i = 1; i < array.length; i++) {

            int currentSum = rowSum(array[i]);

            // Update the maximum when a larger sum is found
            if (currentSum > maxSum) {
                maxSum = currentSum;
                maxIndex = i;
            }
        }

        return maxIndex;
    }

    /*
     * Step (c): Swap two rows.
     */
    public static void swapRows(int[][] array, int row1, int row2) {

        int[] temp = array[row1];

        array[row1] = array[row2];

        array[row2] = temp;
    }

    /*
     * Reorder the array so the row with the highest sum
     * becomes the first row.
     */
    public static void reorderRows(int[][] array) {

        // Nothing to reorder if the array has fewer than two rows
        if (array.length < 2) {
            return;
        }

        // Find the row with the maximum sum
        int maxIndex = indexOfMaxRow(array);

        // Swap that row with the first row
        swapRows(array, 0, maxIndex);
    }

    /*
     * Display all rows of the two-dimensional array.
     */
    public static void displayArray(int[][] array) {

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[][] array = {
            {1, 2, 2, 3, 5},
            {100},
            {2, 3, 9}
        };

        System.out.println("Before reordering:");
        displayArray(array);

        reorderRows(array);

        System.out.println("\nAfter reordering:");
        displayArray(array);
    }
}
