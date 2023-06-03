import java.util.Arrays;

public class a3 {
    public static void main(String[] args) {
        int a[] = { 1, 1, 2, 2,2, 4, 5, 6, 6 };
        int temp[] = new int[a.length];
        int j = 0;
        System.out.println("Before \n"+Arrays.toString(a));

        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] != a[i + 1]) {
                temp[j] = a[i];
                System.out.println("value ="+temp[j]);
                j++;
                System.out.println(j);
            }
        }
        temp[j] = a[a.length - 1];
        // System.out.println(j+" "+temp[j]);

        System.out.println("After \n");
        for (int i : temp) {
            System.out.print(i + " ");
        }
    }
}
