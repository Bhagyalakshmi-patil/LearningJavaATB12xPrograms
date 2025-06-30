package ex_27_Collection_Framework.SET;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Lab241_SET_HS_LHS_TS {
    public static void main(String[] args) {
        Set<String> hs = new HashSet<>();

        //Hashing mechanism to store the elements , no order
        //no duplicates
        hs.add("Apple");
        hs.add("Orange");
        hs.add("Watermelon");
        hs.add(null);
        System.out.println(hs);

        System.out.println("----------------------");

        Set lhs = new LinkedHashSet();
        //Linkedlist mechanism to store the element
        //order will maintain , no duplicates
        lhs.add("Dapple");
        lhs.add("apple");
        lhs.add("orange");
        lhs.add(null);
        System.out.println(lhs);
        System.out.println(lhs.isEmpty());
        System.out.println(lhs.contains("apple"));
        System.out.println(lhs.size());

        System.out.println("--------------------------");

        Set ts = new TreeSet();
        //Black and Red tree mechanism to store the element.
        //order will maintain, Natural sorting is done
        // Don't allow the different datatype and doesn't allow null
        ts.add("Dapple");
        ts.add("Apple");
        ts.add("Orange");
        ts.add("Watermelon");
      //  ts.add(123);
        // ts.add(null);
        System.out.println(ts);
    }
}
