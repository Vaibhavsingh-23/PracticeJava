class Example1 {
    public void example() {
        System.out.println("This is no argument");
    }

    public static void main(String[] args) {
        // Anonymous class initialization
        Example obj = new Example() {
            // Overriding the example method
            
            public void example() {
                System.out.println("This is an overridden method from the anonymous class");
            }
        };

        obj.example(); // Output: This is an overridden method from the anonymous class
    }
}