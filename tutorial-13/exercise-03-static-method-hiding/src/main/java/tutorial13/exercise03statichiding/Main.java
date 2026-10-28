package tutorial13.exercise03statichiding;

class Animal {
    public Animal() {
        System.out.println("Animal created");
    }

    public static void move() {
        System.out.println("Animal moves");
    }
}

class Dog extends Animal {
    public Dog() {
        System.out.println("Dog created");
    }

    public static void move() {
        System.out.println("Dog moves");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a = new Dog(); // What will be printed from constructor call?
        a.move();
    }
}
