package tutorial13.exercise05instanceofdowncasting;

class Animal {
}

class Dog extends Animal {
    void bark() {
        System.out.println("Bark");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a = new Dog();

        if (a instanceof Dog) {
            ((Dog) a).bark();
        }
    }
}
