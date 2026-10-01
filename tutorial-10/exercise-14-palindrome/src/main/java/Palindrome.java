package main.java;

import java.util.Scanner;

public class Palindrome {

    // Exercise 7-14 Palindrome

    public static boolean palindrome(String value) {

        // Base case:
        // An empty string or a string with one character is a palindrome
        if (value.length() <= 1) {
            return true;
        }

        // Compare the first and last characters
        if (value.charAt(0) != value.charAt(value.length() - 1)) {
            return false;
        }

        // Recursively check the string without the first and last characters
        return palindrome(value.substring(1, value.length() - 1));
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String value = scanner.nextLine();

        if (palindrome(value)) {
            System.out.println("\"" + value + "\" is a palindrome.");
        } else {
            System.out.println("\"" + value + "\" is not a palindrome.");
        }

        scanner.close();
    }
}