import java.util.Arrays;

public class a16 {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5, 6 };

        System.out.println("Before : " + Arrays.toString(a));

        for (int i = 0; i < a.length / 2; i++) {
            int t;
            t = a[i];
            a[i] = a[a.length - 1 - i];
            a[a.length - 1 - i] = t;
        }
        System.out.println("After reverse : " + Arrays.toString(a));

    }
}
