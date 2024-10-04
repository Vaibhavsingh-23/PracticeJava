class Exceptiontrace{
	public static void main(String[] args){
		try{
			System.out.println(6/0);	
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}