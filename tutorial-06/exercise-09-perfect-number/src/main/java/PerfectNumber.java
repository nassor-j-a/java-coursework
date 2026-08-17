package main.java;

import java.util.Scanner;

public class PerfectNumber {

    // Calculates the sum of the proper divisors of n
    public static int sumOfDivisors(int n) {

        int sum = 0;

        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }

        return sum;
    }

    // Checks whether n is a perfect number
    public static boolean checkIfPerfectNum(int n) {

        return n > 0 && n == sumOfDivisors(n);
    }

    // Prints all perfect numbers less than or equal to n
    public static void display(int n) {

        System.out.println(
                "Perfect numbers less than or equal to " + n + ":"
        );

        for (int i = 1; i <= n; i++) {
            if (checkIfPerfectNum(i)) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = scanner.nextInt();

        display(num);

        scanner.close();
    }
}