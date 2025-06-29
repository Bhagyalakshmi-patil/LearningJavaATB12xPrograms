package ex_27_Collection_Framework;

import java.util.*;

public class Lab232_Nested_ArrayList {
    public static void main(String[] args) {
        List<String> fruits1 = new ArrayList<>();
        fruits1.add("apple");
        fruits1.add("guava");
        fruits1.add("orange");
        System.out.println(fruits1);

        List<String> fruits2 = new ArrayList<>();
        fruits2.add("Jackfruit");
        fruits2.add("mango");
        fruits2.add("pomogranate");
        System.out.println(fruits2);

        List<String> veg = new ArrayList<>();
        veg.add("cucumber");
        veg.add("tomato");
        veg.add("Potato");
        System.out.println(veg);

        List all_fruits_veg = new ArrayList<>();
        all_fruits_veg.add(fruits1);
        all_fruits_veg.add(fruits2);
        all_fruits_veg.add(veg);
        System.out.println(all_fruits_veg);
        System.out.println(all_fruits_veg.size());
        System.out.println(all_fruits_veg.get(0));

    }
}
