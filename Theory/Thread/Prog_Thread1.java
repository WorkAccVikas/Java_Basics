package Theory.Thread;
// anonymous class
public class Prog_Thread1 {

    public static void main(String[] args) {
         Thread t1=new Thread(){
             public void run(){
                 System.out.println("hi "+Thread.currentThread().getName());
                 System.out.println("hiiii  "+Thread.currentThread().getPriority());
             }
         };

         Thread t2 = new Thread() {
             public void run() {
                 System.out.println("bye    "+ Thread.currentThread().getName());
                 System.out.println("bye    "+ Thread.currentThread().getPriority());
             }
         };

         t1.setName("Thread 0");
         t2.setName("Thread 1");

         t1.setPriority(Thread.MIN_PRIORITY);
         t2.setPriority(Thread.MAX_PRIORITY);

         t1.start();
         t2.start();
    }
    
}

class Prog_Thread1a{
    public static void main(String[] args) {
        Runnable r1=new Runnable() {
            public void run() {
                System.out.println("hi");
            }
        };

        Runnable r2 = new Runnable() {
            public void run() {
                System.out.println("bye");
            }
        };

        Thread t1=new Thread(r1);
        Thread t2=new Thread(r2);
        t1.start();
        t2.start();
    }
}
