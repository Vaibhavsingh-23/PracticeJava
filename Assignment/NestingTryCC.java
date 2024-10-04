class NestingTryCC {
    public static void main(String args[]) {
        
        try {
            
            try {
               
                try {
                    int arr[] = { 1, 2, 3, 4 };
                    System.out.println(arr[10]); 
                }
               
                catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println(" try-block1*********************");
                    e.printStackTrace();
                }
                int a = 5, b = 0;
                System.out.println(a / b); // This will cause ArithmeticException
            }
            catch (ArithmeticException e) {
                System.out.println(" try-block2*********************");
                e.printStackTrace();
            }
            String name = null;
            System.out.println(name.length()); // This will cause NullPointerException
        }
               catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(" main try-block2****************");
            e.printStackTrace();
        }
        catch (Exception e) {
            System.out.println("Exception");
            System.out.println("Exception handled in main try-block***************"); 
            System.out.println(e.toString());
        }
    }
}