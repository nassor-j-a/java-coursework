package main.java;

import java.util.Scanner;

public class SmallestLargestMean {

    // Exercise 10-1 Arrays: Smallest Value, Largest Value, Arithmetic Mean

    // (a) Find the smallest value
    public static int findSmallest(int[] numbers) {
        int smallest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }

        return smallest;
    }

    // (a) Find the largest value
    public static int findLargest(int[] numbers) {
        int largest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }

        return largest;
    }

    // (b) Find the position of the smallest value
    public static int findSmallestPosition(int[] numbers) {
        int smallestPosition = 0;

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < numbers[smallestPosition]) {
                smallestPosition = i;
            }
        }

        return smallestPosition;
    }

    // (b) Find the position of the largest value
    public static int findLargestPosition(int[] numbers) {
        int largestPosition = 0;

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > numbers[largestPosition]) {
                largestPosition = i;
            }
        }

        return largestPosition;
    }

    // (c) Calculate the arithmetic mean
    public static double calculateMean(int[] numbers) {
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        return (double) sum / numbers.length;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of values: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter value " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // (a) Smallest and largest values
        int smallest = findSmallest(numbers);
        int largest = findLargest(numbers);

        System.out.println("\nSmallest value: " + smallest);
        System.out.println("Largest value: " + largest);

        // (b) Positions
        int smallestPosition = findSmallestPosition(numbers);
        int largestPosition = findLargestPosition(numbers);

        System.out.println("Position of smallest value: "
                + smallestPosition);
        System.out.println("Position of largest value: "
                + largestPosition);

        // (c) Arithmetic mean
        double mean = calculateMean(numbers);

        System.out.println("Arithmetic mean: " + mean);
    }
}