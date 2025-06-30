package ex_27_Collection_Framework.SET;

import java.util.HashSet;
import java.util.Set;

public class Lab240_SET {
    public static void main(String[] args) {
        Set s = new HashSet();
        s.add("Sanju");
        s.add("sanju");
        s.add("Sanju");
        s.add("ujnas");
        System.out.println(s);
    }
}
