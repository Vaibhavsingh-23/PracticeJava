public class SleepExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Number: " + i);
            //try {
                Thread.sleep(10000); // Pause for  second (1000000 milliseconds)
            //} catch (InterruptedException e) {
             //   e.printStackTrace();
            //}
        }
        System.out.println("Finished!");
    }
}