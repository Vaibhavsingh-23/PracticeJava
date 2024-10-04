interface Walkable{
	void walk();
}
interface Swimmable{
	void swim();
}
class Duck implements Walkable,Swimmable{
	public void walk(){
	System.out.println("Duck is running");
	}
	public void swim(){
	
	System.out.println("Duck is swimmimg");
	}
}
public class InterfaceDemo1{
	public static void main(String[] args){
	Duck duck = new Duck();
	duck.walk();
	duck.swim();
	}
}