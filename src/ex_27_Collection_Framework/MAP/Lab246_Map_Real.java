package ex_27_Collection_Framework.MAP;

import java.util.HashMap;
import java.util.Map;

public class Lab246_Map_Real {
    public static void main(String[] args) {
        Map<String,Object> student1 = new HashMap<>();
        student1.put("name","Diwakar");
        student1.put("phone","8946374");
        student1.put("address","BLR");
        student1.put("home_addr","BTM");

        System.out.println(student1);

        Map<String,Object> student2 = new HashMap<>();
        student2.put("name","neha");
        student2.put("phone","8946274");
        student2.put("address","Delhi");
        student2.put("home_addr","RG");

        System.out.println(student2);
    }
}
