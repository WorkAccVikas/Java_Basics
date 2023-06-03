package Theory.Wrapper_Class;

public class Wrapper {

    void auto_boxing(){
        int a = 10;

        Integer A = Integer.valueOf(a);

        Integer B = A;

        System.out.println("Value of a = " + a);
        System.out.println("Value of A = " + A);
        System.out.println("Value of B = " + B);
    }

    void un_boxing() {
        Integer a = 20;

        int A = a.intValue();

        int B = A;

        System.out.println("Value of a = " + a);
        System.out.println("Value of A = " + A);
        System.out.println("Value of B = " + B);
    }
    public static void main(String[] args) {
        System.out.println("\nAutoboxing : \n");
        new Wrapper().auto_boxing();
        System.out.println("\nUnboxing : \n");
        new Wrapper().un_boxing();
    }
    
}
