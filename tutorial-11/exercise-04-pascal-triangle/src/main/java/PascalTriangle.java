package main.java;

import java.util.Scanner;

public class PascalTriangle {

    // Tutorial 11 - Exercise 1-4: Pascal Triangle

    /*
     * Creates and prints the first n rows of Pascal's triangle.
     */
    public static void printPascal(int n) {

        // Reject invalid input
        if (n <= 0) {
            System.out.println("Error: Enter a positive number of rows.");
            return;
        }

        // Create a two-dimensional array for the triangle
        int[][] triangle = new int[n][];

        // Create each row with the appropriate number of elements
        for (int i = 0; i < n; i++) {
            triangle[i] = new int[i + 1];
        }

        // Fill the triangle
        for (int i = 0; i < n; i++) {

            for (int j = 0; j <= i; j++) {

                // Border elements are always 1
                if (j == 0 || j == i) {
                    triangle[i][j] = 1;
                } else {

                    // Add the two elements directly above
                    triangle[i][j] =
                            triangle[i - 1][j - 1]
                            + triangle[i - 1][j];
                }
            }
        }

        // Print the triangle
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < triangle[i].length; j++) {
                System.out.print(triangle[i][j] + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int n = scanner.nextInt();

        printPascal(n);

        scanner.close();
    }
}