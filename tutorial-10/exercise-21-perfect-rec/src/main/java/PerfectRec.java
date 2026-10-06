package main.java;

import java.util.Scanner;

public class PerfectRec {

    // Exercise 7-21 PerfectRec

    public static int sumDivisors(int n, int divisor) {

        // Base case: all possible divisors have been checked
        if (divisor == n) {
            return 0;
        }

        // If divisor divides n exactly, add it to the sum
        if (n % divisor == 0) {
            return divisor + sumDivisors(n, divisor + 1);
        }

        // Otherwise, continue checking the next divisor
        return sumDivisors(n, divisor + 1);
    }

    public static boolean perfectRec(int n) {

        // Calculate the sum of the proper divisors of n
        int sum = sumDivisors(n, 1);

        // n is perfect if the sum of its proper divisors equals n
        return sum == n;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Error: Enter a positive integer.");
        } else {

            int sum = sumDivisors(n, 1);

            System.out.println("Sum of proper divisors = " + sum);

            if (perfectRec(n)) {
                System.out.println(n + " is a perfect number.");
            } else {
                System.out.println(n + " is not a perfect number.");
            }
        }

        scanner.close();
    }
}
