package Theory.Final;

class ABC{
    // final method
    final void show(){
        System.out.println("Parent Show()");
    }
}

// final class i.e cannot extends
final class xyz{
    
}
public class Prog_Final extends ABC {
    final int a=10;     //final variable i.e constant

    // void change(){
    //     a=20;
    // }

    // void show() {
    //     System.out.println("Parent Show()");
    // }

    public static void main(String[] args) {
        try {
            // new Prog_Final().change();  // C.T error
            // new Prog_Final().show();    // C.T error
            
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e);
        }
    }
    
}
