package ex_27_Collection_Framework;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Lab237_LL_Iteration {
    public static void main(String[] args) {
        List<String> l = new LinkedList<>();
        l.add("Bhagya");
        l.add("Sanjana");
        l.add("Smitha");
        l.add("Chethana");
        l.add("Manasvi");

        System.out.println(l);

        for(String ll : l){
            System.out.println(ll);
        }

        for(Integer i = 0; i < l.size(); i++){
            System.out.println(l.get(i));
        }

        Iterator iterator = l.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
