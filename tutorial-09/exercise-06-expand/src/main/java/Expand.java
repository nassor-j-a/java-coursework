import java.util.Arrays;

public class Expand {

    public static int[] expand(int[] a, int n) {

        // If n is 0 or negative, return an empty array
        if (n <= 0) {
            return new int[0];
        }

        // For n = 1, return the same array
        if (n == 1) {
            return a;
        }

        // Each original element produces n copies
        int[] result = new int[a.length * n];

        int position = 0;

        for (int i = 0; i < a.length; i++) {

            int value = a[i] / n;

            for (int j = 0; j < n; j++) {
                result[position] = value;
                position++;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int[] a = {21, 8, 15, 0, -3, 32};

        System.out.println("Original array: " + Arrays.toString(a));

        int[] result1 = expand(a, 3);
        System.out.println("expand(a, 3): " + Arrays.toString(result1));

        int[] result2 = expand(a, 1);
        System.out.println("expand(a, 1): " + Arrays.toString(result2));

        int[] result3 = expand(a, 0);
        System.out.println("expand(a, 0): " + Arrays.toString(result3));
    }
}