import java.util.Arrays;

public class a22 {
    public static void main(String[] args) {
        String s="Vikas";
        char a[]=s.toCharArray();
        System.out.println("Before : " + Arrays.toString(a));
        System.out.println("Before : " + s);

        for (int i = 0; i < a.length / 2; i++) {
            char t;
            t = a[i];
            a[i] = a[a.length - 1 - i];
            a[a.length - 1 - i] = t;
        }
        System.out.println("After reverse : " + Arrays.toString(a));
        System.out.println("After reverse : " + new String(a));

    }
}
