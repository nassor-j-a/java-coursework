package main.java;

public class Point {

    private double x;
    private double y;

    private static int numberOfPoints = 0;

    public Point() {
        this.x = 0;
        this.y = 0;
        numberOfPoints++;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
        numberOfPoints++;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    public static int getNumberOfPoints() {
        return numberOfPoints;
    }
}
