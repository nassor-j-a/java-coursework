package main.java.tutorial16.exercise01searchinastack;

public class ArrayStack {

    private int[] theStack;
    private int maxSize;
    private int top;

    public ArrayStack(int capacity) {
        maxSize = Math.max(capacity, 1);
        theStack = new int[maxSize];
        top = -1;
    }

    // Push an element onto the stack.
    public void push(int value) {

        if (top == maxSize - 1) {
            throw new IllegalStateException("Stack is full.");
        }

        top++;
        theStack[top] = value;
    }

    // Remove and return the top element.
    public int pop() {

        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty.");
        }

        int value = theStack[top];
        top--;

        return value;
    }

    // Return the top element without removing it.
    public int top() {

        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty.");
        }

        return theStack[top];
    }

    // Check whether the stack is empty.
    public boolean isEmpty() {
        return top == -1;
    }

    // Return the number of elements.
    public int size() {
        return top + 1;
    }

    // Internal search method.
    public int search(int target) {

        int position = 0;

        // Start searching from the top.
        for (int i = top; i >= 0; i--) {

            if (theStack[i] == target) {
                return position;
            }

            position++;
        }

        return -1;
    }

    // Display the stack from bottom to top.
    public void printStack() {

        System.out.print("Bottom -> ");

        for (int i = 0; i <= top; i++) {
            System.out.print(theStack[i] + " ");
        }

        System.out.println("<- Top");
    }
}