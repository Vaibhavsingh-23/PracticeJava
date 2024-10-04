class insertionsort{

public static void main(String[] args){
int[] a= {45,25,35,65,55};
for(int i=1;i<a.length;i++)
	{
	int temp=a[i];    
	int j =i;
	while(j>0&&a[j-1]>temp)
		{
		a[j]=a[j-1];
		j=j-1;
		}    
	a[j]=temp;
	}
for(int z =0; z<a.length ;z++)
{
System.out.print(a[z]+" ");
}
}

}