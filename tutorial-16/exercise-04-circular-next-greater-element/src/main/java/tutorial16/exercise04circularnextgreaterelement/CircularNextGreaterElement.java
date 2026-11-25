package tutorial16.exercise04circularnextgreaterelement;

import java.util.ArrayDeque;
import java.util.Deque;

public class CircularNextGreaterElement {

    public static int[] findNGE(int[] array) {

        if (array == null) {
            throw new IllegalArgumentException("Array cannot be null.");
        }

        int n = array.length;
        int[] result = new int[n];

        if (n == 0) {
            return result;
        }

        Deque<Integer> stack = new ArrayDeque<>();

        // Traverse the circular array twice, from right to left.
        for (int i = 2 * n - 1; i >= 0; i--) {

            // Convert the virtual index into a real array index.
            int index = i % n;

            // Remove elements that cannot be the next greater element.
            while (!stack.isEmpty() && stack.peek() <= array[index]) {
                stack.pop();
            }

            // Store answers only during the second pass.
            if (i < n) {

                if (stack.isEmpty()) {
                    result[index] = -1;
                } else {
                    result[index] = stack.peek();
                }
            }

            // Add the current value as a candidate for earlier elements.
            stack.push(array[index]);
        }

        return result;
    }
}