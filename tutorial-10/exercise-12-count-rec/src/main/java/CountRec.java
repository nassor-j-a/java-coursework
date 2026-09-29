import java.util.Scanner;

public class CountRec {

    // Exercise 7-12 CountRec

    public static int countRec(String value, char character) {

        // Base case: an empty string contains 0 occurrences
        if (value.length() == 0) {
            return 0;
        }

        // Check the first character
        if (value.charAt(0) == character) {

            // Count 1 for the match and continue with the rest of the string
            return 1 + countRec(value.substring(1), character);

        } else {

            // No match, so continue with the rest of the string
            return countRec(value.substring(1), character);
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String value = scanner.nextLine();

        System.out.print("Enter a character to count: ");
        char character = scanner.nextLine().charAt(0);

        int result = countRec(value, character);

        System.out.println("The character '" + character
                + "' appears " + result + " time(s).");

        scanner.close();
    }
}