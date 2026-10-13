package main.java;

public class Country {

    // Tutorial 11 - Exercise 1-5: Politics

    // Attributes
    private String countryName;
    private int noOfCitizens;
    private boolean isRoyal;
    private String continent;
    private int politicalState;

    /*
     * Default constructor.
     * Initializes a country with default values.
     */
    public Country() {
        countryName = "Unknown";
        noOfCitizens = 0;
        isRoyal = false;
        continent = "Unknown";
        politicalState = 4; // Peace
    }

    /*
     * Parameterized constructor.
     * Initializes a country using the supplied values.
     */
    public Country(String countryName, int noOfCitizens,
                   boolean isRoyal, String continent,
                   int politicalState) {

        this.countryName = countryName;
        this.noOfCitizens = noOfCitizens;
        this.isRoyal = isRoyal;
        this.continent = continent;
        this.politicalState = politicalState;
    }

    /*
     * Returns the political state of the country.
     */
    public int getState() {
        return politicalState;
    }

    /*
     * Returns whether the country is royal.
     */
    public boolean getRoyalState() {
        return isRoyal;
    }

    /*
     * Sets the political state of the country.
     */
    public void setDefCon(int p) {
        politicalState = p;
    }

    /*
     * Increases the number of citizens by the given value.
     */
    public void increaseCitizen(int c) {
        noOfCitizens += c;
    }

    /*
     * Returns the description of a political state.
     */
    private String getPoliticalStateDescription() {
        switch (politicalState) {
            case 4:
                return "Peace";

            case 3:
                return "Increase intelligence";

            case 2:
                return "Increase in force readiness";

            case 1:
                return "War";

            default:
                return "Unknown political state";
        }
    }

    /*
     * Displays a full report about the country.
     */
    public void display() {
        System.out.println("===== Country Report =====");
        System.out.println("Country Name: " + countryName);
        System.out.println("Number of Citizens: " + noOfCitizens);
        System.out.println("Royal Country: " + isRoyal);
        System.out.println("Continent: " + continent);
        System.out.println("Political State: " + politicalState);
        System.out.println("State Description: "
                + getPoliticalStateDescription());
        System.out.println("==========================");
    }

    /*
     * Compares the number of citizens of this country
     * with the number of citizens of another country.
     *
     * Returns:
     * Positive number: this country has more citizens.
     * Negative number: the other country has more citizens.
     * Zero: both countries have the same number of citizens.
     */
    public int compareTo(Country a) {
        return this.noOfCitizens - a.noOfCitizens;
    }

    /*
     * Static method that compares two countries.
     *
     * Returns the difference between the citizen count
     * of country a and country b.
     */
    public static int compareTo(Country a, Country b) {
        return a.noOfCitizens - b.noOfCitizens;
    }

    /*
     * Main method: creates and compares countries.
     */
    public static void main(String[] args) {

        // Step 1: Construct and initialize the first country.
        Country c1 = new Country(
                "Kenya",
                55000000,
                false,
                "Africa",
                4
        );

        // Step 2: Display the first country's report.
        c1.display();

        // Step 3: Change the political state of c1 to 3.
        c1.setDefCon(3);

        System.out.println("\nAfter changing the political state:");
        c1.display();

        // Step 4: Construct and initialize the second country.
        Country c2 = new Country(
                "Japan",
                124000000,
                true,
                "Asia",
                4
        );

        // Display the second country's report.
        System.out.println("\nSecond country:");
        c2.display();

        // Step 5: Compare the countries using the instance method.
        System.out.println("\n--- Instance Method Comparison ---");

        int difference1 = c1.compareTo(c2);

        if (difference1 > 0) {
            System.out.println(c1.countryName
                    + " has more citizens than "
                    + c2.countryName + ".");
        } else if (difference1 < 0) {
            System.out.println(c2.countryName
                    + " has more citizens than "
                    + c1.countryName + ".");
        } else {
            System.out.println("Both countries have the same number of citizens.");
        }

        System.out.println("Difference in citizens: "
                + Math.abs(difference1));

        // Step 6: Compare the countries using the static method.
        System.out.println("\n--- Static Method Comparison ---");

        int difference2 = Country.compareTo(c1, c2);

        if (difference2 > 0) {
            System.out.println(c1.countryName
                    + " has more citizens than "
                    + c2.countryName + ".");
        } else if (difference2 < 0) {
            System.out.println(c2.countryName
                    + " has more citizens than "
                    + c1.countryName + ".");
        } else {
            System.out.println("Both countries have the same number of citizens.");
        }

        System.out.println("Difference in citizens: "
                + Math.abs(difference2));
    }
}