package Theory.Polymorphism;

class Parent_Class{
void show(){
    System.out.println("Parent Show()");
}
}
public class Method_Overriding extends Parent_Class {
    void show() {
        System.out.println("Child Show()");
        super.show();
    }
    public static void main(String[] args) {
        Method_Overriding ob1=new Method_Overriding();
        ob1.show();
    }
}
