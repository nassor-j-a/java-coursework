package tutorial16.exercise02stackdecompose;

public class Main {

    public static void main(String[] args) {

        ArrayStack x = new ArrayStack(8);

        // Insert elements from bottom to top.
        x.push(6);
        x.push(9);
        x.push(3);
        x.push(5);
        x.push(4);
        x.push(1);
        x.push(2);
        x.push(7);

        System.out.println("Original stack x:");
        x.printStack();

        // Decompose the original stack.
        ArrayStack y = StackDecomposer.decompose(x);

        System.out.println("\nAfter decomposition:");

        System.out.println("\nStack x (odd positions):");
        x.printStack();

        System.out.println("\nStack y (even positions):");
        y.printStack();
    }
}