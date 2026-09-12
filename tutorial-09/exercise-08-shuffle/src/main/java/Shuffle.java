package main.java;

import java.util.Arrays;
import java.util.Random;

public class Shuffle {

    // Exercise 10-8 Shuffle

    public static String[] shuffle(String[] arr) {

        // Create a new array so the original array is not changed
        String[] shuffled = arr.clone();

        Random random = new Random();

        // Shuffle the elements using the Fisher-Yates algorithm
        for (int i = shuffled.length - 1; i > 0; i--) {

            // Generate a random position from 0 to i
            int randomPosition = random.nextInt(i + 1);

            // Swap the current element with the randomly selected element
            String temp = shuffled[i];
            shuffled[i] = shuffled[randomPosition];
            shuffled[randomPosition] = temp;
        }

        return shuffled;
    }

    public static void main(String[] args) {

        String[] arr1 = {"CSEN", "202", "Spring", "2019"};

        String[] arr2 = {"Hi", "Hello", "Welcome"};

        System.out.println("Original array 1: "
                + Arrays.toString(arr1));

        System.out.println("Shuffled array 1: "
                + Arrays.toString(shuffle(arr1)));

        System.out.println();

        System.out.println("Original array 2: "
                + Arrays.toString(arr2));

        System.out.println("Shuffled array 2: "
                + Arrays.toString(shuffle(arr2)));
    }
}