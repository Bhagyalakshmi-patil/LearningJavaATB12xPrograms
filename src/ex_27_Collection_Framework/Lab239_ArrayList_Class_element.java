package ex_27_Collection_Framework;

import java.util.ArrayList;
import java.util.List;

public class Lab239_ArrayList_Class_element {
    public static void main(String[] args) {

        Student s1 = new Student("Smitha","1");
        Student s2 = new Student("Bhagyalakshmi","2");
        Student s3 = new Student("Sanjana","3");

        List<Student> mystudents = new ArrayList<>();
        mystudents.add(s1);
        mystudents.add(s2);
        mystudents.add(s3);

        System.out.println(mystudents);
        s1.printdetails();
        s2.printdetails();
        s3.printdetails();

    }
}
