package main.java.tutorial13.exercise07privatefinalmethods;

class Animal {

    private void privateMethod() {
        System.out.println("Animal private");
    }

    void testPrivateMethod() {
        privateMethod();
    }

    final void finalMethod() {
        System.out.println("Animal final");
    }
}

class Dog extends Animal {

    // A separate method, not an override
    private void privateMethod() {
        System.out.println("Dog private");
    }

    void testPrivateMethod() {
        privateMethod();
    }

    // finalMethod() cannot be overridden
}

public class Main {

    public static void main(String[] args) {

        Animal a = new Dog();

        a.testPrivateMethod();
        a.finalMethod();
    }
}