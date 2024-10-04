class Ex1{
public static void main(String[] args){
 Ex1 ex = new Ex1();
 ex.method1(5);
}
void method1(int a){
System.out.println("method1");
method2();
}
void method2(){
System.out.println("method2");
method1(5);
}
}
 
