package main.java.tutorial14.exercise01unsortedarray;

public class LinearArray {

    private int[] arr;
    private int size;

    // Constructor
    public LinearArray(int capacity) {
        arr = new int[capacity];
        size = 0;
    }

    // a) Insert an element at the end
    public void insertLast(int x) {

        if (size == arr.length) {
            System.out.println("Array is full.");
            return;
        }

        arr[size] = x;
        size++;
    }

    // b) Insert an element at the beginning
    public void insertFirst(int x) {

        if (size == arr.length) {
            System.out.println("Array is full.");
            return;
        }

        // Shift existing elements one position to the right
        for (int i = size; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        arr[0] = x;
        size++;
    }

    // c) Search for an element
    public int linearSearch(int x) {

        for (int i = 0; i < size; i++) {

            if (arr[i] == x) {
                return i;
            }
        }

        return -1;
    }

    // d) Delete a specific element
    public void delete(int x) {

        int position = linearSearch(x);

        if (position == -1) {
            System.out.println(x + " was not found.");
            return;
        }

        // Shift elements one position to the left
        for (int i = position; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }

        size--;
    }

    // Display the current elements
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

    // Return the current number of elements
    public int getSize() {
        return size;
    }
}
