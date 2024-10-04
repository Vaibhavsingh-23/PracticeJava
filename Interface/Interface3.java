interface API{
	default void show(){
	System.out.println("default APPI");
	}
}
interface Interface31 extends API{
	void display();
}
interface Interface32 extends API{
	void print();
}
class Interface3 implements Interface1,Interface2{
	public void display()
	{
	System.out.println("Display from Interface1");
	}
	public void print()
	{
	System.out.println("Display from Interface2");
	}
	public static void main(String[] args){
	Interface3 d = new Interface3();
	d.show();
	d.display();
	d.print();
	}
}