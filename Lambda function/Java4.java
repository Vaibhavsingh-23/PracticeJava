interface Length{
	public int len( String str);
}

public class Java4{
	public static void main(String[] args){	
	Length l =(str)->{return str.length();}; 
	System.out.println("Length of string" + l.len("vaibhav"));
	}
}
