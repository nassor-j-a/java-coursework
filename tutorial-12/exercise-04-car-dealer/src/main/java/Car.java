package main.java;

public class Car {

    // Attributes of a car
    private String make;
    private String model;
    private int yearOfManufacture;
    private double price;

    // Constructor to initialize all car attributes
    public Car(String make, String model, int yearOfManufacture, double price) {
        this.make = make;
        this.model = model;
        this.yearOfManufacture = yearOfManufacture;
        this.price = price;
    }

    // Getters
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public double getPrice() {
        return price;
    }

    // Setter to update the car's price
    public void setPrice(double price) {
        this.price = price;
    }

    // Display the car's details
    @Override
    public String toString() {
        return "Make: " + make
                + ", Model: " + model
                + ", Year: " + yearOfManufacture
                + ", Price: " + String.format("%.2f", price);
    }
}
