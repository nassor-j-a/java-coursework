package main.java;

import java.util.Scanner;

public class NumberOfDigits {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        do {

            System.out.print("Please enter a number: ");
            int number = scanner.nextInt();

            if (number == -1) {
                System.out.println("Thank you!");
                break;
            }

            if (number < 0) {
                System.out.println("Please enter a positive integer or -1 to quit.");
                continue;
            }

            int originalNumber = number;
            int digitCount = 0;

            if (number == 0) {
                digitCount = 1;
            } else {
                while (number > 0) {
                    digitCount++;
                    number /= 10;
                }
            }

            System.out.println("Number of digits in " + originalNumber + " = " + digitCount);

        } while (true);

        scanner.close();
    }
}