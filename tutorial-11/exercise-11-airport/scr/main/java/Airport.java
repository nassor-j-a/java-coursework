package main.java;

public class Airport {

    // Tutorial 11 - Exercise 1-11: Airport

    // Array of flights managed by the airport
    private Flight[] flights;

    // Number of flights currently managed
    private int numberOfFlights;

    /*
     * Constructor:
     * Creates an airport that can manage a specified
     * maximum number of flights.
     */
    public Airport(int maximumFlights) {

        if (maximumFlights <= 0) {
            throw new IllegalArgumentException(
                    "Maximum number of flights must be positive."
            );
        }

        flights = new Flight[maximumFlights];
        numberOfFlights = 0;
    }

    /*
     * Adds a flight if the airport has available capacity
     * and the flight is not already managed by another airport.
     */
    public void addFlight(Flight f) {

        if (f == null) {
            System.out.println("Cannot add a null flight.");
            return;
        }

        // Check whether the airport has reached its capacity
        if (numberOfFlights >= flights.length) {
            System.out.println(
                    "Cannot add flight: airport is at full capacity."
            );
            return;
        }

        // A flight can only be managed by one airport
        if (f.isManagedByAirport()) {
            System.out.println(
                    "Cannot add flight: another airport already manages it."
            );
            return;
        }

        // Register the flight in the first available position
        flights[numberOfFlights] = f;
        numberOfFlights++;

        // Mark the flight as managed
        f.setManagedByAirport(true);

        System.out.println("Flight added successfully.");
    }

    /*
     * Transfers one passenger from flight f1 to flight f2.
     *
     * The transfer is possible only if:
     * 1. Both flights are managed by this airport.
     * 2. The flights are different.
     * 3. Flight f1 has at least one passenger.
     * 4. Flight f2 has available passenger capacity.
     */
    public void transferPassenger(Flight f1, Flight f2) {

        if (f1 == null || f2 == null) {
            System.out.println(
                    "Cannot transfer passenger: flight cannot be null."
            );
            return;
        }

        if (f1 == f2) {
            System.out.println(
                    "Cannot transfer a passenger to the same flight."
            );
            return;
        }

        // Verify that both flights belong to this airport
        if (!containsFlight(f1) || !containsFlight(f2)) {
            System.out.println(
                    "Cannot transfer passenger: "
                    + "both flights must belong to this airport."
            );
            return;
        }

        // Check that the source flight has a passenger
        if (f1.getNumberOfPassengers() == 0) {
            System.out.println(
                    "Cannot transfer passenger: source flight is empty."
            );
            return;
        }

        // Check that the destination flight has space
        if (f2.getNumberOfPassengers()
                >= f2.getMaximumPassengers()) {

            System.out.println(
                    "Cannot transfer passenger: destination flight is full."
            );
            return;
        }

        // Perform the transfer
        f1.removePassenger();
        f2.addPassenger();

        System.out.println("Passenger transferred successfully.");
    }

    /*
     * Registers a passenger on the first available flight
     * heading to the requested destination.
     */
    public void registerPassenger(String destination) {

        if (destination == null || destination.trim().isEmpty()) {
            System.out.println(
                    "Cannot register passenger: invalid destination."
            );
            return;
        }

        // Search the airport's flights
        for (int i = 0; i < numberOfFlights; i++) {

            Flight flight = flights[i];

            // Check destination, ignoring letter case
            if (flight.getDestinationCountry()
                    .equalsIgnoreCase(destination.trim())) {

                // Check whether this flight has available capacity
                if (flight.getNumberOfPassengers()
                        < flight.getMaximumPassengers()) {

                    flight.addPassenger();

                    System.out.println(
                            "Passenger registered for destination: "
                            + destination
                    );

                    return;
                }
            }
        }

        // No suitable flight was found
        System.out.println(
                "No available flight for destination: " + destination
        );
    }

    /*
     * Checks whether this airport manages a particular flight.
     */
    private boolean containsFlight(Flight flight) {

        for (int i = 0; i < numberOfFlights; i++) {

            if (flights[i] == flight) {
                return true;
            }
        }

        return false;
    }

    /*
     * Returns the number of flights managed by the airport.
     */
    public int getNumberOfFlights() {
        return numberOfFlights;
    }

    /*
     * Displays the flights managed by the airport.
     */
    @Override
    public String toString() {

        StringBuilder result = new StringBuilder();

        result.append("Airport Flight Management")
              .append("\nFlights Managed: ")
              .append(numberOfFlights)
              .append("/")
              .append(flights.length)
              .append("\n");

        for (int i = 0; i < numberOfFlights; i++) {

            result.append("\nFlight ")
                  .append(i + 1)
                  .append(":\n")
                  .append(flights[i])
                  .append("\nPassengers: ")
                  .append(flights[i].getNumberOfPassengers())
                  .append("\n");
        }

        return result.toString();
    }

    /*
     * Main method: tests the Airport class.
     */
    public static void main(String[] args) {

        // Create an airport that can manage three flights
        Airport airport = new Airport(3);

        // Create three flights
        Flight flight1 = new Flight(
                2,
                5,
                "Egypt",
                "Germany",
                240,
                java.sql.Time.valueOf("09:30:00")
        );

        Flight flight2 = new Flight(
                3,
                4,
                "Egypt",
                "Kenya",
                300,
                java.sql.Time.valueOf("11:00:00")
        );

        Flight flight3 = new Flight(
                1,
                3,
                "Egypt",
                "Germany",
                260,
                java.sql.Time.valueOf("13:00:00")
        );

        // Test addFlight()
        System.out.println("=== Adding Flights ===");

        airport.addFlight(flight1);
        airport.addFlight(flight2);
        airport.addFlight(flight3);

        System.out.println("\n" + airport);

        // Test airport capacity
        System.out.println("=== Testing Airport Capacity ===");

        Flight flight4 = new Flight(
                0,
                2,
                "Egypt",
                "France",
                200,
                java.sql.Time.valueOf("15:00:00")
        );

        airport.addFlight(flight4);

        // Test transferPassenger()
        System.out.println("\n=== Transferring a Passenger ===");

        airport.transferPassenger(flight1, flight2);

        System.out.println(
                "Flight 1 passengers: "
                + flight1.getNumberOfPassengers()
        );

        System.out.println(
                "Flight 2 passengers: "
                + flight2.getNumberOfPassengers()
        );

        // Test registerPassenger()
        System.out.println("\n=== Registering Passengers ===");

        airport.registerPassenger("Germany");

        airport.registerPassenger("Kenya");

        airport.registerPassenger("France");

        // Display the final airport status
        System.out.println("\n=== Final Airport Status ===");
        System.out.println(airport);
    }
}