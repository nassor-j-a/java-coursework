import java.util.Scanner;

/**
 * Exercise 3-12
 * Gas Station
 *
 * Determines whether a driver
 * should refuel before travelling
 * a 200-mile stretch.
 */
public class GasStation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("==================================");
        System.out.println("      Gas Station Advisor");
        System.out.println("==================================");

        System.out.print("Enter tank capacity (gallons): ");
        double tankCapacity = scanner.nextDouble();

        System.out.print("Enter fuel gauge reading (%): ");
        double fuelPercentage = scanner.nextDouble();

        System.out.print("Enter miles per gallon (MPG): ");
        double milesPerGallon = scanner.nextDouble();

        double remainingFuel = tankCapacity * (fuelPercentage / 100.0);
        double distance = remainingFuel * milesPerGallon;

        System.out.printf("%nEstimated travel distance: %.2f miles%n", distance);

        if (distance < 200) {
            System.out.println("Get Gas!");
        } else {
            System.out.println("Safe to Proceed!");
        }

        scanner.close();
    }
}