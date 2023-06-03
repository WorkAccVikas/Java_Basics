package Theory.Abstract_Class;

abstract class ABC {
    ABC() {
        System.out.println("Abstract Constructor");
    }

    abstract void show();

    void show1() {
        System.out.println("In show1()");

    }
}

public class Prog_Abstract extends ABC {
    void show() {
        System.out.println("method body");
    }

    public static void main(String[] args) {
        ABC ob1 = new Prog_Abstract();
        ob1.show();
        ob1.show1();
    }
}
