class ABC{
	String name;
	int no;

	ABC(String m ,int n){
	    name =m;
           no=n;
}	
	void Boy(){
	System.out.println(name  + "  "+ no);
	}
	
        public static void main(String[] args){  
  ABC x= new ABC("Vaibhav",99);
x.Boy();

  }
}	
  
