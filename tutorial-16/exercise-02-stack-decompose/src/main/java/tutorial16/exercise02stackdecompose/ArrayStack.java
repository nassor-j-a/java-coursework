package tutorial16.exercise02stackdecompose;

public class ArrayStack {

    private int[] theStack;
    private int maxSize;
    private int top;

    public ArrayStack(int capacity) {
        maxSize = Math.max(capacity, 1);
        theStack = new int[maxSize];
        top = -1;
    }

    public void push(int value) {

        if (top == maxSize - 1) {
            throw new IllegalStateException("Stack is full.");
        }

        theStack[++top] = value;
    }

    public int pop() {

        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty.");
        }

        return theStack[top--];
    }

    public int top() {

        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty.");
        }

        return theStack[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        return top + 1;
    }

    public void printStack() {

        System.out.println("Top");

        for (int i = top; i >= 0; i--) {
            System.out.println("| " + theStack[i] + " |");
        }

        System.out.println("Bottom");
    }
}
