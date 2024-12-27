class Pattern{
	public static void main(String[] args){
		for(int i=0;i<6;i++){
			for(int j =i ; j<5 ;j++){
				System.out.print(" ");
			}
			for(int j = 0; j<=i ;j++){
				System.out.print(j);
			}
			if(i>0){
				for(int k =i-1    ;  k>=0  ;  k-- ){
				System.out.print(k);	
				}
			}

		System.out.println();
		}



		for(int i=4;i>=0;i--){
			for(int j =i ; j<5 ;j++){
				System.out.print(" ");
			}
			for(int j = 0; j<=i ;j++){
				System.out.print(j);
			}
			if(i>0){
				for(int k =i-1    ;  k>=0  ;  k-- ){
				System.out.print(k);	
				}
			}

		System.out.println();
		}

	}
}