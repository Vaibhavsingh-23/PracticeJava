public class Obj{
Obj(Object o){
System.out.println("hello");
}
Obj(Obj o){
System.out.println("world");
}
public static void main(String[] args){
new obj(null);
}
}