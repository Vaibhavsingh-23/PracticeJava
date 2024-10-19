class Abc implements Runnable{
public void run();
}

class Lambdarunnable{
	public static void main(String[] args){	
	Abc x = (int a, int b)->(a+b);

System.out.println("sun is " + x.run());	
}
}