package main.java;

// Exercise 8-3 - Time

public class Time {

    // Instance variables
    private int hours;
    private int minutes;
    private int seconds;

    // Default constructor
    public Time() {
        hours = 0;
        minutes = 0;
        seconds = 0;
    }

    // Constructor with hours, minutes and seconds
    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    // Returns the hours
    public int hours() {
        return hours;
    }

    // Returns the minutes
    public int minutes() {
        return minutes;
    }

    // Returns the seconds
    public int seconds() {
        return seconds;
    }

    // Adds one minute
    public void addminute() {
        minutes++;

        if (minutes == 60) {
            minutes = 0;
            addhour();
        }
    }

    // Adds one second
    public void addsecond() {
        seconds++;

        if (seconds == 60) {
            seconds = 0;
            addminute();
        }
    }

    // Adds one hour
    public void addhour() {
        hours++;

        if (hours == 24) {
            hours = 0;
        }
    }

    // Main method for testing
    public static void main(String[] args) {

        // Test default constructor
        Time time1 = new Time();

        System.out.println("Default time:");
        System.out.println(
                time1.hours() + ":" +
                time1.minutes() + ":" +
                time1.seconds()
        );

        // Test overloaded constructor
        Time time2 = new Time(23, 59, 58);

        System.out.println("\nInitial time:");
        System.out.println(
                time2.hours() + ":" +
                time2.minutes() + ":" +
                time2.seconds()
        );

        // Add one second
        time2.addsecond();

        System.out.println("\nAfter adding one second:");
        System.out.println(
                time2.hours() + ":" +
                time2.minutes() + ":" +
                time2.seconds()
        );

        // Add another second
        time2.addsecond();

        System.out.println("\nAfter adding another second:");
        System.out.println(
                time2.hours() + ":" +
                time2.minutes() + ":" +
                time2.seconds()
        );

        // Add one minute
        time2.addminute();

        System.out.println("\nAfter adding one minute:");
        System.out.println(
                time2.hours() + ":" +
                time2.minutes() + ":" +
                time2.seconds()
        );

        // Add one hour
        time2.addhour();

        System.out.println("\nAfter adding one hour:");
        System.out.println(
                time2.hours() + ":" +
                time2.minutes() + ":" +
                time2.seconds()
        );
    }
}
