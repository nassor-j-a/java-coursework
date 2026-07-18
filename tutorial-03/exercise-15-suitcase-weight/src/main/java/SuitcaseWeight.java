import java.util.Scanner;

/**
 * Exercise 3-15
 * Suitcase Weight
 *
 * Determines whether two suitcases
 * are accepted or rejected and
 * calculates any excess baggage charges.
 */
public class SuitcaseWeight {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        final int FREE_LIMIT = 23;
        final int MAX_WEIGHT = 32;
        final int CHARGE_PER_KG = 50;

        int totalCharge = 0;

        String suitcase1Status = "Suitcase 1 accepted";
        String suitcase2Status = "Suitcase 2 accepted";

        System.out.println("==================================");
        System.out.println("      Suitcase Weight Checker");
        System.out.println("==================================");

        System.out.print("Enter weight of suitcase 1 (kg): ");
        int suitcase1 = scanner.nextInt();

        System.out.print("Enter weight of suitcase 2 (kg): ");
        int suitcase2 = scanner.nextInt();

        // Suitcase 1
        if (suitcase1 > MAX_WEIGHT) {

            suitcase1Status = "Suitcase 1 rejected";

        } else if (suitcase1 > FREE_LIMIT) {

            totalCharge += (suitcase1 - FREE_LIMIT) * CHARGE_PER_KG;

        }

        // Suitcase 2
        if (suitcase2 > MAX_WEIGHT) {

            suitcase2Status = "Suitcase 2 rejected";

        } else if (suitcase2 > FREE_LIMIT) {

            totalCharge += (suitcase2 - FREE_LIMIT) * CHARGE_PER_KG;

        }

        System.out.println();
        System.out.println(suitcase1Status);
        System.out.println(suitcase2Status);
        System.out.println("Total charge = " + totalCharge + " LE");

        scanner.close();
    }
}