class SharedResoure{
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
        hasData = false;
        System.out.println(data);
        notify();
        return data;
    }
}
class producer implements Runnable{
    private SharedResource  resource;
    public producer(SharedResource resource){
        this.resource = resource;
    }
    public void run(){
        for(int i=0;i<5;i++){
            resource.produce(i);
        }
    }
}
class consumer implements Runnable{
    private SharedResource  resource;
    public consumer(SharedResource resource){
        this.resource = resource;
    }
    public void run(){
        for(int i=0;i<5;i++){
            //int value = resource.consume();
	    resource.consume();

        }
    }
}
class ThreadCommunication1{
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();
        Thread pt = new Thread(new producer(resource));
        Thread ct = new Thread(new consumer(resource));
        pt.start();
        ct.start();
    }
}