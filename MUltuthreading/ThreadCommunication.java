class SharedResource {
    private int data;
    private boolean hasData;

    public synchronized void produce(int value) {
        while (hasData) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        data = value;
        hasData = true;
        System.out.println("Produced: " + value);
        notify();
    }

    public synchronized int consume() {
        while (!hasData){
            try{
                wait();
            }catch (InterruptedException e){
                Thread.currentThread().interrupt();
            }
        }
        hasData = false;
        System.out.println("Consumed: " + data);
        notify();
        return data;
    }
}

class Producer implements Runnable {

//These are user-defined types created by declaring a class (like SharedResource in this case).
//They don't store values directly. Instead, they store references (or addresses) to objects that are //created based on the class. For example, resource will hold a reference to an object of type //SharedResource.

    private SharedResource resource;

    public Producer(SharedResource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
//calls the produce() method on the resource object (an instance of the SharedResource class)
//The produce() method is executed inside the resource object, which is an instance of the //SharedResource class. The object resource contains the state (like data and hasData), and the //produce(i) method operates on that state to produce and store the value i.

            resource.produce(i);
        }
    }
}

class Consumer implements Runnable {
    private SharedResource resource;

    public Consumer(SharedResource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            int value = resource.consume();
        }
    }
}

public class ThreadCommunication {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

//When the line new Producer(resource) is executed inside Thread producerThread = new Thread(new //Producer(resource));, a new instance of the Producer class (i.e., a Producer object) is created.
//This means at that moment, a Producer object is created and initialized with the SharedResource //object (resource). The Producer object now has the ability to call the produce() method on the //shared resource.

        Thread producerThread = new Thread(new Producer(resource));
        Thread consumerThread = new Thread(new Consumer(resource));

        producerThread.start();
        consumerThread.start();
    }
}

/*1st Iteration:
Producer:       hasData = false
                -> Produces 0
                -> hasData = true
                -> notify() Consumer

Consumer:       Wakes up
                -> Consumes 0
                -> hasData = false
                -> notify() Producer
2nd Iteration:
Producer:       hasData = false
                -> Produces 1
                -> hasData = true
                -> notify() Consumer

Consumer:       Wakes up
                -> Consumes 1
                -> hasData = false
                -> notify() Producer
Conclusion:
The produce() method controls the flow between the producer and consumer by ensuring that the producer only produces new data when the previous data has been consumed, using the wait() and notify() mechanism for synchronization.*/