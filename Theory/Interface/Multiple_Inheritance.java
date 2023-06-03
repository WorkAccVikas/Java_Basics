package Theory.Interface;

interface A{
    void show();
}
interface B{
    void show();
    void display();
}
public class Multiple_Inheritance implements A,B{
    
    public void show(){
        System.out.println("Show()");
    }

    public void display() {
        System.out.println("Display()");
    }
    public static void main(String[] args) {
        Multiple_Inheritance ob1=new Multiple_Inheritance();
        ob1.show();
        ob1.display();
    }
}
