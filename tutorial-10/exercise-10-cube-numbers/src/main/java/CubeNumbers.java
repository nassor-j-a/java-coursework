package main.java;

import java.util.Scanner;

public class CubeNumbers {

    // Exercise 7-10 Cube Numbers

    // Recursive method to calculate the square of a number
    public static int square(int n) {

        // Base case: 1^2 = 1
        if (n == 1) {
            return 1;
        }

        // Recursive case:
        // n^2 = (n - 1)^2 + 2n - 1
        return square(n - 1) + 2 * n - 1;
    }

    // Recursive method to calculate the cube of a number
    public static int cube(int n) {

        // Base case: 1^3 = 1
        if (n == 1) {
            return 1;
        }

        // Recursive case:
        // cube(n) = cube(n - 1) + 3(square(n)) - 3n + 1
        return cube(n - 1) + 3 * square(n) - 3 * n + 1;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = scanner.nextInt();

        int result = cube(n);

        System.out.println("Cube of " + n + " = " + result);

        scanner.close();
    }
}
