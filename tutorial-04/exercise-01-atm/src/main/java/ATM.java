import java.util.Random;
import java.util.Scanner;

/**
 * Exercise 4-1
 * ATM PIN Verification
 *
 * Simulates an ATM that allows
 * the user three attempts to
 * enter a randomly generated PIN.
 */
public class ATM {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int generatedPIN = random.nextInt(9000) + 1000;

        System.out.println("==================================");
        System.out.println("        ATM PIN Verification");
        System.out.println("==================================");

        System.out.println("Generated PIN: " + generatedPIN);

        boolean success = false;

        for (int trial = 1; trial <= 3; trial++) {

            System.out.print("Please enter your PIN: ");
            int enteredPIN = scanner.nextInt();

            if (enteredPIN == generatedPIN) {

                System.out.println("You succeeded to guess your PIN in trial number " + trial);
                success = true;
                break;

            } else if (trial < 3) {

                System.out.println("Incorrect PIN. Attempts remaining: " + (3 - trial));

            }
        }

        if (!success) {
            System.out.println("You exceeded your trials. We will lock your account!");
        }

        scanner.close();
    }
}