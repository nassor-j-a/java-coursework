package tutorial13.exercise04subclassmethod;

class Animal {
    public Animal() {
        System.out.println("Animal created");
    }
}

class Dog extends Animal {
    public Dog() {
        System.out.println("Dog created");
    }

    public void bark() {
        System.out.println("Woof!");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a = new Dog();

        // Check whether the object is a Dog before casting.
        if (a instanceof Dog) {
            Dog d = (Dog) a;
            d.bark();
        }
    }
}
