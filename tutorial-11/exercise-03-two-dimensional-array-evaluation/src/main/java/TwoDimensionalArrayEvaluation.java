package main.java;

public class TwoDimensionalArrayEvaluation {

    // Tutorial 11 - Exercise 1-3
    // Two-Dimensional Array Evaluation

    /*
     * Evaluates one row using logical AND.
     *
     * The row evaluates to true only if all its elements are true.
     */
    public static boolean rowConjunction(boolean[] row) {

        // Start with true because every element must be true
        boolean result = true;

        // Check every element in the row
        for (int i = 0; i < row.length; i++) {

            // Combine the current result with the current element
            result = result && row[i];
        }

        return result;
    }

    /*
     * Evaluates the complete array.
     *
     * Each row is evaluated using AND.
     * The row results are combined using OR.
     */
    public static boolean evaluate(boolean[][] array) {

        // Start with false because at least one row must be true
        boolean result = false;

        // Evaluate each row
        for (int i = 0; i < array.length; i++) {

            boolean rowResult = rowConjunction(array[i]);

            // Combine the row result with the overall result using OR
            result = result || rowResult;
        }

        return result;
    }

    /*
     * Displays the evaluation result of every row.
     */
    public static void displayRowResults(boolean[][] array) {

        for (int i = 0; i < array.length; i++) {

            System.out.println(
                    "Row " + i + ": " + rowConjunction(array[i]));
        }
    }

    public static void main(String[] args) {

        boolean[][] array = {
            {true, true, false},
            {true, true},
            {false, false, false}
        };

        System.out.println("Row evaluation results:");

        displayRowResults(array);

        System.out.println("\nOverall array result:");

        System.out.println(evaluate(array));
    }
}