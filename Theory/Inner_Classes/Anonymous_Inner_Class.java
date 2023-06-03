package Theory.Inner_Classes;

abstract class A {
    abstract void display();
}

public class Anonymous_Inner_Class {
    public static void main(String[] args) {

        // Anonymous Inner class
        A ob1 = new A() {
            void display() {
                System.out.println("hi");
            }
        };

        ob1.display();
    }

}
