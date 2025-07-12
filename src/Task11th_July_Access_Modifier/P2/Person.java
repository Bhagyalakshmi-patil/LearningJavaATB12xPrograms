package Task11th_July_Access_Modifier.P2;

public class Person {
    void show(){
        System.out.println("Person : show method");
    }
}
class Student extends Person{
    @Override
    void show() {
        super.show();
        System.out.println("Student : show method");
    }

    public static void main(String[] args) {
        Student st1 = new Student();
        st1.show();
    }
}
