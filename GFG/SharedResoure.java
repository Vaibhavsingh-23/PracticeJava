public class SharedResoure{
    private int data;
    private boolean hasData;
    public void produce(int value){
        while (hasData) {
            try {
                wait();
            } catch (Exception e) {
            }    
        }
        data=value;
        System.out.println(data);
        hasData= true;
        notify();
    }
    public int consume(){
        while (!hasData) {
            try {
                wait();
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
        hasdata = false;
        System.out.println(data);
        notify();
        return data;
    }
}
class Producer implements Runnable{
    private SharedResource = resource;
    public Producer(SharedResource resource){
        this.resource;
    }
    void run(){
        for(int i=0;i<5;i++){
            resource.produce(i);
        }
    }
}
class Consumer implements Runnable{
    private SharedResource = resource;
    public consume(SharedResource resource){
        this.resource;
    }
    void run(){
        for(int i=0;i<5;i++){
            int value = resource.consume();
        }
    }
}
class ThreadCommunication{
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();
        Thread pt = new Thread(new Producer(resource));
        Thread ct = new Thread(new Consumer(resource));
        pt.start();
        ct.start();
    }
}