package Theory.Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Prog_Map {

    public static void main(String[] args) {
        
        Map<String,Integer> n=new HashMap<>();
        n.put("one", 10);
        n.put("two", 20);
        n.put("three", 30);
        System.out.println(n);

        for(Map.Entry<String,Integer> e:n.entrySet()){
            System.out.println(e);

            System.out.println(e.getKey()+" "+e.getValue());
        }

        for(String key:n.keySet()){
            System.out.println(key);
        }
        for(Integer value:n.values()){
            System.out.println(value);
        }

        System.out.println("Using Iterator");
        Set s=n.entrySet();
        Iterator it=s.iterator();
        while(it.hasNext()){
            Map.Entry e=(Map.Entry) it.next();
            System.out.println(e);
            System.out.println(e.getKey()+" "+e.getValue());
        }

    }
    
}
