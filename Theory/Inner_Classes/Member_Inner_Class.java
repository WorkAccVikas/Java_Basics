package Theory.Inner_Classes;

public class Member_Inner_Class {

    private int i=10;

    class Inner{

        private int j=20;
        void show(){
            System.out.println("i = "+i);
            System.out.println("j = "+j);
        }

    }

    public static void main(String[] args) {

        Member_Inner_Class ob1=new Member_Inner_Class();
        System.out.println("i =// "+ob1.i);
        Member_Inner_Class.Inner ob2=ob1.new Inner();       //Member Inner class
        ob2.show();
        Member_Inner_Class.Inner ob3=new Member_Inner_Class().new Inner();
        ob3.show();
        
    }
    
}
