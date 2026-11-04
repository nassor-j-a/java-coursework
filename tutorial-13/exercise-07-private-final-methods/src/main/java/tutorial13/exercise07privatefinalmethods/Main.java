package main.java.tutorial13.exercise07privatefinalmethods;

class Animal {

    private void privateMethod() {
        System.out.println("Animal private");
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

    // finalMethod() cannot be overridden
}

public class Main {

    public static void main(String[] args) {

        Animal a = new Dog();

        a.finalMethod();
    }
}