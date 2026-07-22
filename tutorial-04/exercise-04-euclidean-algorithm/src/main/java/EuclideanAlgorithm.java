import java.util.Scanner;

/**
 * Exercise 4-4
 * Euclidean Algorithm
 *
 * Computes the Greatest Common Divisor (GCD)
 * of two positive integers using repeated subtraction.
 */
public class EuclideanAlgorithm {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("==================================");
        System.out.println("      Euclidean Algorithm");
        System.out.println("==================================");

        System.out.print("Please enter the first number: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Please enter the second number: ");
        int secondNumber = scanner.nextInt();

        if (firstNumber <= 0 || secondNumber <= 0) {
            System.out.println("Please enter positive integers only.");
            scanner.close();
            return;
        }

        int originalFirst = firstNumber;
        int originalSecond = secondNumber;

        while (firstNumber != secondNumber) {

            if (firstNumber > secondNumber) {
                firstNumber -= secondNumber;
            } else {
                secondNumber -= firstNumber;
            }
        }

        System.out.println(
                "The GCD of "
                        + originalFirst
                        + " and "
                        + originalSecond
                        + " is "
                        + firstNumber);

        scanner.close();
    }
}