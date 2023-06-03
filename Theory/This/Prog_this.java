package Theory.This;

public class Prog_this {
    int a,b;

    // type 1: current class instance variable
    public Prog_this(int a, int b) {
        this.a = a;
        this.b = b;
    }

    void display(){
        System.out.println("a = "+a+"\nb = "+b);
    }

    // type 2: current class method
    void n(){
        System.out.println("Method n()");
        this.m();   //or m();
        // m();
    }    
    
    void m() {
         System.out.println("Method m()");
    }

    // type 3 : current class constructor
    public Prog_this() {
        this(5, 500);
    }


    // type 4 : pass as argument
    void show(int a1,int b1){
        show1(this);
        System.out.println("show() method"+" "+a1+" "+b1);
    }

    void show1(Prog_this ob){
        System.out.println("Hello"+" "+ob.a+" "+ob.b);
    }

    public static void main(String[] args) {
        Prog_this ob1=new Prog_this(1, 100);
        ob1.display();

        ob1.n();

        Prog_this ob2=new Prog_this();
        ob2.display();


        Prog_this ob3 = new Prog_this(11, 100);
        ob3.show(10,20);
    }
}
