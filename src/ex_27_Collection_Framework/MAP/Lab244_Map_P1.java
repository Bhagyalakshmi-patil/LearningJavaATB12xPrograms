package ex_27_Collection_Framework.MAP;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Lab244_Map_P1 {
    public static void main(String[] args) {
        Map<String,Object> m1 = new HashMap();
        // Map is Key - value pair
        // To add value - PUT function
        // You can also add keys as any other data type, but it is recommended to use particular type.
        m1.put("Name","Pramod");
        m1.put("RollNo", 1);
        m1.put("PhoneNo",6928373);
        System.out.println(m1);

        Map<String,Object> m2 = new LinkedHashMap<>();
        m2.put("Name","Pramod");
        m2.put("RollNo", 1);
        m2.put("PhoneNo",6928373);
        System.out.println(m2);

        Map<String,Object> m3 = new TreeMap<>();
        m3.put("Name","Pramod");
        m3.put("RollNo", 1);
        m3.put("PhoneNo",6928373);
        System.out.println(m3);
    }
}
