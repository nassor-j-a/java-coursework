import java.util.Scanner;

/**
 * Exercise 4-8
 * Stream of Numbers
 * Using a while loop.
 */
public class StreamNumbersWhile {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        int count = 0;

        System.out.println("Please enter a sequence of positive numbers:");

        while (true) {

            int number = scanner.nextInt();

            if (number < 0) {
                break;
            }

            if (number > max) {
                max = number;
            }

            if (number < min) {
                min = number;
            }

            sum += number;
            count++;
        }

        if (count == 0) {
            System.out.println("No positive numbers were entered.");
        } else {

            double average = (double) sum / count;

            System.out.println("The maximum number is : " + max);
            System.out.println("The minimum number is : " + min);
            System.out.println("The average is : " + average);
        }

        scanner.close();
    }
}