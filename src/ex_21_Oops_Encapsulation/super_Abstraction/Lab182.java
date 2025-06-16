package ex_21_Oops_Encapsulation.super_Abstraction;

public class Lab182 {
    public static void main(String[] args) {
        Car c1 = new Car(100);
        c1.display();
    }

}

class Vehicle{
    public int maxSpeed = 180;

    void noTest(){
        System.out.println("Empty");
    }
    Vehicle(){
        System.out.println("Default Constructor");
    }
    Vehicle(int a){
        System.out.println("Param Const");
    }
    Vehicle(int a, int b){
        System.out.println("Param Const");
    }
    // Method overloading
    void message(){
        System.out.println("No return, no argument");
    }
    void message(int a){
        System.out.println("Pc - argument");
    }
    void display(){
        System.out.println("Vehicle parent");
    }
}

class Car extends Vehicle{
    private int maxSpeed = 281;

    Car(){
        super(100);
    }
    void test(){}

    Car(int a){
        System.out.println("PC car");
    }
    // method overriding
    @Override
    void display(){
        System.out.println("Overrides car!");
        System.out.println(super.maxSpeed);
        System.out.println(this.maxSpeed);
        super.noTest();
        this.test();
    }

}
