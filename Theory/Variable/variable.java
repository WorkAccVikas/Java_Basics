package Theory.Variable;

public class variable {
    // instance variable
    int a;

    // static variable
    static int c = 25;

    public void setValue(int aa) {
        a = aa;
    }

    void display() {
        // local variable
        int b = 10;
        b = b + 10;
        c = c + 25;
        System.out.println("Value : " + b + " " + a + " " + c);

    }

    public static void main(String[] args) {
        System.out.println(variable.c);
        variable ob1 = new variable();
        ob1.setValue(12);
        ob1.display();
        variable ob2 = new variable();
        ob2.setValue(2);
        ob2.display();
        System.out.println(variable.c);
    }
}
