package main.java;

public class Divisors {

    public static void main(String[] args) {

        int maxDivisors = 0;
        int numberWithMax = 1;

        // Test every integer from 1 to 10000
        for (int i = 1; i <= 10000; i++) {

            int currentDivisorCount = 0;

            // Count the divisors of i
            for (int j = 1; j <= i; j++) {

                if (i % j == 0) {
                    currentDivisorCount++;
                }
            }

            // Update the maximum if necessary
            if (currentDivisorCount > maxDivisors) {
                maxDivisors = currentDivisorCount;
                numberWithMax = i;
            }
        }

        System.out.println("The integer with the largest number of divisors is: " + numberWithMax);
        System.out.println("It has exactly " + maxDivisors + " divisors.");
    }
}