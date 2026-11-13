package tutorial14.exercise06removeduplicatessortedarray;

public class Main {

    public static void main(String[] args) {

        int[] input = {1, 1, 1, 1, 2, 2, 3, 3, 3, 5};

        // Approach 1: In-place compaction
        System.out.println("APPROACH 1: IN-PLACE COMPACTION");

        LinearSortedArray array1 =
                new LinearSortedArray(input, input.length);

        System.out.print("Before: ");
        array1.display();

        System.out.println("nElems: " + array1.getNElems());

        array1.removeDuplicates();

        System.out.print("After:  ");
        array1.display();

        System.out.println("nElems: " + array1.getNElems());


        // Approach 2: Repeated shifting
        System.out.println("\nAPPROACH 2: REPEATED SHIFTING");

        LinearSortedArray array2 =
                new LinearSortedArray(input, input.length);

        System.out.print("Before: ");
        array2.display();

        System.out.println("nElems: " + array2.getNElems());

        array2.removeDuplicatesByShifting();

        System.out.print("After:  ");
        array2.display();

        System.out.println("nElems: " + array2.getNElems());
    }
}