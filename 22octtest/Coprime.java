class Coprime{


	public boolean gcd(int a,int b){
		while(b!=0){
			int temp=b;
			b=a%b;
			a=temp;
		}
		return (a==1)? true:false;
	}

	 public static void main(String[] args){
		int a = 6;
		int b = 3;
		Coprime cp= new Coprime();
		
		System.out.println(cp.gcd(a,b));	
	}
}