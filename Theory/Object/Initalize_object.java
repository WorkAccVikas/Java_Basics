package Theory.Object;

public class Initalize_object {
    int id;
    String name;

    void insert(int a, String b) {
        id = a;
        name = b;
    }

    void display() {
        System.out.println("ID = " + id + "\n Name = " + name);
    }

    public Initalize_object(int a, String b) {
        id = a;
        name = b;
    }

    public Initalize_object() {

    }

    public static void main(String[] args) {

        // 1st way: By Assign value
        Initalize_object ob1 = new Initalize_object();
        ob1.id = 1;
        ob1.name = "AA";

        System.out.println("ID = " + ob1.id + "\n Name = " + ob1.name);

        // 2nd way: By method
        Initalize_object ob2 = new Initalize_object();
        ob2.insert(2, "BB");
        ob2.display();
        // 3rd way: By Constructor
        Initalize_object ob3 = new Initalize_object(3, "CC");
        ob3.display();

    }
}
