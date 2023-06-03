package Theory.Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Prog_ArrayList {

    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);
        list.add(0,40);
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
        System.out.println(list.get(0));
        list.remove(Integer.valueOf(10));
        System.out.println(list);
        
        List<Integer> list1=new ArrayList<>();
        list1.add(50);
        list1.add(60);
        System.out.println(list1);
        list1.addAll(list);
        System.out.println(list1);
        System.out.println(list1.size());
        System.out.println("Reverse = ");
        Collections.reverse(list1);
        System.out.println(list1);
        // travers list
        // type 1:
        System.out.println("1st way");
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }
        // type 2:
        System.out.println("2nd way");
        for (int i1 : list1) {
            System.out.println(i1);
        }
        // type 3:
        System.out.println("3rd way");
        Iterator<Integer> i2=list1.iterator();
        while(i2.hasNext()){
            System.out.println(i2.next());
        }

        // type 4:
        System.out.println("4th way");
        list1.forEach(number -> System.out.println(number));
        

    }
    
}
