interface Java{
	public int sum(int a, int b);
}
public class Java1{
	public static void main(String[] args){
	Java j =(a,b)->a+b;
	System.out.println("Sum is " + j.sum(20,110));
	}
}
//Lambda functions with a single expression implicitly return its result.



