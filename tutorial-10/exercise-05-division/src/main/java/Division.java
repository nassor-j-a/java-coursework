package main.java;

import java.util.Scanner;

public class Division {

    // Exercise 7-5 Division

    public static int divideRec(int x, int y) {

        // Error case: division by zero is not allowed
        if (y == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return 0;
        }

        // Error case: y must not be negative
        if (y < 0) {
            System.out.println("Error: The divisor y cannot be negative.");
            return 0;
        }

        // Base case: if x is smaller than y, the quotient is 0
        if (x < y) {
            return 0;
        }

        // Recursive case:
        // Subtract y from x and add 1 to the quotient
        return 1 + divideRec(x - y, y);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter x: ");
        int x = scanner.nextInt();

        System.out.print("Enter y: ");
        int y = scanner.nextInt();

        int result = divideRec(x, y);

        // Only display the result when y is valid
        if (y > 0) {
            System.out.println(x + " / " + y + " = " + result);
        }

        scanner.close();
    }
}
