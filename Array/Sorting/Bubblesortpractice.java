class Bubblesortpractice{
	public static void main(String[] argas){
		int[] arr = {4,3,5,6,7,2,3};
		int temp;
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length-i-1;j++){
				if(arr[j]>arr[j+1]){
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					}
				}
			
				
		}
	for(int z=0;z<arr.length;z++)
			{
			System.out.print(arr[z]);
			}
		
		
	}
}