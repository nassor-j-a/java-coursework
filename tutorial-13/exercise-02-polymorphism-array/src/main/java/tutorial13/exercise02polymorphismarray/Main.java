package tutorial13.exercise02polymorphismarray;

class Animal {
    Animal() {
        System.out.println("Animal created");
    }

    void sound() {
        System.out.println("Animal sound");
    }

    static void move() {
        System.out.println("Animal moves");
    }
}

class Dog extends Animal {
    Dog() {
        System.out.println("Dog created");
    }

    @Override
    void sound() {
        System.out.println("Woof");
    }

    static void move() {
        System.out.println("Dog runs");
    }

    void bark() {
        System.out.println("Bark!");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Meow!");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal[] arr = { new Animal(), new Dog(), new Cat() };

        for (Animal a : arr) {
            a.sound();
        }
    }
}