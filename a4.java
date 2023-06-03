import java.util.Arrays;

public class a4 {
    public static void main(String[] args) {
        int a[] = { 1, 1, 2, 2, 4, 5, 6, 6 };
        int j = 0;
        System.out.println("Before \n" + Arrays.toString(a));

        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] != a[i + 1]) {
                a[j] = a[i];
                j++;
            }
        }
        a[j] = a[a.length - 1];

        System.out.println("After \n");
        for (int i=0;i<j+1;i++) {
            System.out.print(a[i] + " ");
        }
    }
}
