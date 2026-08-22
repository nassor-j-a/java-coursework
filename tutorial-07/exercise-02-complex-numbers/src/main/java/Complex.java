package main.java;

import java.util.Scanner;

public class Complex {

    // Instance variables
    private double real;
    private double imaginary;

    // Constructor
    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Getter for real part
    public double getReal() {
        return real;
    }

    // Getter for imaginary part
    public double getImaginary() {
        return imaginary;
    }

    // Instance method to add another complex number
    public void add(Complex cvalue) {
        this.real += cvalue.real;
        this.imaginary += cvalue.imaginary;
    }

    // Static method to add two complex numbers
    public static Complex add(Complex cvalue1, Complex cvalue2) {
        double realPart = cvalue1.real + cvalue2.real;
        double imaginaryPart = cvalue1.imaginary + cvalue2.imaginary;

        return new Complex(realPart, imaginaryPart);
    }

    // Instance method to subtract another complex number
    public void subtract(Complex cvalue) {
        this.real -= cvalue.real;
        this.imaginary -= cvalue.imaginary;
    }

    // Static method to subtract two complex numbers
    public static Complex subtract(Complex cvalue1, Complex cvalue2) {
        double realPart = cvalue1.real - cvalue2.real;
        double imaginaryPart = cvalue1.imaginary - cvalue2.imaginary;

        return new Complex(realPart, imaginaryPart);
    }

    // Display method
    public void display() {
        System.out.println(real + " + " + imaginary + "i");
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Create two complex numbers
        Complex c1 = new Complex(4.1, 3.9);
        Complex c2 = new Complex(2.0, 1.5);

        // Display original values
        System.out.println("First complex number:");
        c1.display();

        System.out.println("Second complex number:");
        c2.display();

        // Instance addition
        Complex c3 = new Complex(c1.real, c1.imaginary);
        c3.add(c2);

        System.out.println("\nAfter instance addition:");
        c3.display();

        // Static addition
        Complex c4 = Complex.add(c1, c2);

        System.out.println("\nAfter static addition:");
        c4.display();

        // Instance subtraction
        Complex c5 = new Complex(c1.real, c1.imaginary);
        c5.subtract(c2);

        System.out.println("\nAfter instance subtraction:");
        c5.display();

        // Static subtraction
        Complex c6 = Complex.subtract(c1, c2);

        System.out.println("\nAfter static subtraction:");
        c6.display();

        scanner.close();
    }
}