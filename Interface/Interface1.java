interface A{
	void method1();
	void method2();
}
interface B extends A{
	void method3();
}
class Interface1 implements B{ 

	public void method1(){
	System.out.println("Method 1" );
	}

	public void method2(){
	System.out.println("Method 2" );
	}
	
	public void method3(){
	System.out.println("Method 3" );
	}
	
	public static void main(String[] args){
	Interface1 obj = new Interface1();
	obj.method1();
	obj.method2();
	obj.method3();

	}
      

}