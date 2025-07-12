package Task11th_July_Access_Modifier.P3;

public class Person {
    String name = "Sonu";
}
class Student extends Person{
    void display(){
        System.out.println("Accessing parent class instance variable "+super.name);
    }

    public static void main(String[] args) {
        Student st2 = new Student();
        st2.display();
    }
}
