package main.java;

import java.util.Scanner;

public class SumOfDigits {

    public static int sumOfDigits(String s) {

        int sum = 0;

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ch >= '0' && ch <= '9') {
                sum += ch - '0';
            }
        }

        return sum;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter text with both words and numbers: ");
        String text = scanner.nextLine();

        System.out.println("Sum of digits in text is: " + sumOfDigits(text));

        scanner.close();
    }
}