package ex_27_Collection_Framework.MAP;

import java.util.HashMap;
import java.util.Map;

public class lab247_Map_Iterate {
    public static void main(String[] args) {
        //All coding questions are done by using HashMap, HashSet, ArrayList
        Map<String ,Integer> map = new HashMap<>();
        map.put("id",1);
        map.put("id2",2);
        map.put("id3",34);
        map.put("id4",null);
        map.put("id5",null);
        map.put(null,100);
        System.out.println(map);
        System.out.println(map.size());

  // Iteration
        for (Map.Entry<String ,Integer> item: map.entrySet()){
            System.out.println(item.getKey() + "->" + item.getValue() );
        }
    }
}
