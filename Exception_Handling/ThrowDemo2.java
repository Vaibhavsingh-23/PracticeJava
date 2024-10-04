class ThrowsDemo2{
static void throwOne() throws IllegalAccessException{
	System.out.println("caught inside throwone");
	throw new IllegalAccessException("demo"); 
}
public static void main(String[] args){
	try{
	throwOne();
	}
	catch(IllegalAccessException e){
	System.out.println("Recaught : " + e);
	}
}	

}