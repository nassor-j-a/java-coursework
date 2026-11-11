package tutorial14.exercise04sortedarray;

public class LinearSortedArray {

    private int[] arr;
    private int size;

    public LinearSortedArray(int capacity) {
        arr = new int[capacity];
        size = 0;
    }

    // Inserts an element while maintaining ascending order
    public void orderedInsert(int x) {

        if (size == arr.length) {
            System.out.println("Array is full.");
            return;
        }

        int i = size - 1;

        // Shift elements greater than x one position to the right
        while (i >= 0 && arr[i] > x) {
            arr[i + 1] = arr[i];
            i--;
        }

        // Insert x in its correct position
        arr[i + 1] = x;
        size++;
    }

    // Iterative binary search
    public int binarySearchIter(int x) {

        int low = 0;
        int high = size - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (arr[mid] == x) {
                return mid;
            }

            if (x < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return -1;
    }

    // Recursive binary search
    public int binarySearchRec(int x) {
        return binarySearchRec(x, 0, size - 1);
    }

    // Helper method for recursive binary search
    private int binarySearchRec(int x, int low, int high) {

        if (low > high) {
            return -1;
        }

        int mid = low + (high - low) / 2;

        if (arr[mid] == x) {
            return mid;
        }

        if (x < arr[mid]) {
            return binarySearchRec(x, low, mid - 1);
        }

        return binarySearchRec(x, mid + 1, high);
    }

    // Deletes the first occurrence of x
    public void delete(int x) {

        int position = binarySearchIter(x);

        if (position == -1) {
            System.out.println(x + " was not found.");
            return;
        }

        // Shift subsequent elements one position to the left
        for (int i = position; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }

        size--;
    }

    // Displays the elements currently stored
    public void display() {

        System.out.print("[");

        for (int i = 0; i < size; i++) {

            System.out.print(arr[i]);

            if (i < size - 1) {
                System.out.print(", ");
            }
        }

        System.out.println("]");
    }

    public int getSize() {
        return size;
    }
}