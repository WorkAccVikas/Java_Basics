package Theory.Object;

public class Create_object implements Cloneable {

    int id;
    String name;

    public Create_object(int a,String b){
        id=a;
        name=b;
    }

    void display(){
        System.out.println("ID = "+id+"\nName = "+name);
    }

    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
    public static void main(String[] args) {
        // 1st way : by new keyword
        Create_object ob1 = new Create_object(1,"AA");
        ob1.display();

        try {
            // 2nd way : by clone()
            Create_object ob2 = (Create_object) ob1.clone();
            ob2.display();
        } catch (Exception e) {
            e.printStackTrace();
        }
       

    }
}
