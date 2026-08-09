package main.java;

import java.util.Scanner;

public class Power {

public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter value for base: ");
    int m = scanner.nextInt();

    System.out.print("Enter value for exponent: ");
    int n = scanner.nextInt();

    System.out.println("The result of " + m + " power " + n + " is " + power(m, n));

    scanner.close();
}

// Calculates m raised to the power of n.
public static int power(int m, int n) {

    int result = 1;

    for (int i = 1; i <= n; i++) {
        result *= m;
    }

    return result;
}

}
