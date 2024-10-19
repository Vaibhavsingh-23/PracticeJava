class Gfg{
    public static void main(String[] args) {
        int sum=0;
        int N=12345;
        while (N!=0)
        {
            int rem=N%10;
           sum =sum+rem;
           N=N/10;
        }
        System.out.println(sum);
    }
}