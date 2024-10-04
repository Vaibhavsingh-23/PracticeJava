class dad{
String eyes = "black";
int age=40;
String complex = "wheatish";

}
class daughter extends dad{
  //  daughter tanu = new dad();
    //tanu.age = 20;
    //tanu.eyes = "brown";
}
class son extends daughter{
son(){
super.complex = "charcoal black";
super.age = 23;
}

void print(){
System.out.println(super.eyes+super.age+super.complex);
return;
}
public static void main(String[] args){
son s=new son();
s.print();

}
}