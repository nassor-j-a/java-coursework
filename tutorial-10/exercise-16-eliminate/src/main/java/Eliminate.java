package main.java;

import java.util.Scanner;

public class Eliminate {

    // Exercise 7-16 Eliminate

    public static String eliminate(String value, char character) {

        // Base case: an empty string needs no changes
        if (value.length() == 0) {
            return "";
        }

        // Get the first character
        char firstCharacter = value.charAt(0);

        // If the first character matches, do not include it
        if (firstCharacter == character) {
            return eliminate(value.substring(1), character);
        }

        // Otherwise, keep the first character
        // and recursively process the remaining string
        return firstCharacter + eliminate(value.substring(1), character);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String value = scanner.nextLine();

        System.out.print("Enter the character to eliminate: ");
        char character = scanner.nextLine().charAt(0);

        String result = eliminate(value, character);

        System.out.println("Result: " + result);

        scanner.close();
    }
}