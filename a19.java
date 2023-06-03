import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class a19 {
    public static void main(String[] args) {

        int[] names = { 1, 2, 3, 4, 4, 3, 21,3 };

        // Third solution : using Hash table data structure to find duplicates
        System.out.println("Duplicate elements from array using hash table");
        Map<Integer, Integer> nameAndCount = new HashMap<>();

        // build hash table with count
        for (Integer name : names) {
            Integer count = nameAndCount.get(name);
            if (count == null) {
                nameAndCount.put(name, 1);
            } else {
                nameAndCount.put(name, ++count);
            }
        }
        int element = 0;

        int frequency = 1;
        // Print duplicate elements from array in Java
        Set<Entry<Integer, Integer>> entrySet = nameAndCount.entrySet();
        for (Entry<Integer, Integer> entry : entrySet) {

            if (entry.getValue() > frequency) {
                element = entry.getKey();

                frequency = entry.getValue();
            }
        }

        // Printing the most frequent element in array and its frequency

        if (frequency > 1) {
            System.out.println("Input Array : " + Arrays.toString(names));

            System.out.println("The most frequent element : " + element);

            System.out.println("Its frequency : " + frequency);

            System.out.println("========================");
        } else {
            System.out.println("Input Array : " + Arrays.toString(names));

            System.out.println("No frequent element. All elements are unique.");

            System.out.println("=========================");
        }
    }
}
