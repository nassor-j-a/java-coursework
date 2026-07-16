import java.util.Scanner;

/**
 * Exercise 3-13
 * Body Mass Index (BMI)
 *
 * Calculates BMI and classifies
 * the user based on standard BMI ranges.
 */
public class BMI {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("==================================");
        System.out.println("      Body Mass Index (BMI)");
        System.out.println("==================================");

        System.out.print("Enter your weight (kg): ");
        double weight = scanner.nextDouble();

        System.out.print("Enter your height (m): ");
        double height = scanner.nextDouble();

        double bmi = weight / (height * height);

        System.out.printf("%nBMI = %.2f%n", bmi);

        if (bmi <= 18.5) {

            System.out.println("You are underweight.");

        } else if (bmi <= 25.0) {

            System.out.println("You are fit.");

        } else {

            System.out.println("You are overweight.");

        }

        scanner.close();
    }
}