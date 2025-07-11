package Task10th_July_Polymorphism.Task1;

public class Calculator {
  //Task 1: Add Two Numbers

  //Title: Overload a method to add different types of numbers

  //Description:
  //Create a class Calculator with two overloaded methods add(int a, int b) and add(double a, double b).
  //The int version should add two integers.
  //The double version should add two decimal numbers.
  //In the main method, call both versions to demonstrate how overloading works with data types.
    public  void add(int a, int b ){
        System.out.println("Addition : "+(a+b));
    }

    public void add(double a, double b){
        System.out.println("Addition : "+(a+b));
    }

}
