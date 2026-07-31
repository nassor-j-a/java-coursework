import java.util.Scanner;

/**
 * Exercise 5-1
 * Stream of Numbers
 *
 * Reads a sequence of non-negative integers and
 * displays the maximum, minimum and average.
 */
public class StreamOfNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int maxNum = 0;
        int minNum = 0;
        int sum = 0;
        int counter = 0;

        System.out.println("Please enter a sequence of non-negative numbers:");
        System.out.println("(Enter a negative number to stop)");

        do {

            int enteredNum = scanner.nextInt();

            if (enteredNum < 0) {
                break;
            }

            if (counter == 0) {
                maxNum = enteredNum;
                minNum = enteredNum;
            }

            if (enteredNum > maxNum) {
                maxNum = enteredNum;
            }

            if (enteredNum < minNum) {
                minNum = enteredNum;
            }

            sum += enteredNum;
            counter++;

        } while (true);

        if (counter > 0) {

            double average = (double) sum / counter;

            System.out.println("The maximum number is : " + maxNum);
            System.out.println("The minimum number is : " + minNum);
            System.out.printf("The average is : %.2f%n", average);

        } else {

            System.out.println("No numbers were entered.");
        }

        scanner.close();
    }
}