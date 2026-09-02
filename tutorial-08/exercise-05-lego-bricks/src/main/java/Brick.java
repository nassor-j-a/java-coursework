package main.java;

// Exercise 9-5 Lego Bricks

public class Brick {

    static int nextSerial = 0;

    int serial;
    Color color;

    public Brick() {
        this.serial = nextSerial++;
    }

    public Brick(Color color) {
        this();
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void display() {
        System.out.println("Brick " + serial + " (" + color.getName() + ")");
    }
}
