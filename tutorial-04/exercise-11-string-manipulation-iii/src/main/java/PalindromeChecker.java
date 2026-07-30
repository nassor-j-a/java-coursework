package main.java;
import java.util.Scanner;

/**
 * Exercise 4-11
 * String Manipulation III
 *
 * Determines whether a given string is a palindrome.
 */
public class PalindromeChecker {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a text: ");
        String text = scanner.nextLine();

        boolean isPalindrome = true;

        for (int i = 0; i < text.length() / 2; i++) {

            int j = text.length() - 1 - i;

            if (text.charAt(i) != text.charAt(j)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("The text is a palindrome.");
        } else {
            System.out.println("The text is not a palindrome.");
        }

        scanner.close();
    }
}