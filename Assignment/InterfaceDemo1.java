// Step 1: Define the interfaces
interface Walkable {
    void walk();
}

interface Swimmable {
    void swim();
}

// Step 2: Implement the interfaces in a class
class Duck implements Walkable, Swimmable {
    public void walk() {
        System.out.println("Duck is walking.");
    }

    public void swim() {
        System.out.println("Duck is swimming.");
    }
}

// Step 3: Create an object of the class and call the interface methods
public class InterfaceDemo1 {
    public static void main(String[] args) {
        Duck duck = new Duck();
        duck.walk();
        duck.swim();
    }
}