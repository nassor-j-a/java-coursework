package main.java;

import java.util.ArrayList;
import java.util.Iterator;

public class CarDealer {

    // Attributes of the car dealer
    private ArrayList<Car> cars;
    private double money;
    private double profit;

    // Constructor to initialize the dealer's attributes
    public CarDealer(ArrayList<Car> cars, double money, double profit) {
        this.cars = new ArrayList<>(cars);
        this.money = money;
        this.profit = profit;
    }

    // Sell the first car matching the given model
    public boolean sellCar(String model) {

        for (int i = 0; i < cars.size(); i++) {

            Car car = cars.get(i);

            if (car.getModel().equals(model)) {

                double sellingPrice = car.getPrice();

                // 20% of the selling price is profit
                double saleProfit = sellingPrice * 0.20;

                // The remaining 80% is added to available money
                double moneyReceived = sellingPrice * 0.80;

                money += moneyReceived;
                profit += saleProfit;

                // Remove the sold car from the inventory
                cars.remove(i);

                System.out.println("Sold: " + car.getModel());
                System.out.printf("Selling price: %.2f%n", sellingPrice);
                System.out.printf("Profit earned: %.2f%n", saleProfit);

                return true;
            }
        }

        System.out.println("Car model not found: " + model);
        return false;
    }

    // Buy a car only if the dealer has enough money
    public boolean buyCar(Car c) {

        if (c == null) {
            System.out.println("Cannot buy a null car.");
            return false;
        }

        if (money >= c.getPrice()) {

            // Pay for the car
            money -= c.getPrice();

            // Add the car to the inventory
            cars.add(c);

            System.out.println("Bought: " + c.getModel());
            return true;

        } else {

            System.out.println("Insufficient funds to buy " + c.getModel());
            return false;
        }
    }

    // Remove all cars manufactured before the given year
    public void removeOldCars(int year) {

        Iterator<Car> iterator = cars.iterator();
        int removedCount = 0;

        while (iterator.hasNext()) {

            Car car = iterator.next();

            if (car.getYearOfManufacture() < year) {
                iterator.remove();
                removedCount++;
            }
        }

        System.out.println(removedCount + " old car(s) removed.");
    }

    // Apply 2% annual depreciation for each year of a car's age
    public void discount(int currentYear) {

        for (Car car : cars) {

            int age = currentYear - car.getYearOfManufacture();

            if (age > 0) {

                // Each year, the car retains 98% of its previous value
                double discountedPrice =
                        car.getPrice() * Math.pow(0.98, age);

                car.setPrice(discountedPrice);
            }
        }

        System.out.println("Car prices have been updated.");
    }

    // Print all cars currently in the dealer's inventory
    public void printCarList() {

        System.out.println("\n--- Car Inventory ---");

        if (cars.isEmpty()) {
            System.out.println("No cars available.");
            return;
        }

        for (Car car : cars) {
            System.out.println(car);
        }
    }

    // Getters for the dealer's financial information
    public double getMoney() {
        return money;
    }

    public double getProfit() {
        return profit;
    }

    public int getNumberOfCars() {
        return cars.size();
    }
}