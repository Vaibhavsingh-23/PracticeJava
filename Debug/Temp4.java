class Temp4{
	{
	System.out.println("init");
	}
	Temp4()
	{	
	System.out.println("default");
	}
	Temp4(int x)
	{
	//this();
	System.out.println(x);
	}
	{	
	System.out.println("second");
	}
	public static void main(String[] args){
	new Temp4();
	new Temp4(10);
	}
}