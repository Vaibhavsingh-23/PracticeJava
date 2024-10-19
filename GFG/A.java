class A{
public static void main(String[] args){
int n=10, k=2;
for(int i=0;i<(k-1);i++){
n = n/2;
if((n&1)!=0)
System.out.println("Yes");
else 
System.out.println("No");

}
}
}