package main.java;

import java.util.Scanner;

public class LetterMapping {

    // Exercise 6-13 Letter Mapping - Midterm Spring 2018

    // Part (a)
    // Returns the number associated with an uppercase letter.
    public static int getNumber(char c) {

        switch (c) {
            case 'A':
            case 'B':
            case 'C':
                return 2;

            case 'D':
            case 'E':
            case 'F':
                return 3;

            case 'G':
            case 'H':
            case 'I':
                return 4;

            case 'J':
            case 'K':
            case 'L':
                return 5;

            case 'M':
            case 'N':
            case 'O':
                return 6;

            case 'P':
            case 'Q':
            case 'R':
            case 'S':
                return 7;

            case 'T':
            case 'U':
            case 'V':
                return 8;

            case 'W':
            case 'X':
            case 'Y':
            case 'Z':
                return 9;

            default:
                return -1;
        }
    }

    // Part (b)
    // Translates letters in a phone number into their corresponding digits.
    // All other characters remain unchanged.
    public static String translate(String s) {

        String result = "";

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            if ((c >= 'A' && c <= 'Z')
                    || (c >= 'a' && c <= 'z')) {

                char upperCase = Character.toUpperCase(c);

                result += getNumber(upperCase);

            } else {

                result += c;
            }
        }

        return result;
    }

    // Part (c)
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a phone number: ");
        String input = scanner.nextLine();

        System.out.println(translate(input));

        scanner.close();
    }
}