package main.java;

import java.util.ArrayList;
import java.util.Arrays;

public class CommonElements {

    public static void main(String[] args) {

        // Create the first ArrayList
        ArrayList<Integer> list1 = new ArrayList<>(
                Arrays.asList(10, 20, 30, 40, 50));

        // Create the second ArrayList
        ArrayList<Integer> list2 = new ArrayList<>(
                Arrays.asList(30, 40, 50, 60, 70));

        // Create a new ArrayList to store common elements
        ArrayList<Integer> commonElements = new ArrayList<>();

        // Check each element in the first list
        for (int i = 0; i < list1.size(); i++) {

            int number = list1.get(i);

            // Check whether the element also exists in the second list
            if (list2.contains(number)) {

                // Avoid adding the same common element more than once
                if (!commonElements.contains(number)) {
                    commonElements.add(number);
                }
            }
        }

        // Print the original lists
        System.out.println("First list: " + list1);
        System.out.println("Second list: " + list2);

        // Print the common elements
        System.out.println("Common elements: " + commonElements);
    }
}
