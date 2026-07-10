import java.util.*;

/**
 * Exercise 3-4
 * Calculator using switch statement.
 */
public class CalculatorSwitch {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("==================================");
        System.out.println("      Calculator (switch)");
        System.out.println("==================================");

        System.out.print("Enter first number: ");
        double first = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double second = scanner.nextDouble();

        System.out.print("Enter operator (+, -, *, /, %): ");
        char operator = scanner.next().charAt(0);

        System.out.println();

        switch (operator) {

            case '+':
                System.out.println("Result = " + (first + second));
                break;

            case '-':
                System.out.println("Result = " + (first - second));
                break;

            case '*':
                System.out.println("Result = " + (first * second));
                break;

            case '/':
                if (second == 0) {
                    System.out.println("Error: Division by zero.");
                } else {
                    System.out.println("Result = " + (first / second));
                }
                break;

            case '%':
                if (second == 0) {
                    System.out.println("Error: Division by zero.");
                } else {
                    System.out.println("Result = " + (first % second));
                }
                break;

            default:
                System.out.println("Invalid operator.");
        }

        scanner.close();
    }
}