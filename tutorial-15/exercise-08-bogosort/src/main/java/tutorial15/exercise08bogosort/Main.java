package tutorial15.exercise08bogosort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] numbers1 = {3, 1, 4, 2};

        System.out.println("Test 1: Unordered array");
        testSort(numbers1);

        int[] numbers2 = {1, 2, 3, 4};

        System.out.println("\nTest 2: Already sorted array");
        testSort(numbers2);

        int[] numbers3 = {5, 4, 3, 2, 1};

        System.out.println("\nTest 3: Reverse-sorted array");
        testSort(numbers3);

        int[] numbers4 = {3, 1, 2, 3, 1};

        System.out.println("\nTest 4: Array with duplicates");
        testSort(numbers4);

        int[] numbers5 = {};

        System.out.println("\nTest 5: Empty array");
        testSort(numbers5);
    }

    public static void testSort(int[] a) {

        System.out.println("Before sorting: " + Arrays.toString(a));

        BogoSort.bogoSort(a);

        System.out.println("After sorting:  " + Arrays.toString(a));
        System.out.println("Is sorted:      " + BogoSort.isSorted(a));
    }
}