package ex_27_Collection_Framework.MAP;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lab248_Map_within_ArrayList {
    public static void main(String[] args) {
        Map<String , String> student1 = new HashMap<>();
        student1.put("name","amit");
        student1.put("rollNo","1");
        student1.put("Phone","87349");
        System.out.println(student1);

        Map<String , String> student2 = new HashMap<>();
        student2.put("name","amit");
        student2.put("rollNo","1");
        student2.put("Phone","87349");
        System.out.println(student2);

        List l = new ArrayList<>();
        l.add(student1);
        l.add(student2);
        System.out.println(l);

    }
}
