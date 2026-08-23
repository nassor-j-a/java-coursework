import java.util.Scanner;

public class AirplaneModel {

    // Instance variables
    private String name;
    private double emptyWeight;
    private int numberOfSeats;
    private double fuelConsumption;

    // Default constructor
    public AirplaneModel() {
        this.name = "Unknown";
        this.emptyWeight = 0.0;
        this.numberOfSeats = 0;
        this.fuelConsumption = 0.0;
    }

    // Constructor with name and number of seats
    public AirplaneModel(String name, int numberOfSeats) {
        this.name = name;
        this.numberOfSeats = numberOfSeats;
        this.emptyWeight = 0.0;
        this.fuelConsumption = 0.0;
    }

    // Constructor with all parameters
    public AirplaneModel(String name, double emptyWeight,
                         int numberOfSeats, double fuelConsumption) {
        this.name = name;
        this.emptyWeight = emptyWeight;
        this.numberOfSeats = numberOfSeats;
        this.fuelConsumption = fuelConsumption;
    }

    // Getters
    public String getName() {
        return name;
    }

    public double getEmptyWeight() {
        return emptyWeight;
    }

    public int getSeats() {
        return numberOfSeats;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    // Add seats
    public void addSeats(int x) {
        numberOfSeats += x;
    }

    // Instance display method
    public void display() {
        System.out.println("Airplane name: " + name);
        System.out.println("Empty weight: " + emptyWeight);
        System.out.println("Number of seats: " + numberOfSeats);
        System.out.println("Fuel consumption: " + fuelConsumption);
    }

    // Static display method
    public static void display(AirplaneModel a) {
        System.out.println("Airplane name: " + a.name);
        System.out.println("Empty weight: " + a.emptyWeight);
        System.out.println("Number of seats: " + a.numberOfSeats);
        System.out.println("Fuel consumption: " + a.fuelConsumption);
    }

    // Instance comparison method
    public int compare(AirplaneModel a) {
        return this.numberOfSeats - a.numberOfSeats;
    }

    // Static comparison method
    public static int compare(AirplaneModel a, AirplaneModel b) {
        return a.numberOfSeats - b.numberOfSeats;
    }

    // Main method
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Initialize first airplane using two-parameter constructor
        AirplaneModel plane = new AirplaneModel("Boeing", 200);

        // Display number of seats
        System.out.println("Number of seats: " + plane.getSeats());

        // Add 50 seats
        plane.addSeats(50);

        // Display updated number of seats
        System.out.println("Number of seats after adding 50: "
                + plane.getSeats());

        // Display airplane report
        System.out.println("\nAirplane Report:");
        plane.display();

        // Get second airplane information from user
        System.out.print("\nEnter airplane name: ");
        String planeName = scanner.nextLine();

        System.out.print("Enter airplane empty weight: ");
        double planeWeight = scanner.nextDouble();

        System.out.print("Enter airplane number of seats: ");
        int planeNumberOfSeats = scanner.nextInt();

        System.out.print("Enter airplane fuel consumption: ");
        double planeFuelConsumption = scanner.nextDouble();

        // Initialize second airplane
        AirplaneModel plane2 = new AirplaneModel(
                planeName,
                planeWeight,
                planeNumberOfSeats,
                planeFuelConsumption
        );

        // Compare using instance method
        System.out.println("\nUsing instance compare method:");

        int instanceResult = plane.compare(plane2);

        if (instanceResult == 0) {
            System.out.println("The airplanes have the same number of seats.");
        } else if (instanceResult > 0) {
            System.out.println("Airplane with more seats: "
                    + plane.getName());
        } else {
            System.out.println("Airplane with more seats: "
                    + plane2.getName());
        }

        // Compare using static method
        System.out.println("\nUsing static compare method:");

        int staticResult = AirplaneModel.compare(plane, plane2);

        if (staticResult == 0) {
            System.out.println("The airplanes have the same number of seats.");
        } else if (staticResult > 0) {
            System.out.println("Airplane with more seats: "
                    + plane.getName());
        } else {
            System.out.println("Airplane with more seats: "
                    + plane2.getName());
        }

        scanner.close();
    }
}