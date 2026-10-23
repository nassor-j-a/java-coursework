package main.java;

import java.util.ArrayList;

public class FindOccurrences {

    // Returns the indices where the target string occurs in the list
    public static ArrayList<Integer> findOccurrences(
            ArrayList<String> strings, String target) {

        // Store the indices where the target is found
        ArrayList<Integer> indices = new ArrayList<>();

        // Visit every element in the list
        for (int i = 0; i < strings.size(); i++) {

            // Compare the current string with the target
            if (strings.get(i).equals(target)) {

                // Save the index if the strings match
                indices.add(i);
            }
        }

        // Return all matching indices
        return indices;
    }

    public static void main(String[] args) {

        // Create an ArrayList of strings
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("apple");
        fruits.add("banana");
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("banana");
        fruits.add("apple");

        // Specify the string to search for
        String target = "apple";

        // Call the method and store its result
        ArrayList<Integer> result = findOccurrences(fruits, target);

        // Display the results
        System.out.println("List: " + fruits);
        System.out.println("String to find: " + target);
        System.out.println("Indices found: " + result);
    }
}
