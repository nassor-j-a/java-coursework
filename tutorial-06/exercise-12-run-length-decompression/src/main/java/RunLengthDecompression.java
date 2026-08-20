package main.java;

import java.util.Scanner;

public class RunLengthDecompression {

    // Exercise 6-12 Run Length Decompression

    public static String decompress(String s) {

        String result = "";
        String extractedNum = "";

        for (int i = 0; i < s.length(); i++) {

            char currentCharacter = s.charAt(i);

            // Collect the digits forming the repetition count
            if (currentCharacter >= '0' && currentCharacter <= '9') {

                extractedNum += currentCharacter;

            } else {

                // Convert the collected number to an integer
                int repeatCount = Integer.parseInt(extractedNum);

                // Add the uppercase character repeatCount times
                for (int j = 0; j < repeatCount; j++) {
                    result += currentCharacter;
                }

                // Reset for the next number
                extractedNum = "";
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter compressed text to decompress: ");
        String text = scanner.nextLine();

        System.out.println(decompress(text));

        scanner.close();
    }
}