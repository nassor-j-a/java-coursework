package main.java;

import java.util.Scanner;

public class PutAtFront {

    // Exercise 7-20 Put At Front

    public static String putAtFront(String s, char c) {

        // Base case: an empty string remains empty
        if (s.length() == 0) {
            return "";
        }

        // Get the first character
        char firstCharacter = s.charAt(0);

        // Recursively process the remaining string
        String rest = putAtFront(s.substring(1), c);

        // If the first character is c,
        // place it at the front of the result
        if (firstCharacter == c) {
            return c + rest;
        }

        // Otherwise, keep the character after
        // all occurrences of c
        return rest + firstCharacter;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = scanner.nextLine();

        System.out.print("Enter a character: ");
        char c = scanner.nextLine().charAt(0);

        String result = putAtFront(s, c);

        System.out.println("Result: " + result);

        scanner.close();
    }
}