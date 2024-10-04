class Bubblesort{
public static void main(String[] args){
int[] a={10,20,30,4,50};
for(int i=0;i<a.length;i++)
{
int flag=0;
for(int j=0;j<a.length -1-i;j++)
{
if(a[j]>a[j+1])
{
int temp=a[j+1];
a[j+1]=a[j];
a[j]=temp;
flag=1;
}

}

if(flag==0){
break;
}

}
for(int z=0;z<a.length;z++)
{
System.out.print(a[z]+" ");
}
}
}