package tutorial16.exercise04circularnextgreaterelement;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] first = {4, 5, 2, 10, 3};
        int[] second = {4, -2, 5, 8};
        int[] third = {5, 5, 5};
        int[] fourth = {8, 6, 4, 2};
        int[] fifth = {};

        System.out.println("First example:");
        System.out.println("Input:  " + Arrays.toString(first));
        System.out.println("Output: " + Arrays.toString(
                CircularNextGreaterElement.findNGE(first)));

        System.out.println("\nSecond example:");
        System.out.println("Input:  " + Arrays.toString(second));
        System.out.println("Output: " + Arrays.toString(
                CircularNextGreaterElement.findNGE(second)));

        System.out.println("\nAll equal elements:");
        System.out.println("Input:  " + Arrays.toString(third));
        System.out.println("Output: " + Arrays.toString(
                CircularNextGreaterElement.findNGE(third)));

        System.out.println("\nDescending elements:");
        System.out.println("Input:  " + Arrays.toString(fourth));
        System.out.println("Output: " + Arrays.toString(
                CircularNextGreaterElement.findNGE(fourth)));

        System.out.println("\nEmpty array:");
        System.out.println("Input:  " + Arrays.toString(fifth));
        System.out.println("Output: " + Arrays.toString(
                CircularNextGreaterElement.findNGE(fifth)));
    }
}