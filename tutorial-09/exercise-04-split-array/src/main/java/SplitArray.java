package main.java;

import java.util.Scanner;

public class SplitArray {

    public static void split(int[] array, int pivot, int size) {

        int left = 0;
        int right = size - 1;

        while (left <= right) {

            // Find an element that belongs on the right
            while (left <= right && array[left] <= pivot) {
                left++;
            }

            // Find an element that belongs on the left
            while (left <= right && array[right] > pivot) {
                right--;
            }

            // Swap the two elements
            if (left < right) {
                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;

                left++;
                right--;
            }
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("Enter " + size + " integers:");

        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("Enter the pivot: ");
        int pivot = scanner.nextInt();

        split(array, pivot, size);

        System.out.println("Partitioned array:");

        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }

        scanner.close();
    }
}
