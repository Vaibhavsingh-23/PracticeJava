public class Pattern {
    public static void main(String[] args) {
        int n = 5;  

        
        for (int i = 1; i <= n; i++) {
           
            int num = i % 2 == 0 ? 2 : 1;
            
            
            for (int j = 1; j <= i; j++) {
                if (j % 2 == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(num);
                    num += 2;                  }
            }
            System.out.println();          }
    }
}