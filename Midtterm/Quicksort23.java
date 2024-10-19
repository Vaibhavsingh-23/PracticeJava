
class Quicksort23{
public static void main(String[] args){
int a[] ={5,4,7,3,7,9};
int l= 0;
int h = a.length();

public int qs(int l,int h){
int p = partition(l, h); 

qs(l,p);
qs(p+1,h);
}
public void partition(int l,int h){
pivot=a[0];
do{
i++;
}while(a[i]<pivot);
do{
j--;
}while(a[j]>pivot);
if(i>j){
swap(pivot,a[j]);
return j;
}
public void swap(int pivot ,int a[j]){
int temp=0;
temp=a[i];
a[i]=a[j];
a[j]=temp;
}

}
}
}