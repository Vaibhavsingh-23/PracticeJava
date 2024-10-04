class Ex{
	private int roll;
	private String name;
	private String address;
    void mathod(){
	System.out.println("In Ex");
        }
    public String getName(){
	return name;
	}
    public void setName(String newName){
	this.name=newName;
	}
}
public class Gettersetter{
    public static void main(String[] args){
	Ex myobj = new Ex();
	myobj.setName("Vaibhav");
	System.out.println(myobj.getName());
        }
}
