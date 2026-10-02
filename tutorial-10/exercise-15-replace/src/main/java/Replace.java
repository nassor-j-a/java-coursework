package main.java;

import java.util.Scanner;

public class Replace {

    // Exercise 7-15 Replace

    public static String replace(String value, char character) {

        // Base case: an empty string needs no replacement
        if (value.length() == 0) {
            return "";
        }

        // Get the first character
        char firstCharacter = value.charAt(0);

        // If the first character matches, replace it with '*'
        if (firstCharacter == character) {
            firstCharacter = '*';
        }

        // Recursively process the remaining characters
        return firstCharacter + replace(value.substring(1), character);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String value = scanner.nextLine();

        System.out.print("Enter the character to replace: ");
        char character = scanner.nextLine().charAt(0);

        String result = replace(value, character);

        System.out.println("Result: " + result);

        scanner.close();
    }
}
