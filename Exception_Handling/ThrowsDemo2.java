class ThrowsDemo2{
static void throwOne() //throws IllegalAccessException
{
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


//in this program i was confused with handling of the exception(that why calling throwOne dont throw exception as i does not require throws or tnc )  bcz it is allready done by try n catch.
