package main.java;

import java.util.Scanner;

public class NumberDigits {

    // Exercise 7-8 Number of Digits

    public static int numberDigitsRec(int n) {

        // Base case: a single-digit number has 1 digit
        if (n < 10) {
            return 1;
        }

        // Remove the last digit and count it recursively
        return 1 + numberDigitsRec(n / 10);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int n = scanner.nextInt();

        int result = numberDigitsRec(n);

        System.out.println("Number of digits in " + n + " = " + result);

        scanner.close();
    }
}