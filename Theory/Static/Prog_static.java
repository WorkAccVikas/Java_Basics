package Theory.Static;

public class Prog_static {
    int id;
    String name;
    static String clg = "ABC"; // static variable
    static String pin;

    public Prog_static(int a, String b) {
        id = a;
        name = b;
    }

    // static method
    static void change() {
        clg = "XYZ";
    }
    
    static {
        pin = "AA";
        System.out.println("Static Block = " + pin);
    }
    
    // static method
    static void change1(String pin1) {
        pin = pin1;
    }

    void display() {
        System.out.println("ID = " + id + "\n Name = " + name + "\n College = " + clg+"\n Pin = "+pin);
    }

    public static void main(String[] args) {
        System.out.println("Main method");
        Prog_static ob1 = new Prog_static(1, "AA");
        ob1.display();
        Prog_static ob2 = new Prog_static(2, "BB");
        ob2.display();
        Prog_static.change();
        Prog_static ob3 = new Prog_static(3, "CC");
        ob3.display();
        Prog_static.change1("MM");
        Prog_static ob4 = new Prog_static(4, "DD");
        ob4.display();
        
    }
}