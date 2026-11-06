package main.java.tutorial13.exercise09fieldhiding;

class Animal {

    String type = "Animal";

    void printType() {
        System.out.println(type);
    }
}

class Dog extends Animal {

    String type = "Dog";

    @Override
    void printType() {
        System.out.println(type);
    }
}

public class Main {

    public static void main(String[] args) {

        Animal a = new Dog();

        System.out.println(a.type);
        a.printType();
    }
}