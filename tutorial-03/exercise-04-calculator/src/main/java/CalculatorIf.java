import java.util.*;

/**
 * Exercise 3-4
 * Calculator using if-else if statements.
 */
public class CalculatorIf {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("==================================");
        System.out.println("      Calculator (if-else)");
        System.out.println("==================================");

        System.out.print("Enter first number: ");
        double first = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double second = scanner.nextDouble();

        System.out.print("Enter operator (+, -, *, /, %): ");
        char operator = scanner.next().charAt(0);

        System.out.println();

        if (operator == '+') {

            System.out.println("Result = " + (first + second));

        } else if (operator == '-') {

            System.out.println("Result = " + (first - second));

        } else if (operator == '*') {

            System.out.println("Result = " + (first * second));

        } else if (operator == '/') {

            if (second == 0) {
                System.out.println("Error: Division by zero.");
            } else {
                System.out.println("Result = " + (first / second));
            }

        } else if (operator == '%') {

            if (second == 0) {
                System.out.println("Error: Division by zero.");
            } else {
                System.out.println("Result = " + (first % second));
            }

        } else {

            System.out.println("Invalid operator.");

        }

        scanner.close();
    }
}