import java.util.Scanner;

/**
 * Exercise 4-2
 * Number of Digits
 *
 * Counts the number of digits
 * in a positive integer.
 */
public class NumberOfDigits {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("==================================");
        System.out.println("       Number of Digits");
        System.out.println("==================================");

        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        if (number < 0) {

            System.out.println("Please enter a positive integer.");

        } else {

            int originalNumber = number;
            int digitCount = 0;

            if (number == 0) {
                digitCount = 1;
            }

            for (; number > 0; number /= 10) {
                digitCount++;
            }

            System.out.println(
                    "Number of digits in "
                            + originalNumber
                            + " = "
                            + digitCount);
        }

        scanner.close();
    }
}