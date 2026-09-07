import java.util.Scanner;

public class UnionAndIntersection {

    // Exercise 10-3 Union and Intersection

    public static void union(int[] array1, int[] array2) {

        // Print all elements from the first array
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }

        // Print elements from the second array
        // that are not already present in the first array
        for (int i = 0; i < array2.length; i++) {

            boolean found = false;

            for (int j = 0; j < array1.length; j++) {
                if (array2[i] == array1[j]) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.print(array2[i] + " ");
            }
        }

        System.out.println();
    }

    public static void intersection(int[] array1, int[] array2) {

        // Find elements that exist in both arrays
        for (int i = 0; i < array1.length; i++) {

            for (int j = 0; j < array2.length; j++) {

                if (array1[i] == array2[j]) {
                    System.out.print(array1[i] + " ");
                    break;
                }
            }
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the first array: ");
        int size1 = scanner.nextInt();

        int[] array1 = new int[size1];

        System.out.println("Enter the elements of the first array:");
        for (int i = 0; i < array1.length; i++) {
            array1[i] = scanner.nextInt();
        }

        System.out.print("Enter the size of the second array: ");
        int size2 = scanner.nextInt();

        int[] array2 = new int[size2];

        System.out.println("Enter the elements of the second array:");
        for (int i = 0; i < array2.length; i++) {
            array2[i] = scanner.nextInt();
        }

        System.out.println("Union:");
        union(array1, array2);

        System.out.println("Intersection:");
        intersection(array1, array2);

        scanner.close();
    }
}