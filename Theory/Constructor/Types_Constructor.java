package Theory.Constructor;

public class Types_Constructor {

    int id;
    String name;

    public Types_Constructor() {

    }

    public Types_Constructor(String b) {
        name = b;
    }

    public Types_Constructor(int a, String b) {
        id = a;
        name = b;
    }

    void display() {
        System.out.println("ID = " + id + "\n Name = " + name);
    }

    public static void main(String[] args) {
        // type 1: default constructor
        Types_Constructor ob1 = new Types_Constructor();
        ob1.display();
        // type 2: parametrized constructor
        Types_Constructor ob3 = new Types_Constructor(1, "aa");
        ob3.display();
        // constructor overloading
        Types_Constructor ob2 = new Types_Constructor("bb");
        ob2.display();
    }
}
