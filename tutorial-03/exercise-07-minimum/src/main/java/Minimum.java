import java.util.*;

/**
 * Exercise 3-7
 * Minimum of Three Numbers
 *
 * Determines the smallest of three numbers
 * using only the conditional (ternary) operator.
 */
public class Minimum {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("==================================");
        System.out.println("     Minimum of Three Numbers");
        System.out.println("==================================");

        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int number3 = scanner.nextInt();

        int minimum =
                (number1 < number2)
                        ? ((number1 < number3) ? number1 : number3)
                        : ((number2 < number3) ? number2 : number3);

        System.out.println();
        System.out.println("The minimum number is: " + minimum);

        scanner.close();
    }
}