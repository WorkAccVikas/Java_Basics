package Theory.Object;

public class Shallow_Copy implements Cloneable{

    int id;
    String name;
    
    Shallow_Copy(int id,String name){
        this.id=id;
        this.name=name;
    }

    void display(){
        System.out.println("ID = "+id+ "\nName = "+name);
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Shallow_Copy ob1=new Shallow_Copy(1, "Raj");
        ob1.display();
        Shallow_Copy ob2=(Shallow_Copy) ob1.clone();
        ob2.display();
    }
    
}
