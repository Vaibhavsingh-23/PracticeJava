class Bubblesort{
	public static void main(String[] args){
	int[] a={10,20,30,4,50,1};
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<a.length-1-i;j++)
		{
			if(a[j]>a[j+1])
			{
				int temp=a[j+1];
				a[j+1]=a[j];
				a[j]=temp;
			}
		}
	}
	for(int z=0;z<a.length;z++)
	{
	System.out.print(a[z]+" ");
	}
	}
	}