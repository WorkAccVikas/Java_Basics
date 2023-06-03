package Theory.IO;

import java.io.Console;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class FileOutput_Input {

    public static void main(String[] args) {
        try {

            // // FileOutuputStream
            // FileOutputStream out=new FileOutputStream("D:\\MY CODE\\Java\\Program\\Theory\\IO\\a.txt");
            // String s="java";
            // byte[] b=s.getBytes();
            // out.write(b);
            // out.close();
            
            // FileInputStream
            FileInputStream in=new FileInputStream("D:\\MY CODE\\Java\\Program\\Theory\\IO\\a.txt");
            int i=0;
            while((i=in.read())!=-1){
                System.out.println((char)i);
            }
            in.close();


            System.out.println("Success");



            // // Input from console
            // Console c=System.console();
            // String s1=c.readLine();
            // System.out.println("value = "+s1);
            
            // // Scanner
            // Scanner sc=new Scanner(System.in);
            // String s2=sc.nextLine();
            // System.out.println("value = "+s2);


        } catch (Exception e) {
            //TODO: handle exception
            System.out.println(e);
        }
    }
    
}
