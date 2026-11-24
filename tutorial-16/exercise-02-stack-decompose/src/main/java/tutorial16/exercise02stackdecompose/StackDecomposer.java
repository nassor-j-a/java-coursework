package tutorial16.exercise02stackdecompose;

public class StackDecomposer {

    public static ArrayStack decompose(ArrayStack x) {

        if (x == null) {
            throw new IllegalArgumentException("Stack cannot be null.");
        }

        // Create two auxiliary stacks.
        ArrayStack temporary = new ArrayStack(x.size());
        ArrayStack y = new ArrayStack(x.size());

        // Remember the original number of elements.
        int position = x.size();

        // Stage 1: Reverse the original stack.
        while (!x.isEmpty()) {
            temporary.push(x.pop());
        }

        // Stage 2: Distribute elements into x and y.
        while (!temporary.isEmpty()) {

            int value = temporary.pop();

            if (position % 2 == 0) {

                // Even position: push into y.
                y.push(value);

            } else {

                // Odd position: push back into x.
                x.push(value);
            }

            position--;
        }

        // Return the stack containing even-positioned elements.
        return y;
    }
}