package Task10th_July_Polymorphism.Task7;
//Task 2: Vehicle Start
//Title: Demonstrate engine start behavior using overriding
//Description:
//Create a base class Vehicle with a method start().
//Create Bike and Car classes that override the start() method:
//Bike prints "Kick start the bike"
//Car prints "Turn the key to start the car"
//This shows how polymorphism works with method overriding.

public class Vehicle {
    public void start(){
        System.out.println("Start");
    }
}
