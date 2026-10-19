package main.java;

import java.sql.Time;

public class Flight {

    // Tutorial 11 - Exercise 1-10: Flight

    // Instance variables
    private int numberOfPassengers;
    private int maximumPassengers;

    private String departureCountry;
    private String destinationCountry;

    // Flight duration in minutes
    private int duration;

    // Scheduled departure time
    private Time departureTime;

    /*
     * Default constructor.
     * Creates a flight with default values.
     */
    public Flight() {
        this(0, 200, "Unknown", "Unknown", 0,
                Time.valueOf("00:00:00"));
    }

    /*
     * Parameterized constructor.
     * Initializes all flight details.
     */
    public Flight(
            int numberOfPassengers,
            int maximumPassengers,
            String departureCountry,
            String destinationCountry,
            int duration,
            Time departureTime) {

        // Validate passenger counts and capacity
        if (maximumPassengers < 0) {
            throw new IllegalArgumentException(
                    "Maximum passenger capacity cannot be negative."
            );
        }

        if (numberOfPassengers < 0
                || numberOfPassengers > maximumPassengers) {
            throw new IllegalArgumentException(
                    "Passenger count must be between 0 and capacity."
            );
        }

        if (duration < 0) {
            throw new IllegalArgumentException(
                    "Flight duration cannot be negative."
            );
        }

        if (departureCountry == null
                || destinationCountry == null
                || departureTime == null) {
            throw new IllegalArgumentException(
                    "Flight details cannot be null."
            );
        }

        this.numberOfPassengers = numberOfPassengers;
        this.maximumPassengers = maximumPassengers;
        this.departureCountry = departureCountry;
        this.destinationCountry = destinationCountry;
        this.duration = duration;
        this.departureTime = departureTime;
    }

    /*
     * Returns the current number of passengers.
     */
    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    /*
     * Adds one passenger if there is available space.
     */
    public void addPassenger() {

        if (numberOfPassengers < maximumPassengers) {
            numberOfPassengers++;

            System.out.println("Passenger added successfully.");
        } else {
            System.out.println(
                    "Cannot add passenger: flight is full."
            );
        }
    }

    /*
     * Removes one passenger if the flight has passengers.
     */
    public void removePassenger() {

        if (numberOfPassengers > 0) {
            numberOfPassengers--;

            System.out.println("Passenger removed successfully.");
        } else {
            System.out.println(
                    "Cannot remove passenger: flight is empty."
            );
        }
    }

    /*
     * Changes the departure time to the new delayed time.
     */
    public void delay(Time t) {

        if (t == null) {
            throw new IllegalArgumentException(
                    "Departure time cannot be null."
            );
        }

        departureTime = t;
    }

    /*
     * Returns a readable summary of the flight.
     */
    @Override
    public String toString() {

        return "Departure Country: " + departureCountry
                + "\nDestination Country: " + destinationCountry
                + "\nDeparture Time: " + departureTime;
    }

    /*
     * Main method: tests the Flight class.
     */
    public static void main(String[] args) {

        // Create a flight with all details
        Flight flight = new Flight(
                2,
                3,
                "Egypt",
                "Germany",
                240,
                Time.valueOf("09:30:00")
        );

        // Display flight details
        System.out.println("=== Flight Details ===");
        System.out.println(flight);

        // Test passenger count
        System.out.println(
                "\nCurrent passengers: "
                + flight.getNumberOfPassengers()
        );

        // Add passengers
        System.out.println("\n=== Adding Passengers ===");
        flight.addPassenger();
        flight.addPassenger(); // Flight is now full

        System.out.println(
                "Current passengers: "
                + flight.getNumberOfPassengers()
        );

        // Remove a passenger
        System.out.println("\n=== Removing a Passenger ===");
        flight.removePassenger();

        System.out.println(
                "Current passengers: "
                + flight.getNumberOfPassengers()
        );

        // Delay the flight
        System.out.println("\n=== Delaying the Flight ===");
        flight.delay(Time.valueOf("11:00:00"));

        System.out.println(flight);

        // Test the default constructor
        System.out.println("\n=== Default Flight ===");
        Flight defaultFlight = new Flight();
        System.out.println(defaultFlight);
    }
}