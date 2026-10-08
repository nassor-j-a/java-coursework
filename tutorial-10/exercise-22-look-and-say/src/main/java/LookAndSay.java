package main.java;

import java.util.Scanner;

public class LookAndSay {

    // Exercise 7-22 Look And Say

    /*
     * Generates the next term in the look-and-say sequence.
     *
     * Example:
     * "111221" -> "312211"
     *
     * This means:
     * three 1s -> 31
     * two 2s   -> 22
     * one 1    -> 11
     */
    public static String nextTerm(String term) {

        // Base case: an empty term has no digits to read
        if (term.length() == 0) {
            return "";
        }

        // Start with the first digit
        char digit = term.charAt(0);

        // Count how many times this digit appears consecutively
        int count = countSameDigits(term, digit, 0);

        // Create the remaining part of the string
        String remaining = term.substring(count);

        // Recursively process the remaining digits
        return count + "" + digit + nextTerm(remaining);
    }

    /*
     * Counts consecutive occurrences of the same digit
     * starting from the given index.
     */
    private static int countSameDigits(String term, char digit, int index) {

        // Base case: reached the end of the string
        if (index == term.length()) {
            return 0;
        }

        // Stop counting when the digit changes
        if (term.charAt(index) != digit) {
            return 0;
        }

        // Count this digit and continue
        return 1 + countSameDigits(term, digit, index + 1);
    }

    /*
     * Recursively prints the first n terms
     * of the look-and-say sequence.
     */
    public static void lookAndSay(int n, String term) {

        // Base case: no more terms to print
        if (n == 0) {
            return;
        }

        // Print the current term
        System.out.println(term);

        // Generate and print the next term recursively
        lookAndSay(n - 1, nextTerm(term));
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Error: Enter a positive number.");
        } else {
            lookAndSay(n, "1");
        }

        scanner.close();
    }
}
