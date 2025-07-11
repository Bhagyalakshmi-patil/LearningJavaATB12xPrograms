package Task10th_July_Polymorphism.Task2;

//Task 2: Print Data
//Title: Create a universal printer with overloading
//Description:
//Create a class Printer with multiple printData() methods to handle different data types:
//printData(String data)
//printData(int data)
//printData(float data)
//Demonstrate in the main() method how the same method name behaves differently depending on the parameter type.

public class Printer {

    public String printData(String str){
        return "Print the String";
    }
    public int printData(int DataInt){
        return DataInt;
    }
    public float printData(float DataFloat){
        return DataFloat;
    }

}
