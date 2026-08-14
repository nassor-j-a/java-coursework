package main.java;

import java.util.Scanner;

public class Prime {

    public static boolean isPrime(int x) {

        if (x <= 1) {
            return false;
        }

        for (int i = 2; i * i <= x; i++) {
            if (x % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if (isPrime(num)) {
            System.out.println(num + " is prime");
        } else {
            System.out.println(num + " is not prime");
        }

        scanner.close();
    }
}