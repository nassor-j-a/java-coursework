package main.java;

import java.util.Scanner;

public class SubString {

public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.print("Please enter first String (s1): ");
    String s1 = scanner.nextLine();

    System.out.print("Please enter second String (s2): ");
    String s2 = scanner.nextLine();

    boolean isSubstring = false;

    // An empty string is considered a substring of every string.
    if (s1.isEmpty()) {

        isSubstring = true;

    } else if (s1.length() <= s2.length()) {

        // Check every possible starting position in s2.
        for (int i = 0; i <= s2.length() - s1.length(); i++) {

            boolean matchFound = true;

            // Compare each character of s1 with the corresponding
            // character in s2.
            for (int j = 0; j < s1.length(); j++) {

                if (s2.charAt(i + j) != s1.charAt(j)) {
                    matchFound = false;
                    break;
                }
            }

            if (matchFound) {
                isSubstring = true;
                break;
            }
        }
    }

    System.out.println("Output: " + isSubstring);

    scanner.close();
}

}
