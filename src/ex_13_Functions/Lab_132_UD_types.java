package ex_13_Functions;

import java.util.Scanner;

public class Lab_132_UD_types {
    public static void main(String[] args) {
        greet();
       String g =  greet1();
        System.out.println(g);
        greet_with_dt("Bhagya",20,50000);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name : ");
        String name = scanner.next();
        System.out.println("Enter age ");
        int age = scanner.nextInt();
        System.out.println("Enter salary ");
        double salary = scanner.nextDouble();

        greet_with_dt(name,age,salary);

       int s1 =  sum1(10,67);
        System.out.println(s1);
    }

    // Without parameter and without return type
    static void  greet(){
        System.out.println("Hi");
    }
    // Without Parameter but with return type
    static String greet1(){
        System.out.println("Hi");
        return "Hi, How r u?";
    }
    // With Parameters and without return type(more used)
    static  void greet_with_dt(String name, int age, double salary){
        System.out.println("Your name is -> "+name +"\nYour age is "+age +"\nYour salary is "+salary);
    }
    // With parameters and With return type
    static int sum1(int a , int b){
        return  a+b;
    }

}
