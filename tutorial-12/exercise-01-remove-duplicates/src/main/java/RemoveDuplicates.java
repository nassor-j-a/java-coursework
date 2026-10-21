package main.java;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveDuplicates {

    public static void main(String[] args) {

        // Scanner reads input from the user
        Scanner input = new Scanner(System.in);

        // Create an ArrayList to store the 10 integers
        ArrayList<Integer> numbers = new ArrayList<>();

        // Read 10 integers
        System.out.println("Enter 10 integers:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Integer " + (i + 1) + ": ");

            int number = input.nextInt();

            numbers.add(number);
        }

        // Display the original list
        System.out.println("\nOriginal list: " + numbers);

        // Remove duplicate values
        for (int i = 0; i < numbers.size(); i++) {

            for (int j = i + 1; j < numbers.size(); j++) {

                // Compare the current element with later elements
                if (numbers.get(i).equals(numbers.get(j))) {

                    // Remove the duplicate element
                    numbers.remove(j);

                    // The list has shifted, so check this index again
                    j--;
                }
            }
        }

        // Display the list containing only unique values
        System.out.println("Unique values: " + numbers);

        input.close();
    }
}
