package main.java;

import java.util.Scanner;

public class Power {

    // Exercise 7-2 Power

    public static double powerRec(double x, int n) {

        // Base case: any number raised to the power 0 is 1
        if (n == 0) {
            return 1;
        }

        // Recursive case: x^n = x * x^(n-1)
        return x * powerRec(x, n - 1);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base x: ");
        double x = scanner.nextDouble();

        System.out.print("Enter the exponent n: ");
        int n = scanner.nextInt();

        double result = powerRec(x, n);

        System.out.println(x + "^" + n + " = " + result);

        scanner.close();
    }
}
