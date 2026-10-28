package tutorial12.exercise04cardealer;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // Create some cars
        Car car1 = new Car("Toyota", "Corolla", 2022, 10000.0);
        Car car2 = new Car("Honda", "Civic", 2018, 8000.0);
        Car car3 = new Car("BMW", "X5", 2024, 30000.0);

        // Create the initial inventory
        ArrayList<Car> initialCars = new ArrayList<>();

        initialCars.add(car1);
        initialCars.add(car2);
        initialCars.add(car3);

        // Create a dealer with 20,000 in available money and zero profit
        CarDealer dealer = new CarDealer(initialCars, 20000.0, 0.0);

        // Display the initial inventory
        System.out.println("===== INITIAL INVENTORY =====");
        dealer.printCarList();

        // Apply discounts based on the year 2026
        System.out.println("\n===== APPLY DISCOUNTS =====");
        dealer.discount(2026);
        dealer.printCarList();

        // Sell the Toyota Corolla
        System.out.println("\n===== SELL A CAR =====");
        dealer.sellCar("Corolla");

        // Buy another car
        System.out.println("\n===== BUY A CAR =====");
        Car car4 = new Car("Kia", "Sportage", 2023, 12000.0);
        dealer.buyCar(car4);

        // Remove cars manufactured before 2020
        System.out.println("\n===== REMOVE OLD CARS =====");
        dealer.removeOldCars(2020);

        // Display the final inventory
        System.out.println("\n===== FINAL INVENTORY =====");
        dealer.printCarList();

        // Display the dealer's financial information
        System.out.println("\n===== DEALER FINANCES =====");
        System.out.printf("Available money: %.2f%n", dealer.getMoney());
        System.out.printf("Total profit: %.2f%n", dealer.getProfit());
        System.out.println("Cars in inventory: " + dealer.getNumberOfCars());
    }
}