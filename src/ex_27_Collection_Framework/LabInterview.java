package ex_27_Collection_Framework;

import java.util.ArrayList;
import java.util.Collections;

public class LabInterview {
    public static void main(String[] args) {
        // 1 2 3 4   ->  24, 18, 12, 6

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        System.out.println(arrayList);

        Collections.sort(arrayList,Collections.reverseOrder());

        for (Integer a : arrayList){
            System.out.println(a*6);
        }
    }
}
