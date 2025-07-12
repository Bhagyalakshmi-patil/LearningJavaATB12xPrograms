package Task10th_July_Polymorphism.Task8;

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.role();
        Employee emp2 = new Manager();
        emp2.role();
        Employee emp3 = new Clerk();
        emp3.role();
        Employee emp4 = new Tester();
        emp4.role();
    }
}
