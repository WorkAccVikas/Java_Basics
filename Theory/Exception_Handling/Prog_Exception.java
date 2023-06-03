package Theory.Exception_Handling;

public class Prog_Exception {

    public static void main(String[] args){
        try {
            int a=50/0;
            // String a=null;
            System.out.println("Value"+a);
            
        } catch (ArithmeticException e) {
            //TODO: handle exception
            System.out.println(e);
            // System.out.println(e.getMessage());
        //    e.printStackTrace();
        }catch(Exception e){
            System.out.println("Exception = "+e);
        } finally {
            System.out.println("In finally");
        }

        System.out.println("Out of try catch");
        
    }
    
}
