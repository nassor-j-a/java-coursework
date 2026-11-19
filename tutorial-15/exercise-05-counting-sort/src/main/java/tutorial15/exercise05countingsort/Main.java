package main.java.tutorial15.exercise05countingsort;

public class Main {

    public static void main(String[] args) {

        // Test 1: Required type of input - distinct positive integers.
        int[] array1 = {4, 3, 8, 2};

        System.out.println("Test 1: Distinct values");
        System.out.print("Original array: ");
        CountingSort.display(array1);

        System.out.print("Boolean Sort:   ");
        CountingSort.display(CountingSort.booleanSort(array1));

        System.out.print("Counting Sort:  ");
        CountingSort.display(CountingSort.countingSort(array1));


        // Test 2: Duplicate values.
        int[] array2 = {4, 2, 4, 1, 3, 2, 4};

        System.out.println("\nTest 2: Duplicate values");
        System.out.print("Original array: ");
        CountingSort.display(array2);

        System.out.print("Boolean Sort:   ");
        CountingSort.display(CountingSort.booleanSort(array2));

        System.out.print("Counting Sort:  ");
        CountingSort.display(CountingSort.countingSort(array2));


        // Test 3: All values are identical.
        int[] array3 = {5, 5, 5, 5};

        System.out.println("\nTest 3: Identical values");
        System.out.print("Boolean Sort:   ");
        CountingSort.display(CountingSort.booleanSort(array3));

        System.out.print("Counting Sort:  ");
        CountingSort.display(CountingSort.countingSort(array3));


        // Test 4: Already sorted array.
        int[] array4 = {1, 2, 3, 4, 5};

        System.out.println("\nTest 4: Already sorted");
        System.out.print("Counting Sort:  ");
        CountingSort.display(CountingSort.countingSort(array4));


        // Test 5: Empty array.
        int[] array5 = {};

        System.out.println("\nTest 5: Empty array");
        System.out.print("Boolean Sort:   ");
        CountingSort.display(CountingSort.booleanSort(array5));

        System.out.print("Counting Sort:  ");
        CountingSort.display(CountingSort.countingSort(array5));
    }
}