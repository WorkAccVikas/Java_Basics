package Theory.Inner_Classes;

public class Local_Inner_Class {
    private int a = 10;

    void display() {
        System.out.println("In display()");
        class Inner {
            void msg() {
                System.out.println("Inner class method = " + a);
            }
        }
        Inner ob = new Inner();
        ob.msg();
    }

    public static void main(String[] args) {
        Local_Inner_Class ob1 = new Local_Inner_Class();
        ob1.display();
    }
}
