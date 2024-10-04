class Fibonacci{
	public static void  main(String[] args){
	int count=1,no=10;
	int first=0,second=1,next;
	while(count<=no){
	System.out.print(first+" ");
	next=first+second;
	first=second;
	second=next;
	count++;
}	
}
	
}