package Theory.Conversion;

public class Conversion {

    public static void main(String[] args) {
        
        // int to String
        int a1=10;
        String s1=String.valueOf(a1);
        System.out.println(a1+" "+s1);
        
        // String to int
        String s2="11";
        int a2=Integer.parseInt(s2);
        System.out.println(a2+" "+s2);
    }
    
}
