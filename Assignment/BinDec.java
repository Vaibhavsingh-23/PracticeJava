import java.lang.Math;
class BinDec{
public static void main(String[] args){
int i=0,rem,sum=0,n=10001001;
while(n!=0){
rem=n%10;
sum=sum + rem * Math.pow(2,i);
i= i+1;
n=n/10;
}
System.out.println(sum);
}
}