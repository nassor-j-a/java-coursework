package main.java;

import java.util.Scanner;

public class Clerk {

    // Instance variables
    String firstName;
    String lastName;
    int yearOfBirth;
    int salaryClass;
    boolean married;

    // Default constructor
    public Clerk() {
        this.firstName = "";
        this.lastName = "";
        this.yearOfBirth = 0;
        this.salaryClass = 0;
        this.married = false;
    }

    // Parameterized constructor
    public Clerk(String firstName, String lastName, int yearOfBirth,
                 int salaryClass, boolean married) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
        this.salaryClass = salaryClass;
        this.married = married;
    }

    // Promote a clerk to a new salary class
    public static void promote(Clerk a, int newSalaryClass) {
        a.salaryClass = newSalaryClass;
    }

    // Change marital status to married
    public void marry() {
        this.married = true;
    }

    // Change marital status to unmarried
    public void divorce() {
        this.married = false;
    }

    // Calculate monthly salary
    public double salary(int thisYear) {

        double baseSalary = 2000.0;

        // Salary class increase:
        // x * 17/9 percent
        double salaryClassIncrease =
                salaryClass * (17.0 / 9.0);

        double salary = baseSalary
                + baseSalary * salaryClassIncrease / 100.0;

        // Calculate age
        int age = thisYear - yearOfBirth;

        // 1% increase starting at age 30,
        // then another 1% for every completed 5 years
        if (age >= 30) {
            int fiveYearPeriods = (age - 30) / 5;
            double ageIncrease = (fiveYearPeriods + 1) * 1.0;

            salary += baseSalary * ageIncrease / 100.0;
        }

        // Married allowance
        if (married) {
            salary += baseSalary * 12.3 / 100.0;
        }

        return salary;
    }

    // Compare salaries of two clerks
    public static int compare(Clerk a, Clerk b) {
        return (int) (a.salary(2026) - b.salary(2026));
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter details for the first clerk:");

        System.out.print("First name: ");
        String firstName1 = scanner.nextLine();

        System.out.print("Last name: ");
        String lastName1 = scanner.nextLine();

        System.out.print("Year of birth: ");
        int yearOfBirth1 = scanner.nextInt();

        System.out.print("Salary class: ");
        int salaryClass1 = scanner.nextInt();

        System.out.print("Married (true/false): ");
        boolean married1 = scanner.nextBoolean();

        scanner.nextLine();

        Clerk clerk1 = new Clerk(
                firstName1,
                lastName1,
                yearOfBirth1,
                salaryClass1,
                married1
        );

        System.out.println();

        System.out.println("Enter details for the second clerk:");

        System.out.print("First name: ");
        String firstName2 = scanner.nextLine();

        System.out.print("Last name: ");
        String lastName2 = scanner.nextLine();

        System.out.print("Year of birth: ");
        int yearOfBirth2 = scanner.nextInt();

        System.out.print("Salary class: ");
        int salaryClass2 = scanner.nextInt();

        System.out.print("Married (true/false): ");
        boolean married2 = scanner.nextBoolean();

        Clerk clerk2 = new Clerk(
                firstName2,
                lastName2,
                yearOfBirth2,
                salaryClass2,
                married2
        );

        int thisYear = 2026;

        // Display initial salaries
        System.out.println();
        System.out.println("Initial salaries:");

        System.out.println(
                clerk1.firstName + " " + clerk1.lastName
                        + ": " + clerk1.salary(thisYear) + " Euro"
        );

        System.out.println(
                clerk2.firstName + " " + clerk2.lastName
                        + ": " + clerk2.salary(thisYear) + " Euro"
        );

        // First clerk gets married
        clerk1.marry();

        System.out.println();
        System.out.println("After the first clerk gets married:");

        System.out.println(
                clerk1.firstName + " " + clerk1.lastName
                        + ": " + clerk1.salary(thisYear) + " Euro"
        );

        System.out.println(
                clerk2.firstName + " " + clerk2.lastName
                        + ": " + clerk2.salary(thisYear) + " Euro"
        );

        // Promote second clerk to salary class 7
        promote(clerk2, 7);

        System.out.println();
        System.out.println("After the second clerk is promoted to salary class 7:");

        System.out.println(
                clerk1.firstName + " " + clerk1.lastName
                        + ": " + clerk1.salary(thisYear) + " Euro"
        );

        System.out.println(
                clerk2.firstName + " " + clerk2.lastName
                        + ": " + clerk2.salary(thisYear) + " Euro"
        );

        // Compare salaries
        System.out.println();

        int comparison = compare(clerk1, clerk2);

        if (comparison > 0) {
            System.out.println(
                    clerk1.firstName + " " + clerk1.lastName
                            + " has the larger salary."
            );
        } else if (comparison < 0) {
            System.out.println(
                    clerk2.firstName + " " + clerk2.lastName
                            + " has the larger salary."
            );
        } else {
            System.out.println("Both clerks have the same salary.");
        }

        scanner.close();
    }
}
