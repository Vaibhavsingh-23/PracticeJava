import java.util.*;
class Multiplymatrix{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of row in matrix 1");
		int r1 = sc.nextInt();
		System.out.println("Enter the number of column and row in matrix 1 and matrix 2 respectively");
		int r2 = sc.nextInt();
		
		System.out.println("Enter the number of row in matrix 2");
		int r3 = sc.nextInt();

		int[][] a=new int[r1][r2];
		int[][] b=new int[r2][r3];
		int[][] result = new int[r1][r3];
		System.out.println("enter elements");
		for(int i=0;i<r1;i++){
		
			for(int j=0;j<r2;j++){
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("enter elements");
		for(int i=0;i<r2;i++){
		
			for(int j=0;j<r3;j++){
				b[i][j]=sc.nextInt();
			}
		}

		for (int i = 0; i < r1; i++) {
            		for (int j = 0; j < r3; j++) {
                		for (int k = 0; k < r2; k++) {
                    			result[i][j] = result[i][j] + a[i][k] * b[k][j];
                		}
        	    	}
       		 }
		
		
		for(int i=0;i<r1;i++){
			for(int j=0;j<r2;j++){
			System.out.print(result[i][j] + " ");
			}
		System.out.println();

		}

			
		
 
	
	}

}