import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class a15 {
    public static void main(String[] args) {
        // String[] names = { "Java", "JavaScript", "Python", "Java","C", "Ruby", "Java"
        // };
        int[] names = { 1, 2, 3, 4, 1, 2, 1, 5 };

        // Third solution : using Hash table data structure to find duplicates
        System.out.println("Duplicate elements from array using hash table");
        // Map<String, Integer> nameAndCount = new HashMap<>();
        Map<Integer, Integer> nameAndCount = new HashMap<>();

        // // build hash table with count
        // for (String name : names) {
        // Integer count = nameAndCount.get(name);
        // if (count == null) {
        // nameAndCount.put(name, 1);
        // } else {
        // nameAndCount.put(name, ++count);
        // }
        // }

        // // Print duplicate elements from array in Java
        // Set<Entry<String, Integer>> entrySet = nameAndCount.entrySet();
        // for (Entry<String, Integer> entry : entrySet) {

        // if (entry.getValue() > 1) {
        // System.out.println("Duplicate element from array : " + entry.getKey());
        // }
        // }

        // build hash table with count
        for (Integer name : names) {
            Integer count = nameAndCount.get(name);
            if (count == null) {
                nameAndCount.put(name, 1);
            } else {
                nameAndCount.put(name, ++count);
            }
        }

        // Print duplicate elements from array in Java
        Set<Entry<Integer, Integer>> entrySet = nameAndCount.entrySet();
        System.out.println("Occurences : ");
        for (Entry<Integer, Integer> entry : entrySet) {

                System.out.println(entry.getKey()+ " = "+ entry.getValue());
            
        }
    }
}
