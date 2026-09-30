package main.java;

import java.util.Scanner;

public class Reverse {

    // Exercise 7-13 Reverse

    public static String reverseRec(String value) {

        // Base case: an empty string is already reversed
        if (value.length() == 0) {
            return "";
        }

        // Take the first character and put it at the end
        // of the reversed remaining string
        return reverseRec(value.substring(1)) + value.charAt(0);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String value = scanner.nextLine();

        String result = reverseRec(value);

        System.out.println("Reversed string: " + result);

        scanner.close();
    }
}