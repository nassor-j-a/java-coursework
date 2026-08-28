package main.java;

public class Triangle {

    // Three points representing the vertices
    private Point p1;
    private Point p2;
    private Point p3;

    // Class variable
    private static int numberOfTriangles = 0;

    // Default constructor
    public Triangle() {
        this.p1 = new Point();
        this.p2 = new Point();
        this.p3 = new Point();

        numberOfTriangles++;
    }

    // Parameterized constructor
    public Triangle(Point p1, Point p2, Point p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;

        numberOfTriangles++;
    }

    // Copy method
    public Triangle copy() {

        Point newP1 = new Point(p1.getX(), p1.getY());
        Point newP2 = new Point(p2.getX(), p2.getY());
        Point newP3 = new Point(p3.getX(), p3.getY());

        return new Triangle(newP1, newP2, newP3);
    }

    // Rotate the points
    public void rotate() {

        Point temp = p3;

        p3 = p2;
        p2 = p1;
        p1 = temp;
    }

    // toString method
    @Override
    public String toString() {

        return "Triangle: "
                + p1 + ", "
                + p2 + ", "
                + p3;
    }

    // Getter for number of triangles
    public static int getNumberOfTriangles() {

        return numberOfTriangles;
    }

    // Main method
    public static void main(String[] args) {

        // Create three points
        Point p1 = new Point(1, 2);
        Point p2 = new Point(3, 4);
        Point p3 = new Point(5, 6);

        // Create first triangle
        Triangle triangle1 = new Triangle(p1, p2, p3);

        System.out.println("Triangle 1:");
        System.out.println(triangle1);

        // Create second triangle
        Point p4 = new Point(10, 20);
        Point p5 = new Point(30, 40);
        Point p6 = new Point(50, 60);

        Triangle triangle2 = new Triangle(p4, p5, p6);

        System.out.println();
        System.out.println("Triangle 2:");
        System.out.println(triangle2);

        // Test copy
        Triangle triangle3 = triangle1.copy();

        System.out.println();
        System.out.println("Copy of Triangle 1:");
        System.out.println(triangle3);

        // Test rotate
        triangle1.rotate();

        System.out.println();
        System.out.println("Triangle 1 after rotation:");
        System.out.println(triangle1);

        // Display number of objects
        System.out.println();
        System.out.println("Number of Triangle objects created: "
                + Triangle.getNumberOfTriangles());

        System.out.println("Number of Point objects created: "
                + Point.getNumberOfPoints());
    }
}
