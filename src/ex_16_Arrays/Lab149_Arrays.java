package ex_16_Arrays;

public class Lab149_Arrays {
    public static void main(String[] args) {
        int a = 10;
        int [] marks = {91, 90, 51, 100};
        boolean [] is_married_people = {true, false, false};

        System.out.println(marks.length);
        System.out.println(marks[0]);
        System.out.println(marks[2]); // Java does not support negative indexes

        char c = 'A';
        String name = "Pramod";
        String[] name_of_each_element = name.split("");
        System.out.println(name_of_each_element.toString());
    }
}
