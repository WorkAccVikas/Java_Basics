package Theory.Thread;

// type 1 : by using Thread class
public class Prog_Thread_Create extends Thread {

    public void run() {
        System.out.println("hi = "+Thread.currentThread().getName());
        // Check Daemon Thread
        if(Thread.currentThread().isDaemon()){
            System.out.println("Yes =   " + Thread.currentThread().getName());
            System.out.println("Yes =   " + Thread.currentThread().getPriority());
        }else{
            System.out.println("No =    " + Thread.currentThread().getName());
            System.out.println("No =    " + Thread.currentThread().getPriority());
        }
    }


    public static void main(String[] args) {

        Prog_Thread_Create ob1 = new Prog_Thread_Create();
        ob1.setPriority(Thread.MAX_PRIORITY);   //set Priority
        ob1.start();
        Prog_Thread_Create ob2 = new Prog_Thread_Create();
        ob2.setDaemon(true);    //Daemon Thread
        ob2.start();

    }

}

// type 2 : by using Runnable interface
class Prog_Thread_Create1 implements Runnable {
    public void run() {
        System.out.println("hello");
    }

    public static void main(String[] args) {
        Prog_Thread_Create1 ob1 = new Prog_Thread_Create1();
        Thread t = new Thread(ob1);
        t.start();

    }
}
