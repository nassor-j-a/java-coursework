import java.util.*;

public class ExactNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Exercise 5-6 Extract Numbers

        System.out.print("Please enter your string: ");
        String input = scanner.nextLine();

        System.out.println("The numbers contained in your string are:");

        // Outer loop scans each character in the string
        for (int i = 0; i < input.length(); i++) {

            char currentChar = input.charAt(i);

            // Check if the current character is a digit
            if (currentChar >= '0' && currentChar <= '9') {

                String number = "";

                // Inner loop collects consecutive digits
                while (i < input.length()
                        && input.charAt(i) >= '0'
                        && input.charAt(i) <= '9') {

                    number += input.charAt(i);
                    i++;
                }

                // Print the extracted number
                System.out.println(number);

                // Step back because the for-loop will increment i
                i--;
            }
        }

        scanner.close();
    }
}