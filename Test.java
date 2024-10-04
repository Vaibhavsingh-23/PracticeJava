class Test
{
	void show()
	{
	System.out.println("1");
	}
}
 
class Abc1 extends test
{
	void show()
	{
	System.out.println("2");
	}
   
public static void main(String[] args){
	Test t=new Test();
	t.show();
	
	Abc a= new Abc();
	a.show()
        }
}