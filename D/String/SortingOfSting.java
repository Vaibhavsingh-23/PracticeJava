import java.util.*;
	class SortingOfSting{
		public static void main(String[] args){
			String[] str = {"ram","shyam","kishan","dhruv"};
			for(int i = 0 ; i < str.length ;i++){
				for(int j = i+1 ; j<str.length ; j++ ){
					if(str[i].compareTo(str[j])>0){
						String temp = str[i];
						str[i]=str[j];
						str[j]=temp;
					}
				}
			}
			for(String i : str){
				System.out.println(i);
			}
		}
	}