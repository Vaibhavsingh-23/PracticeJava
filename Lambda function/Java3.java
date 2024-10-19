interface Java{
	public int sum(int a, int b);
}
public class Java3{
	public static void main(String[] args){
	Java j = new Java(){
	public int sum(int a, int b){
	return a+b;}
};
System.out.println("Sum is " + j.sum(20,10));
}
}
