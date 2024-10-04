class Temp3{
	{
	System.out.println("init block");
	}
	Temp3()
	{
	//this(1);
	System.out.println("default");
	}
	Temp3(int x)
	{
	System.out.println(x);
	}
	public static void main(String[] args){
	new Temp3();
	new Temp3(10);

	}
}