package main.java;

public class Point {

    // Tutorial 11 - Exercise 1-6: Point

    // Coordinates of the point
    private double x;
    private double y;

    // Class variable: counts the number of Point objects created
    private static int numberOfPoints = 0;

    /*
     * Default constructor.
     * Creates a point at the origin (0, 0).
     */
    public Point() {
        this(0, 0);
    }

    /*
     * Parameterized constructor.
     * Creates a point using the supplied X and Y coordinates.
     */
    public Point(double x, double y) {
        this.x = x;
        this.y = y;

        // Increase the object count whenever a Point is created
        numberOfPoints++;
    }

    /*
     * Static add method.
     * Returns a NEW point whose coordinates are the sums
     * of the coordinates of p1 and p2.
     */
    public static Point add(Point p1, Point p2) {
        return new Point(
                p1.x + p2.x,
                p1.y + p2.y
        );
    }

    /*
     * Instance add method.
     * Adds the coordinates of p to the current point.
     */
    public void add(Point p) {
        this.x += p.x;
        this.y += p.y;
    }

    /*
     * Static swap method.
     * Exchanges the X coordinates of p1 and p2,
     * and exchanges their Y coordinates.
     */
    public static void swap(Point p1, Point p2) {

        // Swap the X coordinates
        double tempX = p1.x;
        p1.x = p2.x;
        p2.x = tempX;

        // Swap the Y coordinates
        double tempY = p1.y;
        p1.y = p2.y;
        p2.y = tempY;
    }

    /*
     * Instance swap method.
     * Exchanges the coordinates of the current point
     * with those of point p.
     */
    public void swap(Point p) {

        // Swap the X coordinates
        double tempX = this.x;
        this.x = p.x;
        p.x = tempX;

        // Swap the Y coordinates
        double tempY = this.y;
        this.y = p.y;
        p.y = tempY;
    }

    /*
     * Overrides Object's toString() method.
     * Returns the point in the form (x, y).
     */
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    /*
     * Calculates the Manhattan distance between two points.
     */
    public static double distance(Point p1, Point p2) {
        return Math.abs(p1.x - p2.x)
                + Math.abs(p1.y - p2.y);
    }

    /*
     * Returns the total number of Point objects created.
     */
    public static int getNumberOfPoints() {
        return numberOfPoints;
    }

    /*
    * Returns the X coordinate.
    */
    public double getX() {
        return x;
    }

    /*
    * Returns the Y coordinate.
    */
    public double getY() {
        return y;
    }

    /*
     * Main method: tests the implementation.
     */
    public static void main(String[] args) {

        // Test the constructors
        Point p1 = new Point(2, 3);
        Point p2 = new Point(4, 5);

        System.out.println("Initial points:");
        System.out.println("p1 = " + p1);
        System.out.println("p2 = " + p2);

        // Test static add()
        Point p3 = Point.add(p1, p2);

        System.out.println("\nAfter static addition:");
        System.out.println("p3 = " + p3);
        System.out.println("p1 = " + p1);
        System.out.println("p2 = " + p2);

        // Test instance add()
        p1.add(p2);

        System.out.println("\nAfter instance addition (p1.add(p2)):");
        System.out.println("p1 = " + p1);
        System.out.println("p2 = " + p2);

        // Test static swap()
        Point p4 = new Point(10, 20);
        Point p5 = new Point(30, 40);

        System.out.println("\nBefore static swap:");
        System.out.println("p4 = " + p4);
        System.out.println("p5 = " + p5);

        Point.swap(p4, p5);

        System.out.println("After static swap:");
        System.out.println("p4 = " + p4);
        System.out.println("p5 = " + p5);

        // Test instance swap()
        Point p6 = new Point(1, 2);
        Point p7 = new Point(7, 8);

        System.out.println("\nBefore instance swap:");
        System.out.println("p6 = " + p6);
        System.out.println("p7 = " + p7);

        p6.swap(p7);

        System.out.println("After instance swap:");
        System.out.println("p6 = " + p6);
        System.out.println("p7 = " + p7);

        // Test Manhattan distance
        Point p8 = new Point(2, 3);
        Point p9 = new Point(7, 6);

        System.out.println("\nManhattan distance:");
        System.out.println("p8 = " + p8);
        System.out.println("p9 = " + p9);
        System.out.println("Distance = " + distance(p8, p9));

        // Test the default constructor
        Point origin = new Point();

        System.out.println("\nDefault constructor:");
        System.out.println("origin = " + origin);

        // Display the number of objects created
        System.out.println("\nTotal Point objects created: "
                + getNumberOfPoints());
    }
}