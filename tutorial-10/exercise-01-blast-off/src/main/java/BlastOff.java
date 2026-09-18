package main.java;

import java.util.Scanner;

public class BlastOff {

    // Exercise 7-1 Blast Off

    public static void countdown(int n) {

        // Base case: when n reaches 0, print Blastoff!
        if (n == 0) {
            System.out.println("Blastoff!");
            return;
        }

        // Print the current number
        System.out.println(n);

        // Recursive call with the next smaller number
        countdown(n - 1);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        countdown(n);

        scanner.close();
    }
}