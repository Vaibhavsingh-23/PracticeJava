

class tech{
	public tech( Runnable r){
	System.out.println("Vaibhav");
	r.run();
	}
	}

class myc {
public  static void main(String[] args){
	tech t =() ->{
	
	 System.out.println("Running inside Runnable!");
}; 
 
} 
}
