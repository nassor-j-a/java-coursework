package main.java;

public class Triangle {

    // Tutorial 11 - Exercise 1-7: Triangle

    // Three vertices of the triangle
    private Point p1;
    private Point p2;
    private Point p3;

    // Class variable shared by all Triangle objects
    private static int numberOfTriangles = 0;

    /*
     * Default constructor.
     * Creates a triangle with all three vertices at (0, 0).
     */
    public Triangle() {
        this(new Point(), new Point(), new Point());
    }

    /*
     * Parameterized constructor.
     * Initializes a triangle using three supplied points.
     */
    public Triangle(Point p1, Point p2, Point p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;

        // Count this newly created Triangle object
        numberOfTriangles++;
    }

    /*
     * Returns a new Triangle with the same coordinate values.
     *
     * Each vertex is copied into a new Point object,
     * so the new triangle does not share its Point objects
     * with the original triangle.
     */
    public Triangle copy() {

        Point newP1 = new Point(p1.getX(), p1.getY());
        Point newP2 = new Point(p2.getX(), p2.getY());
        Point newP3 = new Point(p3.getX(), p3.getY());

        return new Triangle(newP1, newP2, newP3);
    }

    /*
     * Rotates the vertices one position forward:
     * p1 receives the old p3,
     * p2 receives the old p1,
     * p3 receives the old p2.
     */
    public void rotate() {

        Point temp = p3;

        p3 = p2;
        p2 = p1;
        p1 = temp;
    }

    /*
     * Returns a string representation of the triangle.
     */
    @Override
    public String toString() {
        return "Triangle{"
                + "p1=" + p1
                + ", p2=" + p2
                + ", p3=" + p3
                + "}";
    }

    /*
     * Returns the total number of Triangle objects created.
     */
    public static int getNumberOfTriangles() {
        return numberOfTriangles;
    }

    /*
     * Main method: tests the Triangle class.
     */
    public static void main(String[] args) {

        // Step 1: Create three Point objects.
        Point a = new Point(0, 0);
        Point b = new Point(4, 0);
        Point c = new Point(2, 3);

        // Step 2: Create the first Triangle using three points.
        Triangle t1 = new Triangle(a, b, c);

        System.out.println("First triangle:");
        System.out.println(t1);

        // Step 3: Test the default constructor.
        Triangle t2 = new Triangle();

        System.out.println("\nTriangle created with the default constructor:");
        System.out.println(t2);

        // Step 4: Test copy().
        Triangle t3 = t1.copy();

        System.out.println("\nCopy of the first triangle:");
        System.out.println(t3);

        // Step 5: Rotate the first triangle.
        System.out.println("\nFirst triangle before rotation:");
        System.out.println(t1);

        t1.rotate();

        System.out.println("First triangle after rotation:");
        System.out.println(t1);

        // Step 6: Verify that rotating t1 did not change t3.
        System.out.println("\nCopied triangle after rotating the original:");
        System.out.println(t3);

        // Step 7: Display the number of objects created.
        System.out.println("\nTotal Triangle objects created: "
                + Triangle.getNumberOfTriangles());

        System.out.println("Total Point objects created: "
                + Point.getNumberOfPoints());
    }
}