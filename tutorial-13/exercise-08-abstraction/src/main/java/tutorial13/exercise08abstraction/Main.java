package main.java.tutorial13.exercise08abstraction;

abstract class Animal {

    void sleep() {
        System.out.println("Animal sleeps");
    }

    abstract void sound();
}

class Cat extends Animal {

    @Override
    void sound() {
        System.out.println("Meow");
    }
}

public class Main {

    public static void main(String[] args) {

        Animal a = new Cat();

        a.sleep();
        a.sound();
    }
}
