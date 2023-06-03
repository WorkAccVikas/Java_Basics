package Theory.Exception_Handling;

import java.io.IOException;

public class Prog_throw {

    public void check(int age) {
        if (age < 18) {
            // throw Arithmetic exception if not eligible to vote
            throw new ArithmeticException("Person is not eligible to vote");
        } else {
            System.out.println("Person is eligible to vote!!");
        }
    }

    public void checking() {
        try {
            m();
            int a=50/0;
            // String a=null;
            System.out.println("Value"+a);
        } catch (IOException e) {
            // TODO: handle exception
            System.out.println(e);
        }

    }

    public void m() throws IOException {

        throw new IOException("IOExcetption11");
    }

    public static void main(String[] args) {
        Prog_throw ob1 = new Prog_throw();
        ob1.check(2);               //throw

        // ob1.checking();         //throws
        System.out.println("Rest1");
    }

}
