package main.java;

public class Search {

    // Exercise 7-19 Search

    public static int search(String value, char character) {

        // Base case: the string is empty
        if (value.length() == 0) {
            return -1;
        }

        // If the first character matches, its position is 0
        if (value.charAt(0) == character) {
            return 0;
        }

        // Search the remaining string
        int position = search(value.substring(1), character);

        // If the character was not found, return -1
        if (position == -1) {
            return -1;
        }

        // Add 1 because the remaining string starts one position later
        return position + 1;
    }

    public static void main(String[] args) {

        System.out.println(search("example", 'a'));
    }
}
