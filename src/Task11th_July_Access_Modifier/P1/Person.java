package Task11th_July_Access_Modifier.P1;

public class Person {

    Person(String name){
        System.out.println("Constructor "+name);
    }
}

class Student extends Person{
    Student(String name, int grade){
        super(name);
        System.out.println("Constructor with grade "+grade);
    }

    public static void main(String[] args) {
        Student st1 = new Student("Ananya",65);
    }
}
