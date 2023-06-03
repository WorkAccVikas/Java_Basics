package Theory.Polymorphism;

class Parent_Class1 {
    void show() {
        System.out.println("Parent Show()");
    }
}


public class Dynamic_Method_Dispatch extends Parent_Class1 {
    void show() {
        super.show();
        System.out.println("Child Show()");
    }

    public static void main(String[] args) {
        Parent_Class1 ob1 = new Dynamic_Method_Dispatch();
        ob1.show();
    }
}
