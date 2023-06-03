package Theory.Call_By;

public class Call_By_Value {

    int s=10;

     void change(int s){
        s=s+10;
    }
    public static void main(String[] args) {

        Call_By_Value ob1=new Call_By_Value();

        System.out.println("Value of string = "+ob1.s);
        
        ob1.change(20);
        System.out.println("Value of string = "+ob1.s);

    }

}
