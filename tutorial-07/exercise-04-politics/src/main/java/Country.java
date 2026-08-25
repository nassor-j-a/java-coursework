package main.java;

// Exercise 8-4 - Politics

import java.util.Scanner;

public class Country {

    // Instance variables
    private String countryName;
    private int noOfCitizens;
    private boolean isRoyal;
    private String continent;
    private int politicalState;

    // Default constructor
    public Country() {
        countryName = "Unknown";
        noOfCitizens = 0;
        isRoyal = false;
        continent = "Unknown";
        politicalState = 4;
    }

    // Constructor with all parameters
    public Country(String countryName, int noOfCitizens,
                   boolean isRoyal, String continent,
                   int politicalState) {

        this.countryName = countryName;
        this.noOfCitizens = noOfCitizens;
        this.isRoyal = isRoyal;
        this.continent = continent;
        this.politicalState = politicalState;
    }

    // Returns the political state
    public int getState() {
        return politicalState;
    }

    // Returns whether the country is royal
    public boolean getRoyalState() {
        return isRoyal;
    }

    // Sets the political state
    public void setDefCon(int p) {
        politicalState = p;
    }

    // Increases the number of citizens
    public void increaseCitizen(int c) {
        noOfCitizens += c;
    }

    // Displays a full report
    public void display() {
        System.out.println("Country name: " + countryName);
        System.out.println("Number of citizens: " + noOfCitizens);
        System.out.println("Royal country: " + isRoyal);
        System.out.println("Continent: " + continent);
        System.out.println("Political state: " + politicalState);
    }

    // Instance comparison method
    public int compareTo(Country a) {
        return this.noOfCitizens - a.noOfCitizens;
    }

    // Static comparison method
    public static int compareTo(Country a, Country b) {
        return a.noOfCitizens - b.noOfCitizens;
    }

    // Main method
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Construct and initialize first country
        System.out.print("Enter country 1 name: ");
        String name1 = scanner.nextLine();

        System.out.print("Enter number of citizens: ");
        int citizens1 = scanner.nextInt();

        System.out.print("Is the country royal? (true/false): ");
        boolean royal1 = scanner.nextBoolean();

        scanner.nextLine();

        System.out.print("Enter continent: ");
        String continent1 = scanner.nextLine();

        System.out.print("Enter political state (1-4): ");
        int state1 = scanner.nextInt();

        Country c1 = new Country(
                name1,
                citizens1,
                royal1,
                continent1,
                state1
        );

        // Display first country
        System.out.println("\nCountry 1 Report:");
        c1.display();

        // Change political state
        System.out.print("\nEnter new political state for country 1: ");
        int newState = scanner.nextInt();

        c1.setDefCon(newState);

        System.out.println("\nUpdated Political State: "
                + c1.getState());

        // Construct second country
        scanner.nextLine();

        System.out.print("\nEnter country 2 name: ");
        String name2 = scanner.nextLine();

        System.out.print("Enter number of citizens: ");
        int citizens2 = scanner.nextInt();

        System.out.print("Is the country royal? (true/false): ");
        boolean royal2 = scanner.nextBoolean();

        scanner.nextLine();

        System.out.print("Enter continent: ");
        String continent2 = scanner.nextLine();

        System.out.print("Enter political state (1-4): ");
        int state2 = scanner.nextInt();

        Country c2 = new Country(
                name2,
                citizens2,
                royal2,
                continent2,
                state2
        );

        // Compare using instance method
        System.out.println("\nUsing instance compareTo():");

        int instanceResult = c1.compareTo(c2);

        if (instanceResult == 0) {
            System.out.println(
                    "Both countries have the same number of citizens."
            );
        } else if (instanceResult > 0) {
            System.out.println(
                    "Country with more citizens: " + c1.countryName
            );
        } else {
            System.out.println(
                    "Country with more citizens: " + c2.countryName
            );
        }

        // Compare using static method
        System.out.println("\nUsing static compareTo():");

        int staticResult = Country.compareTo(c1, c2);

        if (staticResult == 0) {
            System.out.println(
                    "Both countries have the same number of citizens."
            );
        } else if (staticResult > 0) {
            System.out.println(
                    "Country with more citizens: " + c1.countryName
            );
        } else {
            System.out.println(
                    "Country with more citizens: " + c2.countryName
            );
        }

        scanner.close();
    }
}
