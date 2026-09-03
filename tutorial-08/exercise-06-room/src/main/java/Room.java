package main.java;

public class Room {

    private String guestName;
    private int roomNumber;
    private double rate;
    private int daysRented;
    private int beds;

    // Constructor
    public Room(String guestName, int roomNumber, int beds,
                double rate, int daysRented) {
        this.guestName = guestName;
        this.roomNumber = roomNumber;
        this.beds = beds;
        this.rate = rate;
        this.daysRented = daysRented;
    }

    // Calculates the total rent
    public double calculateTotal() {
        return rate * daysRented;
    }

    // Adds one bed, up to a maximum of two
    public void addBed() {
        if (beds < 2) {
            beds++;
        }
    }

    // Returns the room information
    @Override
    public String toString() {
        return "Guest name: " + guestName + "\n"
                + "Room number: " + roomNumber + "\n"
                + "Room beds: " + beds + "\n"
                + String.format("Rate: %.2f%n", rate)
                + "Rented for: " + daysRented
                + (daysRented == 1 ? " day" : " days");
    }

    // Test the Room class
    public static void main(String[] args) {

        Room room = new Room("Blake", 123, 1, 123.50, 5);

        System.out.println(room);
        System.out.printf("Total rent: %.2f%n", room.calculateTotal());

        System.out.println("\nAdding a bed...");
        room.addBed();

        System.out.println(room);

        System.out.println("\nTrying to add another bed...");
        room.addBed();

        System.out.println(room);
    }
}