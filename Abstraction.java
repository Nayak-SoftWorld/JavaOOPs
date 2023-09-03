abstract class Animal {
    abstract void walk();

    Animal() {
        System.out.println("Created an Animal.");
    }
}

class Horse extends Animal {
    Horse() {
        System.out.println("Created a Horse.");
    }

    public void walk() {
        System.out.println("walks on 4 legs.");
    }
}

class Chicken extends Animal {
    public void walk() {
        System.out.println("walks on 2 legs.");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walk();
        // Chicken chicken = new Chicken();
        // chicken.walk();
        // Animal animal = new Animal();
        // animal.walk(); // produces error messages
    }
}
