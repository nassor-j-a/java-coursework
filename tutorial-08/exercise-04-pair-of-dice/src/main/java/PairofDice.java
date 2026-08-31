package main.java;

// Exercise 9-4 Pair Of Dice

public class PairofDice {

    private int firstDice;
    private int secondDice;

    // Constructor
    // Rolls the dice so they initially contain random values.
    public PairofDice() {
        roll();
    }

    // Rolls both dice.
    public void roll() {
        firstDice = (int) (Math.random() * 6) + 1;
        secondDice = (int) (Math.random() * 6) + 1;
    }

    // Returns the value of the first die.
    public int getFirstDice() {
        return firstDice;
    }

    // Returns the value of the second die.
    public int getSecondDice() {
        return secondDice;
    }

    // Returns the total of both dice.
    public int getTotal() {
        return firstDice + secondDice;
    }

    public static void main(String[] args) {

        PairofDice dice = new PairofDice();

        System.out.println("Initial roll:");
        System.out.println("First dice: " + dice.getFirstDice());
        System.out.println("Second dice: " + dice.getSecondDice());
        System.out.println("Total: " + dice.getTotal());

        System.out.println();

        // Roll the dice repeatedly.
        // The stopping condition will be added once the
        // remaining part of the exercise is provided.
        for (int i = 1; i <= 5; i++) {

            dice.roll();

            System.out.println("Roll " + i + ": "
                    + dice.getFirstDice() + " + "
                    + dice.getSecondDice()
                    + " = " + dice.getTotal());
        }
    }
}
