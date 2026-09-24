package main.java;
import java.util.Scanner;

public class SumOfDigits {

    // Exercise 7-7 Sum of Digits

    public static int sumDigits(int n) {

        // Base case: a single digit has itself as the sum
        if (n < 10) {
            return n;
        }

        // Get the last digit
        int lastDigit = n % 10;

        // Remove the last digit
        int remainingNumber = n / 10;

        // Add the last digit to the sum of the remaining digits
        return lastDigit + sumDigits(remainingNumber);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int n = scanner.nextInt();

        int result = sumDigits(n);

        System.out.println("Sum of digits of " + n + " = " + result);

        scanner.close();
    }
}
