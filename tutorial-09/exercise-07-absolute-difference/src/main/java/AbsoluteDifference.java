package main.java;

import java.util.Arrays;

public class AbsoluteDifference {

    public static double absoluteDifference(double[] a) {

        // Start with the largest possible difference
        double smallestDifference = Double.MAX_VALUE;

        // Compare every pair of elements
        for (int i = 0; i < a.length - 1; i++) {

            for (int j = i + 1; j < a.length; j++) {

                double difference = Math.abs(a[i] - a[j]);

                if (difference < smallestDifference) {
                    smallestDifference = difference;
                }
            }
        }

        return smallestDifference;
    }

    public static void main(String[] args) {

        double[] a = {4.5, 3.5, 6.0, 20.0, 3.0};

        double[] b = {8.2, 3.5, 6.0, 3.5, 20.0};

        System.out.println("Array 1: " + Arrays.toString(a));
        System.out.println("Smallest absolute difference: "
                + absoluteDifference(a));

        System.out.println();

        System.out.println("Array 2: " + Arrays.toString(b));
        System.out.println("Smallest absolute difference: "
                + absoluteDifference(b));
    }
}
