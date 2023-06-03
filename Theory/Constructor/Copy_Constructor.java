package Theory.Constructor;

public class Copy_Constructor {
    int id;
    String name;

    public Copy_Constructor() {

    }  

    public Copy_Constructor(int a, String b) {
        id = a;
        name = b;
    }
    

    public Copy_Constructor(Copy_Constructor ob){
        id=ob.id;
        name=ob.name;
    }
    void display() {
        System.out.println("ID = " + id + "\n Name = " + name);
    }

    public static void main(String[] args) {
       
        Copy_Constructor ob1=new Copy_Constructor(1, "aa");
        ob1.display();
        // 1st way : without constructor
        Copy_Constructor ob2=new Copy_Constructor();
        ob2.id=ob1.id;
        ob2.name=ob1.name;
        ob2.display();

        // 2nd way : with constructor
        Copy_Constructor ob3=new Copy_Constructor(ob1);
        ob3.display();
        
    }
}
