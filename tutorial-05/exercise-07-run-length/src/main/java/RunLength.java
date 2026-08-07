package main.java;

import java.util.Scanner;

public class RunLength {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Part (a): Compression
        System.out.print("Enter a string for compression: ");
        String input = scanner.nextLine();

        if (input.length() > 0) {

            int count = 1;

            for (int i = 1; i < input.length(); i++) {

                if (input.charAt(i) == input.charAt(i - 1)) {
                    count++;
                } else {
                    System.out.print(count + "" + input.charAt(i - 1));
                    count = 1;
                }
            }

            System.out.println(count + "" + input.charAt(input.length() - 1));
        }

        // Part (b): Decompression
        System.out.print("Enter a compressed string: ");
        String compressed = scanner.nextLine();

        System.out.print("Decompressed string: ");

        String number = "";

        for (int i = 0; i < compressed.length(); i++) {

            char ch = compressed.charAt(i);

            if (ch >= '0' && ch <= '9') {
                number += ch;
            } else {

                int count = Integer.parseInt(number);

                for (int j = 0; j < count; j++) {
                    System.out.print(ch);
                }

                number = "";
            }
        }

        scanner.close();
    }
}