package Theory.Inheritance;

class Parent_Class1{
    void show(){
        System.out.println("Show()");
    }
}
class Child_Class1 extends Parent_Class1{
    void show1() {
        System.out.println("Show1()");
    }
}

class Child_Class2 extends Child_Class1 {
    void show2() {
        System.out.println("Show2()");
    }
}
public class Multilevel_Inheritance {
    
    public static void main(String[] args) {
        Child_Class2 ob1 = new Child_Class2();
        ob1.show2();
        ob1.show1();
        ob1.show();
    }
}
