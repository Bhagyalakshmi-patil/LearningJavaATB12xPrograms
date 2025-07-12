package Task10th_July_Polymorphism.Task8;
//Task 3: Employee Role Info
//Title: Show employee roles with overridden methods
//Description:
//Create a class Employee with method role() printing “General Employee”.
//Create child classes Manager, Clerk, Tester, each overriding role() to print their specific roles.
//Call role() on each object to show how overriding helps in specialization.

public class Employee {

    public void role(){
        System.out.println("General Employee");
    }

}
