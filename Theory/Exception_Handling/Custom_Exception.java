package Theory.Exception_Handling;

import java.lang.*;

class CheckingException extends Exception{
    public CheckingException(String s){
        super(s);
    }
}

public class Custom_Exception {

    public void check(int a) throws CheckingException{
        if(a<20){

            throw new CheckingException("HI how are you?");
        }
    }
    public static void main(String[] args) throws CheckingException {
        Custom_Exception ob1=new Custom_Exception();
        ob1.check(2);
        System.out.println("rest");
    }
    
}
