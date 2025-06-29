package ex_27_Collection_Framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab233_ArrayList_Collections {
    public static void main(String[] args) {
        List marks = new ArrayList();
        marks.add(54);
        marks.add(76);
        marks.add(89);
        marks.add(34);

        System.out.println(marks);
        Collections.sort(marks);
        System.out.println(marks);

        Collections.sort(marks, Collections.reverseOrder());
        System.out.println(marks);
    }
}
