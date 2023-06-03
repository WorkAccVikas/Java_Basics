package Theory.Polymorphism;

public class Method_Overloading {

    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return (a + b + c);
    }

    public String add(String a, String b) {
        return a + b;
    }

    

    public static void main(String[] args) {
        Method_Overloading ob1 = new Method_Overloading();
        System.out.println(ob1.add(10, 20));
        System.out.println(ob1.add(10, 20,30));
        System.out.println(ob1.add("Hi","How are you?"));
    }

    public void show() {
    }

}
