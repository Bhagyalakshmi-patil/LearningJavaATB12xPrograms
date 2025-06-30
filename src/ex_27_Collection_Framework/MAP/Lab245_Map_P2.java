package ex_27_Collection_Framework.MAP;

import java.util.HashMap;
import java.util.Map;

public class Lab245_Map_P2 {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("id",1);
        map.put("id",2);  // When duplicate keys are entered , the latest one will be printed in console
        System.out.println(map);
        map.put("id2",3);
        map.put("id4",null); // null value is allowed
        map.put(null,12);    // null key is allowed only one time
        map.put(null,19);     // when 2 null keys are entered , latest one will be printed in console
        System.out.println(map);

        System.out.println(map.size());
        System.out.println(map.isEmpty());
        System.out.println(map.containsKey("id2"));
        System.out.println(map.containsValue(99));
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.get("id2"));
    }
}
