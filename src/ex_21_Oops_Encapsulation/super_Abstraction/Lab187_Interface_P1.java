package ex_21_Oops_Encapsulation.super_Abstraction;

public class Lab187_Interface_P1 {
    public static void main(String[] args) {
       Car1 car1 = new Car1();
       car1.drive();
    }
}

class Car1 implements  Engine1 , Brakes{
    void drive(){
        startEngine();
        stopEngine();
        applyBreak();
    }
    @Override
    public void applyBreak() {
        System.out.println("Apply Brake");
    }

    @Override
    public void startEngine() {
        System.out.println("Start Engine");
    }

    @Override
    public void stopEngine() {
        System.out.println("Stop Engine");
    }
}

interface Brakes{
    void applyBreak();
}
interface Engine1{
    void startEngine();
    void stopEngine();

    default  void testEngine(){
        System.out.println("Concrete method complete");
    }
}
