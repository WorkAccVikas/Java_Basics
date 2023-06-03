package Theory.String;

public class String1 {

    public static void main(String[] args) {
        String s1="abc";
        String s2="abc";

        String s3=new String("abc");
        String s4=new String("abc");

        if(s1.equals(s3)){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
        if(s4==s1) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

    }
    
}
