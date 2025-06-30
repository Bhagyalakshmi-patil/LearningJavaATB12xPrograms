package ex_27_Collection_Framework.SET;

import java.util.HashSet;
import java.util.Iterator;

public class Lab242_HS {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Orange");
        set.add("Apple");
        set.add("Banana");
        System.out.println("Set elements : "+set);

        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
