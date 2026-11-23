package main.java.tutorial16.exercise01searchinastack;

public class Main {

    public static void main(String[] args) {

        ArrayStack stack = new ArrayStack(10);

        // Insert elements from bottom to top.
        stack.push(20);
        stack.push(4);
        stack.push(7);
        stack.push(20);
        stack.push(1);

        System.out.println("Original stack:");
        stack.printStack();

        System.out.println("\n--- Internal Search ---");

        System.out.println("Search 1:  " + stack.search(1));
        System.out.println("Search 20: " + stack.search(20));
        System.out.println("Search 7:  " + stack.search(7));
        System.out.println("Search 99: " + stack.search(99));

        System.out.println("\nStack after internal searches:");
        stack.printStack();

        System.out.println("\n--- External Search ---");

        System.out.println("Search 1:  " +
                StackSearching.searchFor(stack, 1));

        System.out.println("Search 20: " +
                StackSearching.searchFor(stack, 20));

        System.out.println("Search 7:  " +
                StackSearching.searchFor(stack, 7));

        System.out.println("Search 99: " +
                StackSearching.searchFor(stack, 99));

        System.out.println("\nStack after external searches:");
        stack.printStack();
    }
}