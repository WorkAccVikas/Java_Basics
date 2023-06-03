package Theory.Synchronization;


// cooperation
public class Prog_Cooperation implements Runnable {
    int t = 0;

    // // with wait() & notify()
    // public void run(){
    //     synchronized(this){
    //         for(int i=1 ;i<=10;i++){
    //             t=t+100;
    //         }
    //         notify();
    //     }
    // }

    // without wait() & notify()
    public void run() {
        for (int i = 1; i <= 10; i++) {
            t = t + 100;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Prog_Cooperation ob1 = new Prog_Cooperation();
        
        // //with wait() & notify()
        // Thread t1 = new Thread(ob1);
        // t1.start();

        // synchronized (ob1) {
        //     ob1.wait();
        //     System.out.println("Total = " + ob1.t);
        // }

        //without wait() & notify()
        Thread t2 = new Thread(ob1);
        t2.start();
        System.out.println("Total = " + ob1.t);
    }
}
