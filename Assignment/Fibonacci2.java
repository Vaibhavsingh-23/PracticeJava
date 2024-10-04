import java.util.Scanner;

class Fibonacci2 {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the number of terms to print
        System.out.print("Enter the number of Fibonacci terms to display: ");
        int no = scanner.nextInt();  // Read user input

        // Initialize variables
        int count = 1;
        int first = 0, second = 1, next;

        // Loop to print Fibonacci numbers
        while (count <= no) {
            System.out.print(first + " "); // Print the current Fibonacci number

            // Update the Fibonacci sequence
            next = first + second;
            first = second;
            second = next;

            count++;
        }

        // Close the scanner object
        //scanner.close();
    }
}