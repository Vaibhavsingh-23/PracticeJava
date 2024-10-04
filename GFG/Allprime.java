class Allprime
{
public static void main(String args[])
{
int n=20;
boolean prime[]= new boolean[n+1];
 
for(int i=1;i<n;i++)
prime[i]=true;
for(int p = 2;p*p<=n;p++)
{
if(prime[p]==true)
{
for(int i = p*p; i<=n; i +=p)
prime[i] = false;
}
}
for(int j=2;j<=n; j++)
{
if(prime[j]==true)
System.out.print(j +"	");
}
}
}