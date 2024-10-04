class AddTwoNumbers {
    public static void main(String[] args) {
        // Parse the command-line arguments from String to integers
        int num1 = Integer.parseInt(args[0]); // First argument as the first number
        int num2 = Integer.parseInt(args[1]); // Second argument as the second number

        // Add the two numbers
        int sum = num1 + num2;

        // Print the result
        System.out.println(sum);
    }
}