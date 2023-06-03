package Theory.Encapsulation;

public class Prog_Encapsulation {

    private int id;
    private String name;
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setId(int id) {
        this.id = id;
    }

    public static void main(String[] args) {
        Prog_Encapsulation ob1=new Prog_Encapsulation();
        ob1.setId(1);
        ob1.setName("Amit");
        System.out.println("ID = "+ob1.getId()+"\nName = "+ob1.getName());
    }

    
    
}
