package main.java.tutorial16.exercise01searchinastack;

public class StackSearching {

    public static int searchFor(ArrayStack original, int target) {

        // Create a temporary stack.
        ArrayStack temporary = new ArrayStack(original.size());

        int position = 0;
        int result = -1;

        // Move elements from the original stack to the temporary stack.
        while (!original.isEmpty()) {

            int value = original.pop();

            // Record the first matching position.
            if (value == target && result == -1) {
                result = position;
            }

            temporary.push(value);

            position++;
        }

        // Restore the original stack.
        while (!temporary.isEmpty()) {

            original.push(temporary.pop());
        }

        return result;
    }
}