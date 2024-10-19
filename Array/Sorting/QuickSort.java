class QuickSort {

int[] arr = {64, 25, 12, 22, 11, 90, 32, 45};
int len= arr.length;
    public void quickSort(int[] arr, int l, int h) {
        if(l< h) {
            int j = partition(arr, l, h);
            quickSort(arr, l, j - 1); 
            quickSort(arr, j + 1, h);
        }
    }
    public int partition(int[] arr, int l, int h) {
        int pivot = arr[l];
        int i = l;
        int j = h + 1;
        while (i < j) {
            do {
                i++;
            } while (arr[i] <= pivot); 
            do {
                j--;
            } while (arr[j] > pivot);
            if (i < j) {
                swap(arr, i, j);      
	       }
        }
        swap(arr, l, j);       
 	 return j;   
  }
    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public void printArray() {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
         
        QuickSort qs = new QuickSort();
        qs.quickSort(qs.arr, 0, qs.len- 1);  
        System.out.println("Sorted Array:");
        qs.printArray();     }
}