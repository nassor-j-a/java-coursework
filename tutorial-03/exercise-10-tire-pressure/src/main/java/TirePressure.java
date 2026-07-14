import java.util.*;

/**
 * Exercise 3-10
 * Tire Pressure
 *
 * Checks whether the pressure
 * of four tires is within the
 * acceptable range.
 */
public class TirePressure {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("==================================");
        System.out.println("        Tire Pressure Check");
        System.out.println("==================================");

        System.out.print("Enter right front tire pressure: ");
        int rightFront = scanner.nextInt();

        System.out.print("Enter left front tire pressure: ");
        int leftFront = scanner.nextInt();

        System.out.print("Enter right rear tire pressure: ");
        int rightRear = scanner.nextInt();

        System.out.print("Enter left rear tire pressure: ");
        int leftRear = scanner.nextInt();

        boolean validRange =
                rightFront >= 35 && rightFront <= 45 &&
                leftFront >= 35 && leftFront <= 45 &&
                rightRear >= 35 && rightRear <= 45 &&
                leftRear >= 35 && leftRear <= 45;

        boolean validDifference =
                Math.abs(rightFront - leftFront) <= 3 &&
                Math.abs(rightRear - leftRear) <= 3;

        System.out.println();

        if (validRange && validDifference) {
            System.out.println("Inflation is OK");
        } else {
            System.out.println("Inflation is NOT OK");
        }

        scanner.close();
    }
}