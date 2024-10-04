class Parent{
	void print(){
	System.out.println("Parent class");
	}
}
class Child extends Parent{
	void print(){
	System.out.println("Child class");
	}
}
class RuntimePolymorphism {
    public static void main(String[] args) {
        // Runtime polymorphism: reference of parent, object of child
        Parent obj = new Child(); 
	// Calls the overridden method in Dog class
        obj.print();
    }
}