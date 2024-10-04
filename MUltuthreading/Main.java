class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + " - Running in thread " + Thread.currentThread().getName());
            try {
                Thread.sleep(1000); // Simulates some work by pausing the thread for 1 second
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread();
        thread1.start();  // This starts the new thread and calls run()
        
        // Meanwhile, the main thread is still running
        System.out.println("Main thread is running");
    }
}