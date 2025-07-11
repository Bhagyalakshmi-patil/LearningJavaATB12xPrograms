package Task10th_July_Polymorphism.Task4;

//Task 4: Greet User
//Title: Greet users differently using overloading
//Description:
//Create a class Greeter with the following methods:
//greet() – prints "Hello!"
//greet(String name) – prints "Hello, [name]!"
//This task teaches overloading based on the number of parameters.

public class Main {
    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        String g1 = greeter.greet();
        System.out.println(g1);
        String g2 =  greeter.greet("Shwetha");
        System.out.println(g2);
    }
}
