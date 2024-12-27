class A{
static void a(){
System.out.println(5/0);
}
}
class B{
public static void main(String[] args){
A.a();
}

}