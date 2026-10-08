package main.java;

public class MergeRec {

    // Exercise 7-24 MergeRec

    public static void mergeRec(String a, String b) {
        mergeRec(a, b, true);
    }

    private static void mergeRec(String a, String b, boolean takeA) {

        // Base case: both strings are empty
        if (a.length() == 0 && b.length() == 0) {
            return;
        }

        // If a is empty, print the remaining characters of b
        if (a.length() == 0) {
            System.out.print(b.charAt(0));
            mergeRec(a, b.substring(1), true);
            return;
        }

        // If b is empty, print the remaining characters of a
        if (b.length() == 0) {
            System.out.print(a.charAt(0));
            mergeRec(a.substring(1), b, false);
            return;
        }

        // Take a character from a
        if (takeA) {
            System.out.print(a.charAt(0));
            mergeRec(a.substring(1), b, false);
        } else {
            // Take a character from b
            System.out.print(b.charAt(0));
            mergeRec(a, b.substring(1), true);
        }
    }

    public static void main(String[] args) {

        String a = "hlo";
        String b = "el";

        mergeRec(a, b);
    }
}