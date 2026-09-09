import java.util.Scanner;

public class Subset {

    public static boolean subset(int[] array1, int[] array2) {

        // An empty array is a subset of every array
        if (array1.length == 0) {
            return true;
        }

        // Check every element of array1
        for (int i = 0; i < array1.length; i++) {

            boolean found = false;

            // Search for the element in array2
            for (int j = 0; j < array2.length; j++) {

                if (array1[i] == array2[j]) {
                    found = true;
                    break;
                }
            }

            // If an element from array1 was not found in array2,
            // array1 is not a subset
            if (!found) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of Array 1: ");
        int size1 = scanner.nextInt();

        int[] array1 = new int[size1];

        System.out.println("Enter the elements of Array 1:");

        for (int i = 0; i < size1; i++) {
            array1[i] = scanner.nextInt();
        }

        System.out.print("Enter the size of Array 2: ");
        int size2 = scanner.nextInt();

        int[] array2 = new int[size2];

        System.out.println("Enter the elements of Array 2:");

        for (int i = 0; i < size2; i++) {
            array2[i] = scanner.nextInt();
        }

        if (subset(array1, array2)) {
            System.out.println("Array 1 is a subset of Array 2");
        } else {
            System.out.println("Array 1 is not a subset of Array 2");
        }

        scanner.close();
    }
}