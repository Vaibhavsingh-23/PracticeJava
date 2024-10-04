public class DecBin{
public static void main(String[] args){
int decimal = 68;
int binary = 0;
int multiplier =1;
while(decimal != 0){
int remainder = decimal%2;
binary = binary + remainder* multiplier;
decimal = decimal/2;
multiplier = multiplier*10;
}
System.out.println(binary);
}
}