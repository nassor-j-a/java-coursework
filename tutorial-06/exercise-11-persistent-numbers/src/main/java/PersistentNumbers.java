package main.java;

import java.util.Scanner;

public class PersistentNumbers {

    // Exercise 6-11 Persistent Numbers
    // Part (a): Multiply all digits of a number
    public static int multiplyDigits(int n) {

        int product = 1;

        while (n > 0) {
            int digit = n % 10;
            product *= digit;
            n /= 10;
        }

        return product;
    }

    // Part (b): Calculate the persistence of a number
    public static int persistence(int n) {

        int steps = 0;

        while (n >= 10) {
            n = multiplyDigits(n);
            steps++;
        }

        return steps;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        System.out.println("Persistence: " + persistence(num));

        scanner.close();
    }
}