/**
 * synchronize1
 */

 class Printer{
    public void print(char ch){
        for(int i = 0 ; i < 26; i++){
            if(ch=='1'){
                System.out.print(i+1 + " ");
            }else {
                System.out.print((ch++) + " ");
            }
        }
        System.out.println();
    }
 }

 class myThread implements Runnable{
    Thread t;
    Printer p;
    char ch;
    myThread(Printer p, char ch){
        this.p = p;
        this.ch = ch;
        this.t = new Thread(this);
        t.start();
    }
    public void run(){
        synchronized(p){
            p.print(this.ch);
        }
    }
 }
public class synchronize1 {

    public static void main(String[] args) {
        Printer p = new Printer();
        myThread t1 = new myThread(p, 'A');
        myThread t2 = new myThread(p, 'a');
        myThread t3 = new myThread(p,'1');
    }
}