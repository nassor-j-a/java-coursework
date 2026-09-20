package main.java;

import java.util.Scanner;

public class NaturalLogarithm {

    // Exercise 7-3 Natural Logarithm

    // Recursive method to calculate n!
    public static long factorial(int n) {

        // Base case: 0! = 1
        if (n == 0) {
            return 1;
        }

        // Recursive case: n! = n * (n - 1)!
        return n * factorial(n - 1);
    }

    // Recursive method to calculate e(n)
    public static double constantRec(int n) {

        // Base case: e(0) = 1 / 0! = 1
        if (n == 0) {
            return 1.0 / factorial(0);
        }

        // Recursive case:
        // e(n) = e(n - 1) + 1 / n!
        return constantRec(n - 1) + 1.0 / factorial(n);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = scanner.nextInt();

        double result = constantRec(n);

        System.out.println("e(" + n + ") = " + result);

        scanner.close();
    }
}