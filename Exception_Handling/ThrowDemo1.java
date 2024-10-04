class ThrowDemo1{
static void demoproc(){
		throw new NullPointerException("demo");
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