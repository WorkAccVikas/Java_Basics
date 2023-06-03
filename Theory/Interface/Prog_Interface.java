package Theory.Interface;

interface ABC{
    void show();
}

public class Prog_Interface implements ABC{
    public void show(){
        System.out.println("Show()");
    }
    public static void main(String[] args) {
        ABC ob1=new Prog_Interface();
        ob1.show();;
    }
}
