class Test11 extends Exception{
public Test11(String message) {
        super(message);}
}
class ExceptionQ2{
	public static void main(String[] args){
	try{ 
	throw new Test11("abcdefghijklmnopqrstuvwwxyz");
	}
	catch(Test11 t){
	System.out.println(t.toString());
	//t.printStackTrace();
	}
	finally{
	System.out.println("Inside finally block");
	}
    }
}