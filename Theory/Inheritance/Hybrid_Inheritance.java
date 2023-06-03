package Theory.Inheritance;

class Parent_Class2 {
    void show() {
        System.out.println("Show()");
    }
}

class Child_Class3 extends Parent_Class2 {
    void show1() {
        System.out.println("Show1()");
    }
}

class Child_Class4 extends Parent_Class2 {
    void show2() {
        System.out.println("Show2()");
    }
}

public class Hybrid_Inheritance {

    public static void main(String[] args) {
        Child_Class4 ob1 = new Child_Class4();
        ob1.show2();
        ob1.show();
    }
}
