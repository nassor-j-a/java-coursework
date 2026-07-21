import java.util.Scanner;

/**
 * Exercise 4-3
 * Adder
 *
 * Reads a specified number of integers
 * and calculates their total sum.
 */
public class Adder {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("==================================");
        System.out.println("            Adder");
        System.out.println("==================================");

        System.out.print("How many integers will be added? ");
        int numberOfIntegers = scanner.nextInt();

        int sum = 0;

        for (int i = 1; i <= numberOfIntegers; i++) {

            System.out.print("Enter integer " + i + ": ");
            int value = scanner.nextInt();

            sum += value;
        }

        System.out.println("The sum is " + sum);

        scanner.close();
    }
}