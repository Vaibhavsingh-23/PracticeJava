import java.util.concurrent.Semaphore;

class Que {
    int item;
    static Semaphore con = new Semaphore(0);
    static Semaphore prod = new Semaphore(1);

    void get() {
        try {
            con.acquire();
        } catch (InterruptedException e) {
            System.out.println("Exception");
        }
        System.out.println("Consumed item: " + item);
        prod.release();
    }

    void put(int item) {
        try {
            prod.acquire();
        } catch (InterruptedException e) {
            System.out.println("Exception");
        }
        this.item = item;
        System.out.println("Produced item: " + item);
        con.release();
    }
}

class Producer implements Runnable {
    Que q;

    Producer(Que q) {
        this.q = q;
        new Thread(this, "Producer").start();
    }

    public void run() {
        for (int i = 0; i < 25; i++) {
            q.put(i);
        }
    }
}

class Consumer implements Runnable {
    Que q;

    Consumer(Que q) {
        this.q = q;
        new Thread(this, "Consumer").start();
    }

    public void run() {
        for (int i = 0; i < 25; i++) {
            q.get();
        }
    }
}

public class ProdConsumer {
    public static void main(String[] args) {
        Que q = new Que();
        new Consumer(q);
        new Producer(q);
    }
}