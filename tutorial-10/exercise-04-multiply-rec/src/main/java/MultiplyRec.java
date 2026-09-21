package main.java;

import java.util.Scanner;

public class MultiplyRec {

    // Exercise 7-4 MultiplyRec

    public static int multiplyRec(int x, int y) {

        // Base case: anything multiplied by 0 is 0
        if (y == 0) {
            return 0;
        }

        // If y is negative, use subtraction
        if (y < 0) {
            return -x + multiplyRec(x, y + 1);
        }

        // Recursive case: x * y = x + x * (y - 1)
        return x + multiplyRec(x, y - 1);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter x: ");
        int x = scanner.nextInt();

        System.out.print("Enter y: ");
        int y = scanner.nextInt();

        int result = multiplyRec(x, y);

        System.out.println(x + " * " + y + " = " + result);

        scanner.close();
    }
}
