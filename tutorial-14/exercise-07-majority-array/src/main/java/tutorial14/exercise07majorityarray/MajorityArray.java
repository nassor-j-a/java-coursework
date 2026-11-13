package tutorial14.exercise07majorityarray;

public class MajorityArray {

    // Approach 1: Linear search - O(n)
    public static boolean isMajorityElement(int x, int[] a) {

        if (a == null || a.length == 0) {
            return false;
        }

        int count = 0;

        for (int i = 0; i < a.length; i++) {

            if (a[i] == x) {
                count++;
            }
        }

        return count > a.length / 2;
    }

    // Approach 2: Binary search - O(log n)
    public static boolean isMajorityElementBinary(int x, int[] a) {

        if (a == null || a.length == 0) {
            return false;
        }

        int first = findFirstOccurrence(x, a);

        if (first == -1) {
            return false;
        }

        int checkPosition = first + a.length / 2;

        return checkPosition < a.length
                && a[checkPosition] == x;
    }

    // Finds the first occurrence of x using binary search
    private static int findFirstOccurrence(int x, int[] a) {

        int low = 0;
        int high = a.length - 1;
        int result = -1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (a[mid] == x) {

                result = mid;
                high = mid - 1;

            } else if (x < a[mid]) {

                high = mid - 1;

            } else {

                low = mid + 1;
            }
        }

        return result;
    }
}