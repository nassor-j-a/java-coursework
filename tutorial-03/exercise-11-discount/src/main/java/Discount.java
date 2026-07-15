import java.util.Scanner;

/**
 * Exercise 3-11
 * Discount
 *
 * Calculates the total purchase cost
 * and applies a 10% discount if the
 * total exceeds EGP 1000.
 */
public class Discount {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        final double UNIT_PRICE = 100.0;

        System.out.println("==================================");
        System.out.println("       Purchase Discount");
        System.out.println("==================================");

        System.out.print("Enter quantity purchased: ");
        int quantity = scanner.nextInt();

        double totalCost = quantity * UNIT_PRICE;

        if (totalCost > 1000) {
            totalCost *= 0.90;   // Apply 10% discount
        }

        System.out.printf("%nTotal Cost = EGP %.2f%n", totalCost);

        scanner.close();
    }
}