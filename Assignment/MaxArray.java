import java.util.Scanner;

class MaxArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int size = s.nextInt();


        int[] array = new int[size];


        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = s.nextInt();
        }

        int max = array[0];

        for (int i = 1; i < size; i++) {
            if (array[i] > max) {
                max = array[i]; 
            }
        }

        System.out.println("The maximum number in the array is: " + max);

                    }
}