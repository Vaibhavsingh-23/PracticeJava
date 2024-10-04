class ThrowDemo{
static void demoproc(){
	try{
	throw new NullPointerException("demo"); //new is used to constuct instance of NullPointerException
	}
	catch(NullPointerException e){
	System.out.println("caught inside throwdemo");
	throw e;
	}
}
public static void main(String[] args){
	try{
	demoproc();
	}
	catch(NullPointerException e){
	System.out.println("Recaught : " + e);
	}
}	

}