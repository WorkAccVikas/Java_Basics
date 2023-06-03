package Theory.Thread;

public class Prog_Thread3 implements Runnable {
    Thread t;

    Prog_Thread3() {
        t = new Thread(this);
        System.out.println("Executeing =    " + t.getName());

        t.start();
        // interrupt the threads
        if (!t.interrupted())

        {
            t.interrupt();
        }

        // block until other threads finish
        try {
            t.join();
        } catch (InterruptedException e) {
        }
    }

    public void run() {
        try {
            while (true) {
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.print(t.getName() + " interrupted:");
            System.out.println(e.toString());
        }
    }

    public static void main(String[] args) {
        Prog_Thread3 ob1 = new Prog_Thread3();
        Prog_Thread3 ob2 = new Prog_Thread3();

    }

}
