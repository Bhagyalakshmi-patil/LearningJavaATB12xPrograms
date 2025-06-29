package ex_27_Collection_Framework;

import java.util.Stack;

public class Lab238_Stack {
    public static void main(String[] args) {
        //Stack
        //Last In First Out

        Stack s = new Stack<>();
        s.push("Smitha");
        s.push("Bhagyalakshmi");
        s.push("Sanjana");
        s.push("Chethana");
        s.push("Manasvi");
        System.out.println(s);

        System.out.println(s.size());
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s);
        System.out.println(s.size());
        System.out.println(s.empty());
        System.out.println(s.add("Manasvi Santosh"));
        System.out.println(s);
        s.add("Ranjitha");
        s.add("Jashwanth");
        s.push("Sumanth");   //Here push and add both are same
        System.out.println(s);

        System.out.println(s.get(0));
        System.out.println(s.get(4));

    }
}
