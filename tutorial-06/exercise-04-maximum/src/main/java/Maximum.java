package main.java;

import java.util.Scanner;

public class Maximum {

    public static int max(int x, int y) {
        if (x > y) {
            return x;
        } else {
            return y;
        }
    }

    public static double max(double x, double y) {
        if (x > y) {
            return x;
        } else {
            return y;
        }
    }

    public static String max(String x, String y) {
        if (x.compareTo(y) > 0) {
            return x;
        } else {
            return y;
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(max(1, 5));
        System.out.println(max(1.5, 5.5));
        System.out.println(max("Hello", "World"));

        scanner.close();
    }
}