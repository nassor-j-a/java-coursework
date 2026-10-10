package main.java;

public class MatrixAddition {

    // Tutorial 11 - Exercise 1-1 Matrix Addition

    // Tolerance used when comparing double values
    private static final double EPSILON = 1e-9;

    /*
     * Checks whether two matrices have the same dimensions.
     */
    public static boolean sameDimensions(double[][] a, double[][] b) {

        // Matrices must have the same number of rows
        if (a.length != b.length) {
            return false;
        }

        // Check the number of columns in each corresponding row
        for (int i = 0; i < a.length; i++) {

            if (a[i].length != b[i].length) {
                return false;
            }
        }

        return true;
    }

    /*
     * Checks whether adding matrix a and matrix b
     * produces matrix result.
     */
    public static boolean isSumOf(
            double[][] a, double[][] b, double[][] result) {

        // All three matrices must have the same dimensions
        if (!sameDimensions(a, b)
                || !sameDimensions(a, result)) {
            return false;
        }

        // Check every corresponding matrix element
        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < a[i].length; j++) {

                // Calculate the expected sum
                double sum = a[i][j] + b[i][j];

                // Compare the sum with the corresponding result element
                if (Math.abs(sum - result[i][j]) > EPSILON) {
                    return false;
                }
            }
        }

        // Every element matches the expected sum
        return true;
    }

    /*
     * Determines whether one of the three matrices
     * is the sum of the other two.
     */
    public static boolean matrixAddition(
            double[][] a, double[][] b, double[][] c) {

        // Check whether A + B = C
        if (isSumOf(a, b, c)) {
            return true;
        }

        // Check whether A + C = B
        if (isSumOf(a, c, b)) {
            return true;
        }

        // Check whether B + C = A
        if (isSumOf(b, c, a)) {
            return true;
        }

        // None of the combinations represents matrix addition
        return false;
    }

    public static void main(String[] args) {

        double[][] a = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        double[][] b = {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90}
        };

        double[][] c = {
            {11, 22, 33},
            {44, 55, 66},
            {77, 88, 99}
        };

        if (matrixAddition(a, b, c)) {
            System.out.println(
                    "One matrix is the sum of the other two.");
        } else {
            System.out.println(
                    "None of the matrices is the sum of the other two.");
        }
    }
}