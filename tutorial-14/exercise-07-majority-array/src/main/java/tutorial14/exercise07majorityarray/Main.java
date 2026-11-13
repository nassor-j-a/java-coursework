package tutorial14.exercise07majorityarray;

public class Main {

    public static void main(String[] args) {

        int[] array1 = {2, 2, 3, 3, 4, 4, 4, 4, 4};

        int[] array2 = {2, 2, 3, 3, 4, 4, 4, 4};

        System.out.println("EXAMPLE 1");
        System.out.println("Array: {2, 2, 3, 3, 4, 4, 4, 4, 4}");

        testBothMethods(2, array1);
        testBothMethods(3, array1);
        testBothMethods(4, array1);

        System.out.println("\nEXAMPLE 2");
        System.out.println("Array: {2, 2, 3, 3, 4, 4, 4, 4}");

        testBothMethods(2, array2);
        testBothMethods(3, array2);
        testBothMethods(4, array2);

        // Additional test
        int[] array3 = {1, 1, 1, 1, 1, 2, 3};

        System.out.println("\nEXAMPLE 3");
        System.out.println("Array: {1, 1, 1, 1, 1, 2, 3}");

        testBothMethods(1, array3);
        testBothMethods(2, array3);
        testBothMethods(5, array3);
    }

    // Tests both implementations for the same value and array
    private static void testBothMethods(int x, int[] a) {

        boolean linearResult =
                MajorityArray.isMajorityElement(x, a);

        boolean binaryResult =
                MajorityArray.isMajorityElementBinary(x, a);

        System.out.println("\nChecking " + x + ":");

        System.out.println("Linear Search: " + linearResult);

        System.out.println("Binary Search: " + binaryResult);
    }
}