package ex_27_Collection_Framework;

import java.util.Vector;

public class Lab229_Vector {
    public static void main(String[] args) {
        Vector v = new Vector();

        v.add("Pramod");
        v.add("Amit");
        v.add("lucky");
        System.out.println(v);
        v.remove("Amit");
        System.out.println(v);
        System.out.println(v.contains("lucky"));
    }
}
