import java.util.Scanner;

/**
 * Exercise 3-9
 * Quadratic Equation
 *
 * Calculates the real roots of a quadratic equation.
 */
public class QuadraticEquation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("==================================");
        System.out.println("      Quadratic Equation");
        System.out.println("==================================");

        System.out.print("Enter coefficient a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter coefficient b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter coefficient c: ");
        double c = scanner.nextDouble();

        double discriminant = (b * b) - (4 * a * c);

        System.out.println();

        if (a == 0 || discriminant < 0) {

            System.out.println("No Solutions!");

        } else {

            double squareRoot = Math.sqrt(discriminant);

            double x1 = (-b + squareRoot) / (2 * a);
            double x2 = (-b - squareRoot) / (2 * a);

            System.out.printf("x1 = %.2f%n", x1);
            System.out.printf("x2 = %.2f%n", x2);

        }

        scanner.close();
    }
}