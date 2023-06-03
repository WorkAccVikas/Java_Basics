package Theory.Inner_Classes;

public class Static_Nested_Class {

    static int a=10;

    static class Inner{

        static void msg(){
            System.out.println("Hi "+a);
        }
    }

    public static void main(String[] args) {
        Static_Nested_Class.Inner.msg();
    }
    
}
