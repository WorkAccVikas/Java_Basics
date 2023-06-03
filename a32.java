import java.util.Scanner;

public class a32 {

    String reverse = "";

    //reverse string using recurssion
    public String reverseString(String str1) {
        if (str1.length() == 1) {
            return str1;
        } else {
            reverse+=str1.charAt(str1.length()-1)+reverseString(str1.substring(0, str1.length()-1));
            return reverse;

        }   
    }

    public void StringOP(String str2){
        System.out.println("hi = "+str2);

        System.out.println("length = "+str2.length());

        System.out.println("substring = "+str2.substring(0, str2.length()-1));

        System.out.println("char at = "+str2.charAt(str2.length()-1));

    }

    // pallindrome string
    public void pallindrome(String str3){
        String rev="";
        
        int length=str3.length();
        System.out.println("length = "+length);
        for(int i=length-1;i>=0;i--){
            System.out.println("MMMM = "+i+"\t"+str3.charAt(i));
            rev=rev+str3.charAt(i);
        }
        System.out.println("String is = "+rev);
    }

    public void sum(String str4){
        int s=0;
        str4=str4.replaceAll("\\D+", "");
        System.out.println(str4);
        char c[]=str4.toCharArray();

        for(int i=0;i<c.length;i++){
            s+=Character.getNumericValue(c[i]);
        }
        System.out.println("Sum = "+s);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");

        String s1 = sc.nextLine();

        a32 ob = new a32();

        String ostring=ob.reverseString(s1);

        System.out.println("output = " +ostring );

        ob.StringOP(s1);

        ob.pallindrome(s1);

        System.out.println("Enter string with number");
        String s2=sc.nextLine();

        ob.sum(s2);

    }

}
