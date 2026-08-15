package main.java;

import java.util.Scanner;

public class CharacterCount {

    public static int count(String s, char c) {

        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        System.out.print("Enter a character in the word above to check recurrence: ");
        char ch = scanner.next().charAt(0);

        System.out.println(
            "The character '" + ch + "' appears "
            + count(word, ch) + " time(s)."
        );

        scanner.close();
    }
}