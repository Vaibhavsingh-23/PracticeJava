import java.util.*;

class DividingArray{
     public static void main(String[] args){
		int[] arr = new int[20];
		int[] arreven = new int[20];
		int[] arrodd = new int[20];	
		System.out.println("Enter all the 20 elements in the array");
		Scanner sc = new Scanner(System.in);
		for(int i = 0;i<20;i++){
			arr[i]=sc.nextInt();
			if(arr[i]%2==0){
				arreven[i] = sc.nextInt();
				
				}
			else{
				arrodd[i] = sc.nextInt();
				}
			
		}
	} 

}  