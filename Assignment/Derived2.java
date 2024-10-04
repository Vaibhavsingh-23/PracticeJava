class Base
{
	String name;
	Base(){
	this("");
	System.out.println("No. argument constructor of "+"base class");
	}
	static
	{
	System.out.println("base class static block");
	}
	{
	System.out.println("base class instance block");
	}
	Base(String name){
	System.out.println("Calling parameterized construtor" +"of base");
	}
}
class Derived2 extends Base{
	Derived2()
	{
	super();
	System.out.println("No. argument constructor of " + "of derived");
	}
	
	Derived2(String name)
	{
	this();
	System.out.println("Calling parameterized" +"constructor of derived");
	}
	static
	{
	System.out.println("derived class static block");
	}
	
	{
	System.out.println("derived class instance block");
	}
	public static void main(String[] args)
	{
	Derived2 obj1 = new Derived2("test");
	}

}