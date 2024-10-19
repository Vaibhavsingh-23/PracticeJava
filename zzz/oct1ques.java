class Printer {
  synchronized void print(char ch) {
    for (int i = 0; i < 26; i++) {
      if (ch == '1') {
        System.out.print(i + 1 + " ");
      } else {
        System.out.print((ch++) + " ");
      }
    }
    System.out.println();
  }
}

/*class myThread implements Runnable {
  Printer p;
  Thread t;
  char ch;

  myThread(Printer p, char ch) {
    this.t = new Thread(this);
    this.p = p;
    this.ch = ch;
    t.start();
  }
 
 public void run() {
    synchronized (p) { p.print(this.ch); }
    //p.print(ch);
  }
}*/

class oct1ques {
  public static void main(String[] args) {
    Printer p = new Printer();

	/*myThread t1= new myThread(p, 'A');
	myThread t2= new myThread(p, 'a');
	myThread t3= new myThread(p, '1');*/

   Thread t1 = new Thread(()->{
      p.print('A');
    });
    Thread t2 = new Thread(()->{
      p.print('a');
    });
    Thread t3 = new Thread(()->{
      p.print('1');
    });
 

    t1.start();
    t2.start();
    t3.start();
}
}