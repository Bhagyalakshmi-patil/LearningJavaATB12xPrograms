package ex_27_Collection_Framework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab228_ArrayList {
    public static void main(String[] args) {
        List list = new ArrayList<>();   // Default capacity of ArrayList is 10
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("3");
        list.add(4);
        list.add(true);

        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.contains("1"));
        System.out.println(list.contains(1));
        System.out.println(list.indexOf("3"));
        System.out.println(list.lastIndexOf("3"));
        System.out.println(list);

        // To iterate over the array

        for (int i = 0; i < list.size();i++){
            System.out.println(list.get(i));
        }

        for (Object o : list){
            System.out.println(o);
        }

        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
