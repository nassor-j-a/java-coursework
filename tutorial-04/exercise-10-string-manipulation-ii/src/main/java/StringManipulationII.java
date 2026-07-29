import java.util.Scanner;

/**
 * Exercise 4-10
 * String Manipulation II
 *
 * Compares two strings without using equals().
 */
public class StringManipulationII {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String stringOne = scanner.nextLine();

        System.out.print("Enter second string: ");
        String stringTwo = scanner.nextLine();

        boolean equal = true;

        if (stringOne.length() != stringTwo.length()) {

            equal = false;

        } else {

            for (int i = 0; i < stringOne.length(); i++) {

                if (stringOne.charAt(i) != stringTwo.charAt(i)) {
                    equal = false;
                    break;
                }
            }
        }

        if (equal) {
            System.out.println("The two strings are equal.");
        } else {
            System.out.println("The two strings are not equal.");
        }

        scanner.close();
    }
}