package main.java.tutorial16.exercise05dailytemperatures;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] temperatures1 = {73, 74, 75, 71, 69, 72, 76, 73};

        int[] temperatures2 = {30, 40, 50, 60};

        int[] temperatures3 = {90, 80, 70, 60};

        int[] temperatures4 = {70, 70, 70};

        int[] temperatures5 = {};

        System.out.println("Example:");
        System.out.println("Input:  " + Arrays.toString(temperatures1));
        System.out.println("Output: " +
                Arrays.toString(DailyTemperatures.warmerDays(temperatures1)));

        System.out.println("\nIncreasing temperatures:");
        System.out.println("Input:  " + Arrays.toString(temperatures2));
        System.out.println("Output: " +
                Arrays.toString(DailyTemperatures.warmerDays(temperatures2)));

        System.out.println("\nDecreasing temperatures:");
        System.out.println("Input:  " + Arrays.toString(temperatures3));
        System.out.println("Output: " +
                Arrays.toString(DailyTemperatures.warmerDays(temperatures3)));

        System.out.println("\nEqual temperatures:");
        System.out.println("Input:  " + Arrays.toString(temperatures4));
        System.out.println("Output: " +
                Arrays.toString(DailyTemperatures.warmerDays(temperatures4)));

        System.out.println("\nEmpty array:");
        System.out.println("Input:  " + Arrays.toString(temperatures5));
        System.out.println("Output: " +
                Arrays.toString(DailyTemperatures.warmerDays(temperatures5)));
    }
}