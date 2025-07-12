package Task11th_July_Access_Modifier.P4;

public class Person {
    private double salary ;

    public Person(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}
class Student extends Person{

    public Student(double salary) {
        super(salary);
    }
    public void showSalary(){
        System.out.println("Accessing private instance variable "+getSalary());
    }

    public static void main(String[] args) {
        Student st4 = new Student(467584);
        st4.showSalary();
    }
}
