package Theory.Array;

import java.util.Arrays;

public class Array1 {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3 };
        // System.out.println(Arrays.toString(a));
        // for(int i=0;i<a.length;i++) {System.out.println(a[i]);}
        // int k=0;
        for (int k : a) {
            System.out.println(k);
        }

        int[] a1 = new int[3];
        a1[0] = 1;
        a1[1] = 2;
        a1[2] = 3;
        System.out.println(Arrays.toString(a1));

        int[] a2=new int[]{10,2,22,5};
        System.out.println(Arrays.toString(a2));

        // jagged array
        int[][] arr = new int[2][];
        arr[0] = new int[] { 10, 20, 30, 40 };
        arr[1] = new int[] { 50, 60 };
        System.out.println(Arrays.toString(arr));

        // printing the data of a jagged array
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();// new line
        }

    }

}
