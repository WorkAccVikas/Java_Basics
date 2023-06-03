package Theory.Synchronization;

import java.util.ArrayList;
import java.util.List;

public class Prog_PC_Problem  {

    public static void main(String[] args) {
        List<Integer> sharedList = new ArrayList<Integer>();
        Thread t1 = new Thread(new Producer(sharedList));
        Thread t2 = new Thread(new Consumer(sharedList));
        t1.start();
        t2.start();
    }

}

class Producer implements Runnable {

    List<Integer> sharedList = null;
    final int MAX_SIZE = 5;
    private int i = 0;

    public Producer(List<Integer> sharedList) {
        super();
        this.sharedList = sharedList;
    }

    public void run() {
        while (true) {
            try {
                produce(i++);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    public void produce(int i) throws InterruptedException {
        synchronized (sharedList) {
            while (sharedList.size() == MAX_SIZE) {
                System.out.println("Full");
                sharedList.wait();
            }
        }

        synchronized (sharedList) {
            System.out.println("Produce = " + i);
            sharedList.add(i);
            Thread.sleep(1000);
            sharedList.notify();
        }
    }
}

class Consumer implements Runnable {
    List<Integer> sharedList = null;

    public Consumer(List<Integer> sharedList) {
        super();
        this.sharedList = sharedList;
    }

    public void run() {
        while (true) {
            try {
                consume();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
    public void consume() throws InterruptedException{
        synchronized(sharedList){
            while(sharedList.isEmpty()){
                System.out.println("Empty");
                sharedList.wait();
            }
        }

        synchronized(sharedList){
            Thread.sleep((1000));
            System.out.println("Consume = "+sharedList.remove(0));
            sharedList.notify();
        }
    }
}
