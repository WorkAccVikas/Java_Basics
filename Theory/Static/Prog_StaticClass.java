package Theory.Static;

public class Prog_StaticClass {

    static String s = "abc";
    String s1 = "xyz";

    static class Inner_Class {
        // non-static method
        public void mymethod() {
            System.out.println("My method = " + s);
        }

        // static method
        static void mymethod1() {
            System.out.println("My method1 = " + s);
        }
    }

    public static void main(String[] args) {
        Prog_StaticClass.Inner_Class ob1 = new Prog_StaticClass.Inner_Class();
        ob1.mymethod();

        Prog_StaticClass.Inner_Class.mymethod1();
        new Prog_StaticClass.Inner_Class().mymethod1();
    }

}
