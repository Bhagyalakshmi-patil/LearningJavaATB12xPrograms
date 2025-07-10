package Task8thJun_OOPS;

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee("John",25,50000.00,"Engineer");
        emp1.setSalary(50000.00);
        emp1.setSalary(50000.00,5000.00);
        emp1.displayInfo();

        Person p = new Employee("Jack",26,60000.00,"Doctor");
        p.displayInfo();

        Employee emp2 = new Employee("Charlie", 35, 100000.00,"Manager");
        emp2.displayInfo();
        System.out.println("Bonus: " + emp2.calculateBonus());
    }
}
