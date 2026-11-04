package main.java.tutorial13.exercise06invaliddowncasting;

//package tutorial13.exercise06invaliddowncasting;

class Animal {
    void sound() {
    }
}

class Dog extends Animal {
    void bark() {
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a = new Animal();

        ((Dog) a).bark();
    }
}
