/**
 * Exercise 4-9
 * Snake Eyes
 *
 * Rolls two dice until both dice show 1.
 */

public class SnakeEyes {

    public static void main(String[] args) {

        int die1;
        int die2;
        int rolls = 0;

        do {

            die1 = (int) (6 * Math.random()) + 1;
            die2 = (int) (6 * Math.random()) + 1;

            rolls++;

            System.out.println("Roll " + rolls +
                    ": Die 1 = " + die1 +
                    ", Die 2 = " + die2);

        } while (die1 != 1 || die2 != 1);

        System.out.println();
        System.out.println("It took " + rolls + " rolls to get snake eyes.");
    }
}