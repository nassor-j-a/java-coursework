// package main.java;

public class Palindrome {

    // Exercise 10-2 Palindrome

    public static boolean isPalindrome(char[] characters) {

        for (int i = 0; i < characters.length / 2; i++) {

            if (characters[i] != characters[characters.length - 1 - i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        char[] word = {'r', 'a', 'd', 'a', 'r'};

        if (isPalindrome(word)) {
            System.out.println("The array is a palindrome.");
        } else {
            System.out.println("The array is not a palindrome.");
        }
    }
}

