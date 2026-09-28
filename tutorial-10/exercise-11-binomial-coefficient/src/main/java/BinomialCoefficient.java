package main.java;

import java.util.Scanner;

public class BinomialCoefficient {

    // Exercise 7-11 Binomial Coefficient

    public static int binomial(int n, int k) {

        // Base case: if k = 0, the binomial coefficient is 1
        if (k == 0) {
            return 1;
        }

        // Base case: if n = k, the binomial coefficient is 1
        if (n == k) {
            return 1;
        }

        // Recursive case:
        // C(n, k) = C(n - 1, k) + C(n - 1, k - 1)
        return binomial(n - 1, k) + binomial(n - 1, k - 1);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = scanner.nextInt();

        System.out.print("Enter k: ");
        int k = scanner.nextInt();

        // k must be between 0 and n
        if (k < 0 || k > n) {
            System.out.println("Error: k must satisfy 0 <= k <= n.");
        } else {
            int result = binomial(n, k);

            System.out.println("C(" + n + ", " + k + ") = " + result);
        }

        scanner.close();
    }
}
