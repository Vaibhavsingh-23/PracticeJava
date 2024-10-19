import java.util.Scanner; 
class Main1 {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in); 
    System.out.println("Enter uviversity name");

    String userName = myObj.nextLine();  
 System.out.println("Enter address");

    String a = myObj.nextLine();
    System.out.println(  userName +"  University " + a );  
  }
}