package main.java;

import java.util.Scanner;

public class ZAlgorithm {

    // Exercise 6-10 Z-Algorithm - Midterm Spring 2013

    public static String zAlgo(String s) {

        String zOutput = "";

        for (int i = 0; i < s.length(); i++) {

            // Z-value at position 0 is always 0
            if (i == 0) {
                zOutput += "0";
                continue;
            }

            int k = 0;

            // Compare the substring starting at i
            // with the prefix of the string
            while (i + k < s.length()
                    && s.charAt(k) == s.charAt(i + k)) {
                k++;
            }

            zOutput += k;
        }

        return zOutput;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        System.out.println(zAlgo(text));

        scanner.close();
    }
}