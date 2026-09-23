package main.java;

import java.util.Scanner;

public class Modulus {

    // Exercise 7-6 Modulus

    public static int modulusRec(int x, int y) {

        // Error case: y must not be negative
        if (y < 0) {
            System.out.println("Error: The divisor y cannot be negative.");
            return 0;
        }

        // Error case: modulus by zero is not allowed
        if (y == 0) {
            System.out.println("Error: Modulus by zero is not allowed.");
            return 0;
        }

        // Base case: when x becomes 0, the remainder is 0
        if (x == 0) {
            return 0;
        }

        // Base case: when x is smaller than y,
        // x itself is the remainder
        if (x < y) {
            return x;
        }

        // Recursive case:
        // Subtract y and continue
        return modulusRec(x - y, y);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter x: ");
        int x = scanner.nextInt();

        System.out.print("Enter y: ");
        int y = scanner.nextInt();

        int result = modulusRec(x, y);

        // Only display the result when y is valid
        if (y > 0) {
            System.out.println(x + " % " + y + " = " + result);
        }

        scanner.close();
    }
}
