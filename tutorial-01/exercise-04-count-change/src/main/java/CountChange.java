import java.util.Scanner;

/**
 * Exercise 4
 * Count Change
 *
 * Calculates the total value of a collection of
 * quarters, dimes, nickels, and pennies.
 */
public class CountChange {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("====================================");
        System.out.println("        Count Change Calculator");
        System.out.println("====================================");

        System.out.print("Enter number of quarters : ");
        int quarters = scanner.nextInt();

        System.out.print("Enter number of dimes    : ");
        int dimes = scanner.nextInt();

        System.out.print("Enter number of nickels  : ");
        int nickels = scanner.nextInt();

        System.out.print("Enter number of pennies  : ");
        int pennies = scanner.nextInt();

        int totalPennies =
                (quarters * 25) +
                (dimes * 10) +
                (nickels * 5) +
                pennies;

        int dollars = totalPennies / 100;
        int remainingPennies = totalPennies % 100;

        System.out.println();
        System.out.println("========== Result ==========");
        System.out.printf("Total Value: $%d.%02d%n", dollars, remainingPennies);

        scanner.close();
    }
}