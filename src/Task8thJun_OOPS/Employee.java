package Task8thJun_OOPS;

public class Employee extends Person{
    private Double salary;
    private String role;

    public Employee(String name,int age,Double salary,String role){
        super(name,age);
        this.salary = salary;
        this.role = role;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
    public void setSalary(Double base,Double bonus) {
        this.salary = base + bonus;
    }
    public Double calculateBonus(){
        return this.salary * 0.10;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Role: "+this.role+" Salary : "+ this.salary);
    }
}
