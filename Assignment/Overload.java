class Overloaddemo{
	void test(){
	System.out.println("No parameter");
	}
	void test(int a , int b){
	System.out.println("a & b" + a + "_" +b);
	}
	void test(double a){
	System.out.println("Inside test (double) a :" + a);
	}	
}

class Overload{
public static void main(String[] args){
	Overloaddemo obj = new Overloaddemo();
	int i = 88;

	obj.test();
	obj.test(10,20);
	obj.test(i);
	obj.test(123.2);
    }
}
