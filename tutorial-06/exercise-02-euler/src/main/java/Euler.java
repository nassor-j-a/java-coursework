package main.java;

import java.util.Scanner;

public class Euler {

public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the value of n: ");
    int n = scanner.nextInt();

    System.out.println("The value of e is: " + euler(n));

    scanner.close();
}

// Calculates n!
public static double factorial(int n) {

    if (n <= 1) {
        return 1.0;
    }

    return n * factorial(n - 1);
}

// Calculates e using:
// e = 1 + 1/1! + 1/2! + ... + 1/n!
public static double euler(int n) {

    double result = 0.0;

    for (int i = 0; i <= n; i++) {
        result += 1.0 / factorial(i);
    }

    return result;
}
}
