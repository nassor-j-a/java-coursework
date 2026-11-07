package main.java.tutorial13.exercise10constructorpolymorphism;

public class Main {
    class Animal {

        Animal() {
            sound();
        }

        void sound() {
            System.out.println("Animal sound");
        }
    }

    class Dog extends Animal {

        String message = "Woof";

        @Override
        void sound() {
            System.out.println(message);
        }
    }
}
