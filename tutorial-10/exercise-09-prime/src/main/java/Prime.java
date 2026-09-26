package main.java;

public class Prime {

    // Exercise 7-9 Prime

    // Starts the recursive prime-number check
    public static boolean prime(int n) {

        // Numbers less than 2 are not prime
        if (n < 2) {
            return false;
        }

        return prime(n, n - 1);
    }

    // Recursively checks whether d divides n
    public static boolean prime(int n, int d) {

        // Base case:
        // If we reach 1, no divisor was found
        if (d == 1) {
            return true;
        }

        // If d divides n, n is not prime
        if (n % d == 0) {
            return false;
        }

        // Check the next smaller possible divisor
        return prime(n, d - 1);
    }
}