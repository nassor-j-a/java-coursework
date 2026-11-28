package main.java.tutorial16.exercise05dailytemperatures;

public class Stack {

    private int[] stackArray;
    private int top;

    public Stack(int size) {
        stackArray = new int[size];
        top = -1;
    }

    public void push(int k) {

        if (isFull()) {
            throw new IllegalStateException("Stack is full.");
        }

        stackArray[++top] = k;
    }

    public int pop() {

        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty.");
        }

        return stackArray[top--];
    }

    public int top() {

        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty.");
        }

        return stackArray[top];
    }

    public int size() {
        return top + 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == stackArray.length - 1;
    }
}