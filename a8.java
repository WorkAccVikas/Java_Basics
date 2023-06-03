import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class a8 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 1, 10, 10, 10, 2, 1, 4,5, 10 };

        System.out.println("Before remove duplicate : " + Arrays.toString(arr));

        HashMap<Integer, Boolean> mp = new HashMap<>();
        System.out.println("After remove duplicate : ");
        for (int i : arr) {
            if (mp.get(i) == null) {
                System.out.print(i + " ");
            }
            mp.put(i, true);
        }

    }
}
