package ex_27_Collection_Framework.QUEUE;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class LabLinkedAsQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(6);
        q.add(1);
        q.add(8);

        Iterator iterator = q.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }


}
