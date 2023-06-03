import java.util.Arrays;
import java.util.HashSet;

public class a6 {
    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 4, 2, 10, 12, 12, 4, 6, 1 }; // unsorted
        // int arr[]={1,1,2,2,3,4,5,5}; //sorted
        HashSet<Integer> hs = new HashSet<>();
        System.out.println("Before : " + Arrays.toString(arr));

        for (int i : arr) {
            hs.add(i);
        }
        System.out.println("After : ");
        for (Integer integer : hs) {
            System.out.print(integer + " ");
        }
    }
}
