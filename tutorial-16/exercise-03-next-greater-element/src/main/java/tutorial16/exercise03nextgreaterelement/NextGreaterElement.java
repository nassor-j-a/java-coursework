package tutorial16.exercise03nextgreaterelement;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class NextGreaterElement {

    public static int[] findNGE(int[] array) {

        if (array == null) {
            throw new IllegalArgumentException("Array cannot be null.");
        }

        int n = array.length;
        int[] result = new int[n];

        // Stack stores potential next greater elements.
        Deque<Integer> stack = new ArrayDeque<>();

        // Process the array from right to left.
        for (int i = n - 1; i >= 0; i--) {

            // Remove elements that cannot be the NGE.
            while (!stack.isEmpty() && stack.peek() <= array[i]) {
                stack.pop();
            }

            // The top element is the nearest greater element.
            if (stack.isEmpty()) {
                result[i] = -1;
            } else {
                result[i] = stack.peek();
            }

            // Current element may be the NGE for an element to its left.
            stack.push(array[i]);
        }

        return result;
    }

    public static void display(int[] array) {
        System.out.println(Arrays.toString(array));
    }
}