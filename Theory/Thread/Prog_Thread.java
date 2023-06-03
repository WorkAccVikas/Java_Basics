package Theory.Thread;

public class Prog_Thread extends Thread{

    public void run(){
        System.out.println("Hiiiiiiiiiiiii");
    }
    
    public static void main(String[] args) {

        // single task multiple thread
        Prog_Thread ob1=new Prog_Thread();
        ob1.start();
        Prog_Thread ob2=new Prog_Thread();
        ob2.start();
        
        // multiple task multiple thread
        A ob3=new A();
        ob3.start();
        B ob4=new B();
        ob4.start();

    }
}

class A extends Thread{
    public void run() {
        System.out.println("Hi"+getClass());
    }
}

class B extends Thread{
    public void run() {
        System.out.println("Hi"+getClass());
    }
}
