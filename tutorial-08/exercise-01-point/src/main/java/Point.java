package main.java;

public class Point {

    // Instance variables
    private double x;
    private double y;

    // Class variable
    private static int numberOfPoints = 0;

    // Default constructor
    public Point() {
        this.x = 0;
        this.y = 0;
        numberOfPoints++;
    }

    // Parameterized constructor
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
        numberOfPoints++;
    }

    // Static add method
    // Returns a new Point containing the sum of p1 and p2
    public static Point add(Point p1, Point p2) {

        return new Point(
                p1.x + p2.x,
                p1.y + p2.y
        );
    }

    // Instance add method
    // Adds p's coordinates to this Point
    public void add(Point p) {

        this.x += p.x;
        this.y += p.y;
    }

    // Static swap method
    // Swaps the coordinates of p1 and p2
    public static void swap(Point p1, Point p2) {

        double tempX = p1.x;
        double tempY = p1.y;

        p1.x = p2.x;
        p1.y = p2.y;

        p2.x = tempX;
        p2.y = tempY;
    }

    // Instance swap method
    // Swaps this Point's coordinates with p
    public void swap(Point p) {

        double tempX = this.x;
        double tempY = this.y;

        this.x = p.x;
        this.y = p.y;

        p.x = tempX;
        p.y = tempY;
    }

    // toString method
    @Override
    public String toString() {

        return "(" + x + ", " + y + ")";
    }

    // Getter for number of Point objects created
    public static int getNumberOfPoints() {

        return numberOfPoints;
    }

    // Main method
    public static void main(String[] args) {

        // Test constructors
        Point p1 = new Point(2, 3);
        Point p2 = new Point(4, 5);

        System.out.println("Point 1: " + p1);
        System.out.println("Point 2: " + p2);

        // Test static add
        Point p3 = Point.add(p1, p2);

        System.out.println();
        System.out.println("Static add:");
        System.out.println("Point 1 + Point 2 = " + p3);

        // Test instance add
        p1.add(p2);

        System.out.println();
        System.out.println("Instance add:");
        System.out.println("Point 1 after adding Point 2: " + p1);

        // Create new points for swap tests
        Point p4 = new Point(10, 20);
        Point p5 = new Point(30, 40);

        System.out.println();
        System.out.println("Before static swap:");
        System.out.println("Point 4: " + p4);
        System.out.println("Point 5: " + p5);

        // Test static swap
        Point.swap(p4, p5);

        System.out.println();
        System.out.println("After static swap:");
        System.out.println("Point 4: " + p4);
        System.out.println("Point 5: " + p5);

        // Test instance swap
        p4.swap(p5);

        System.out.println();
        System.out.println("After instance swap:");
        System.out.println("Point 4: " + p4);
        System.out.println("Point 5: " + p5);

        // Test default constructor
        Point p6 = new Point();

        System.out.println();
        System.out.println("Default Point:");
        System.out.println(p6);

        // Display number of Point objects
        System.out.println();
        System.out.println("Number of Point objects created: "
                + Point.getNumberOfPoints());
    }
}
