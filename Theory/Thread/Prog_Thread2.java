package Theory.Thread;

public class Prog_Thread2 implements Runnable{
    public void run(){

        for(int i=0;i<3;i++){
            try {
                Thread.sleep(1000);     //sleep()
                System.out.println("Value =     "+Thread.currentThread().getName()+"\t"+i);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

    }

    public static void main(String[] args)  {
        Thread t1=new Thread(new Prog_Thread2());
        Thread t2=new Thread(new Prog_Thread2());
        Thread t3=new Thread(new Prog_Thread2());
        t1.start();


        try{
            t1.join();      //join()
            // t1.interrupt();
        }catch(Exception e){
            System.out.println(e);
        }

        t2.start();
        t3.start();
    }
    
}
