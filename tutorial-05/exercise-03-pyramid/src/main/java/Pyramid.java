package main.java;

import java.util.Scanner;

public class Pyramid {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive odd number: ");
        int num = scanner.nextInt();

        if (num <= 0 || num % 2 == 0) {
            System.out.println("Please enter a positive odd number.");
        } else {

            for (int rowMax = 1; rowMax <= num; rowMax += 2) {

                // Print leading spaces
                int spacesNeeded = (num - rowMax) / 2;

                for (int space = 1; space <= spacesNeeded; space++) {
                    System.out.print(" ");
                }

                // Print numbers
                for (int digit = 1; digit <= rowMax; digit++) {
                    System.out.print(digit);
                }

                System.out.println();
            }
        }

        scanner.close();
    }
}