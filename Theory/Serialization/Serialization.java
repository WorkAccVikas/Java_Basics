package Theory.Serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serialization {
    public static void main(String[] args) {
        try {
            Student s1 = new Student(11, "Amit","RJ");
            FileOutputStream fout = new FileOutputStream("D:\\MY CODE\\Java\\Program\\Theory\\IO\\a.txt");
            ObjectOutputStream out = new ObjectOutputStream(fout);
            out.writeObject(s1);
            out.flush();
            out.close();
            System.out.println("Success");
        } catch (Exception e) {
            // TODO: handle exception

            System.out.println(e);
        }
    }
    
    
}


class Deserialization{
    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("D:\\MY CODE\\Java\\Program\\Theory\\IO\\a.txt");
            ObjectInputStream in = new ObjectInputStream(fin);

            Student s2=(Student)in.readObject();

            System.out.println(s2.id+"  "+s2.name+" "+s2.clg);
            in.close();
            
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
    }
}

class Student implements Serializable{
    int id;
    String name;
    transient String clg;           //transient variable

    public Student(int id,String name,String clg){
        this.id=id;
        this.name = name;
        this.clg=clg;
    }
}
