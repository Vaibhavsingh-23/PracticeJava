interface API {
    default void show() {
        System.out.println("Default API");
    }
}

// Interface 2, extending API
interface Interface1 extends API {
    void display();
}

// Interface 3, extending API
interface Interface2 extends API {
    void print();
}

// Implementation class
class TestClass implements Interface1, Interface2 {
    // Overriding the abstract method from Interface1
    public void display() {
        System.out.println("Display from Interface1");
    }

    // Overriding the abstract method from Interface2
    public void print() {
        System.out.println("Print from Interface2");
    }

    public static void main(String args[]) {
        // Creating object of this class
        TestClass d = new TestClass();

        // Calling methods from both interfaces
        d.show();    // Default method from API
        d.display(); // Overridden method from Interface1
        d.print();   // Overridden method from Interface2
    }
}