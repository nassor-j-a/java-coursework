package main.java;

import java.util.Scanner;

public class Fibonacci {

public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the value of n to calculate the Fibonacci number: ");
    int n = scanner.nextInt();

    if (n < 0) {
        System.out.println("Please enter a nonnegative integer.");
    } else {
        System.out.println("The " + n + "th Fibonacci number is: " + fib(n));
    }

    scanner.close();
}

// Calculates the nth Fibonacci number.
public static int fib(int n) {

    if (n == 0) {
        return 0;
    }

    if (n == 1) {
        return 1;
    }

    int prev2 = 0;
    int prev1 = 1;
    int current = 0;

    for (int i = 2; i <= n; i++) {

        current = prev1 + prev2;
        prev2 = prev1;
        prev1 = current;
    }

    return current;
}

}
