package main.java;

import java.util.Scanner;

public class Palindrome {

    public static boolean isPalindrome(String s) {

        String reversed = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            reversed += s.charAt(i);
        }

        return reversed.equals(s);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a word: ");
        String word = scanner.nextLine();

        System.out.println(isPalindrome(word));

        scanner.close();
    }
}