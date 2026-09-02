package main.java;

// Exercise 9-5 Lego Bricks

public class Bricklayer {

    public static void main(String[] args) {

        Color red = new Color("Red");
        Brick redBrick = new Brick(red);

        Color blue = new Color("Blue");
        Brick blueBrick = new Brick(blue);

        Brick yellowBrick = new Brick(new Color("Yellow"));

        Color green = red;
        green.setName("Green");
        Brick greenBrick = new Brick(green);

        Brick orangeBrick = greenBrick;
        orangeBrick.getColor().setName("Orange");

        yellowBrick.setColor(blue);

        Brick blackBrick = new Brick();

        // Part (a)
        redBrick.display();
        blueBrick.display();
        yellowBrick.display();
        greenBrick.display();
        orangeBrick.display();

        System.out.println();

        // Part (b)
        System.out.println("The blocks are "
                + (compare1(orangeBrick, greenBrick) ? "equal" : "distinct"));

        System.out.println("The blocks are "
                + (compare2(orangeBrick, greenBrick) ? "equal" : "distinct"));

        System.out.println("The blocks are "
                + (compare3(orangeBrick, greenBrick) ? "equal" : "distinct"));

        System.out.println();

        // Part (c)
        System.out.println("The blocks are "
                + (compare1(blueBrick, yellowBrick) ? "equal" : "distinct"));

        System.out.println("The blocks are "
                + (compare2(blueBrick, yellowBrick) ? "equal" : "distinct"));

        System.out.println("The blocks are "
                + (compare3(blueBrick, yellowBrick) ? "equal" : "distinct"));

        System.out.println();

        // Part (d)
        blackBrick.display();
    }

    public static boolean compare1(Brick a, Brick b) {
        return a == b;
    }

    public static boolean compare2(Brick a, Brick b) {
        return a.getColor() == b.getColor();
    }

    public static boolean compare3(Brick a, Brick b) {
        return a.getColor().getName() == b.getColor().getName();
    }
}