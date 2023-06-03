package Theory.Super;

class Parent_Class {
    String color = "white";

    void display(){
        System.out.println("Parent display()");
    }

    Parent_Class(){
        System.out.println("Parent Constructor");
    }
}

public class Prog_Super extends Parent_Class {

    String color = "black";

    void show() {
        System.out.println(color);
        System.out.println(super.color); // type 1 : access parent class instance variable
    }

    void display() {
        System.out.println("Child display()");
    }

    void n(){
        System.out.println("Child n()");
        display();
        super.display();                // type 2 : access parent class method
    }

    Prog_Super(){
        super();
        System.out.println("Child Constructor");
    }

    public static void main(String[] args) {
        Prog_Super ob1 = new Prog_Super();
        ob1.show();

        ob1.n();
    }
}
