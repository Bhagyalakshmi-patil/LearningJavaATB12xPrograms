package ex_27_Collection_Framework.MAP;

import java.util.Enumeration;
import java.util.Hashtable;

public class Lab249_HashTable {
    public static void main(String[] args) {
        //Map - K V , Null value allowed
        //Hashtable - Synchronized, slow and legacy class - Thread safe
        // Null value is also not allowed , key also

        Hashtable<Integer, String> ht1 = new Hashtable<>();
        ht1.put(1, "one");
        ht1.put(2, "two");
        ht1.put(3, "three");
        System.out.println(ht1);

        // Iterate the hashtable using Enumeration - keys
        Enumeration<Integer> e = ht1.keys();
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }

        for (Integer key : ht1.keySet()) {
            String value = ht1.get(key);
            System.out.println(value);
        }

    }
}
