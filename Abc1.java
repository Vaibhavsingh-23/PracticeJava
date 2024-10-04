class Test
{
	void show()
	{
	System.out.println("1");
	}
}
 
class Abc1 extends Test 
{
	void show()
	{
	System.out.println("2");
	}
   
public static void main(String[] args){
	Abc1 t=new Abc1();
	t.show();
	

        }
}