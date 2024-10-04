//Armstrong number 
class Armstrong_number{
public static void main(String[] args){
	int input=153,sum=0,rem;
	int temp = input;
	while(input!=0){
		rem = input%10;
		sum = sum + rem*rem*rem;
		input = input/10;
		}
		if(sum == temp){
			System.out.println("Given number is Armstrong ");
		}
		else{
			System.out.println("Given number is not an Armstrong ");	
		}	
	}
}