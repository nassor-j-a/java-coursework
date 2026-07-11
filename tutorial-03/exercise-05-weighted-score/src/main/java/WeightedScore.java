import java.util.*;

/**
 * Exercise 3-5
 * Weighted Score
 *
 * Calculates the weighted score
 * for one test.
 */
public class WeightedScore {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("==================================");
        System.out.println("        Weighted Score");
        System.out.println("==================================");

        System.out.print("Enter test number (1-6): ");
        int testNumber = scanner.nextInt();

        System.out.print("Enter test score (0-100): ");
        double score = scanner.nextDouble();

        if (score < 0 || score > 100) {
            System.out.println("Invalid score. Score must be between 0 and 100.");
            scanner.close();
            return;
        }

        double weight;

        switch (testNumber) {

            case 1:
                weight = 0.10;
                break;

            case 2:
            case 3:
                weight = 0.20;
                break;

            case 4:
            case 5:
                weight = 0.15;
                break;

            case 6:
                weight = 0.20;
                break;

            default:
                System.out.println("Invalid test number.");
                scanner.close();
                return;
        }

        double weightedScore = score * weight;

        System.out.printf("%nWeighted Score = %.2f%n", weightedScore);

        scanner.close();
    }
}