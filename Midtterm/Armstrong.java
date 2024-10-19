class Armstrong{
public static void main(String[] args){
	int number =143,sum=0;
	int temp =number,count=0;
	while(number !=0){
	number %= 10;
	count++;
	}
	number= temp;
	while(temp !=0){
	int rem = number %10;
	int p=1;
	for(int i=0;i< count ; i++){
	p =p*rem;
	}
	sum = sum + p;
	number=number /10;
	}
	if(sum == number){
		System.out.println("true");	
		}
	}
}