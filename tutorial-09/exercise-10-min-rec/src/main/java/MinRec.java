package main.java;

public class MinRec {

    // Exercise 10-10 MinRec - Final Exam 2016

    public static int MinRec(int[] array) {

        // Base case: one element is automatically the smallest
        if (array.length == 1) {
            return array[0];
        }

        // Create the smallest value from the array excluding the last element
        int[] smallerArray = new int[array.length - 1];

        for (int i = 0; i < smallerArray.length; i++) {
            smallerArray[i] = array[i];
        }

        // Recursively find the smallest value
        int smallest = MinRec(smallerArray);

        // Compare the last element with the recursive result
        if (array[array.length - 1] < smallest) {
            return array[array.length - 1];
        } else {
            return smallest;
        }
    }

    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4};
        int[] b = {5, 2};
        int[] c = {6, 6};

        System.out.println(MinRec(a));
        System.out.println(MinRec(b));
        System.out.println(MinRec(c));
    }
}