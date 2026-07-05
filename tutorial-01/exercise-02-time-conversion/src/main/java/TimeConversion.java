import java.util.Scanner;

/**
 * Exercise 2
 * Time Conversion
 *
 * Converts a duration given in seconds into
 * hours, minutes, and remaining seconds.
 */
public class TimeConversion {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("==================================");
        System.out.println("        Time Conversion");
        System.out.println("==================================");

        System.out.print("Enter time in seconds: ");

        int totalSeconds = scanner.nextInt();

        int hours = totalSeconds / 3600;

        int remainingSeconds = totalSeconds % 3600;

        int minutes = remainingSeconds / 60;

        int seconds = remainingSeconds % 60;

        System.out.println();
        System.out.println("Equivalent Time");
        System.out.println("---------------------------");
        System.out.println("Hours   : " + hours);
        System.out.println("Minutes : " + minutes);
        System.out.println("Seconds : " + seconds);

        scanner.close();
    }
}