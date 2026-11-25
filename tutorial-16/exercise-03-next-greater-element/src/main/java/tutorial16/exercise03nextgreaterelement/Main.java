package tutorial16.exercise03nextgreaterelement;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // Test 1: Required example.
        int[] numbers1 = {4, 5, 2, 10};

        System.out.println("Test 1: Required example");
        testNGE(numbers1);

        // Test 2: Descending array.
        int[] numbers2 = {10, 8, 6, 4, 2};

        System.out.println("\nTest 2: Descending array");
        testNGE(numbers2);

        // Test 3: Ascending array.
        int[] numbers3 = {1, 2, 3, 4, 5};

        System.out.println("\nTest 3: Ascending array");
        testNGE(numbers3);

        // Test 4: Duplicate values.
        int[] numbers4 = {4, 4, 2, 2, 5};

        System.out.println("\nTest 4: Duplicate values");
        testNGE(numbers4);

        // Test 5: Negative values.
        int[] numbers5 = {-2, -5, -1, -8};

        System.out.println("\nTest 5: Negative values");
        testNGE(numbers5);

        // Test 6: Empty array.
        int[] numbers6 = {};

        System.out.println("\nTest 6: Empty array");
        testNGE(numbers6);
    }

    public static void testNGE(int[] array) {

        System.out.println("Input:  " + Arrays.toString(array));

        int[] result = NextGreaterElement.findNGE(array);

        System.out.println("Output: " + Arrays.toString(result));
    }
}