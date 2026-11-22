package main.java.tutorial15.exercise09recursivebubblesort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] numbers1 = {5, 3, 8, 2, 1};

        System.out.println("Test 1: Unordered array");
        testSort(numbers1);

        int[] numbers2 = {1, 2, 3, 4, 5};

        System.out.println("\nTest 2: Already sorted array");
        testSort(numbers2);

        int[] numbers3 = {9, 7, 5, 3, 1};

        System.out.println("\nTest 3: Reverse-sorted array");
        testSort(numbers3);

        int[] numbers4 = {4, 2, 4, 1, 2};

        System.out.println("\nTest 4: Array with duplicates");
        testSort(numbers4);

        int[] numbers5 = {};

        System.out.println("\nTest 5: Empty array");
        testSort(numbers5);

        int[] numbers6 = {7};

        System.out.println("\nTest 6: Single-element array");
        testSort(numbers6);
    }

    public static void testSort(int[] array) {

        System.out.println("Before sorting: " + Arrays.toString(array));

        RecursiveBubbleSort.bubbleSort(array);

        System.out.println("After sorting:  " + Arrays.toString(array));
    }
}