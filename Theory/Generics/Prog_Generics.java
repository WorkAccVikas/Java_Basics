package Theory.Generics;

class MyGeneric<T1, T2> {
    int a;
    private T1 t1;
    private T2 t2;

    public MyGeneric(int a, T1 t1, T2 t2) {
        this.a = a;
        this.t1 = t1;
        this.t2 = t2;

    }

    public T2 getT2() {
        return t2;
    }

    public void setT2(T2 t2) {
        this.t2 = t2;
    }

    public T1 getT1() {
        return t1;
    }

    public void setT1(T1 t1) {
        this.t1 = t1;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

}

public class Prog_Generics {
    public static void main(String[] args) {
        MyGeneric<String, String> ob1 = new MyGeneric(20, "Hi", "55");
        String a = ob1.getT1();
        String b = ob1.getT2();
        int c = ob1.getA();
        System.out.println(a + " " + b + " " + c);
    }

}
