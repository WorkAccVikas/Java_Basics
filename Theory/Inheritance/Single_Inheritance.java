package Theory.Inheritance;

class Parent_Class{
    int a=0;
    void show(){
        a=a+10;
        System.out.println("Show() = "+a);
    }
}

class Child_Class extends Parent_Class{
    int b=100;
    void show1(){
        b=b+100;
        System.out.println("Show1() = " + b);
        System.out.println("Show() = " + a);

    }
}

public class Single_Inheritance {

    public static void main(String[] args) {
        Child_Class ob1=new Child_Class();
        ob1.show();
        ob1.show1();
    }

    
}
