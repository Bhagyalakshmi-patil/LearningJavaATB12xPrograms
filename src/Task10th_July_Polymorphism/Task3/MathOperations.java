package Task10th_July_Polymorphism.Task3;

//Title: Multiply using overloaded methods
//Description:
//Create a class MathOperations with two multiply() methods:
//One takes two integers and returns the product
//Another takes three integers and returns their product
//This helps students understand how Java distinguishes methods based on parameter count.

public class MathOperations {

    public int multiply(int a, int b){
        return a*b;
    }
    public int multiply(int a, int b,int c){
        return a*b*c;
    }
}
