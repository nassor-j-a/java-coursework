package tutorial14.exercise05sortedarraylist;

import java.util.ArrayList;

public class LinearSortedArrayList {

    private ArrayList<Integer> list;

    public LinearSortedArrayList() {
        list = new ArrayList<>();
    }

    // Inserts an element while maintaining ascending order
    public void orderedInsert(int x) {

        int i = 0;

        // Find the correct insertion position
        while (i < list.size() && list.get(i) <= x) {
            i++;
        }

        // Insert x at the correct position
        list.add(i, x);
    }

    // Iterative binary search
    public int binarySearchIter(int x) {

        int low = 0;
        int high = list.size() - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (list.get(mid) == x) {
                return mid;
            }

            if (x < list.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return -1;
    }

    // Recursive binary search
    public int binarySearchRec(int x) {
        return binarySearchRec(x, 0, list.size() - 1);
    }

    // Recursive helper method
    private int binarySearchRec(int x, int low, int high) {

        if (low > high) {
            return -1;
        }

        int mid = low + (high - low) / 2;

        if (list.get(mid) == x) {
            return mid;
        }

        if (x < list.get(mid)) {
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

        list.remove(position);
    }

    // Displays the elements
    public void display() {
        System.out.println(list);
    }

    // Returns the number of elements
    public int getSize() {
        return list.size();
    }
}