package ex_21_Oops_Encapsulation.super_Abstraction;

public class Lab186_AC {
    public static void main(String[] args) {
       wagonR wagonR = new wagonR();
       wagonR.driver();
    }
}

class wagonR extends Engine implements Tyre, Gear{

    void driver(){
        rubberTyre();
        blackColorTyre();
        startEngine();
        changegear();
        stopEngine();
    }

    @Override
    void startEngine() {
        System.out.println("Starting the engine");
    }

    @Override
    public void rubberTyre() {
        System.out.println("Rubber Tyre");
    }

    @Override
    public void blackColorTyre() {
        System.out.println("Black Tyre");
    }

    @Override
    public void changegear() {
        System.out.println("Change Gear");
    }
}

abstract class Engine{
    abstract void startEngine();
    void stopEngine(){
        System.out.println("Stop");
    }
}
interface Tyre{
    void rubberTyre();
    void blackColorTyre();
    // JDK 11 ->  This feature
    default void burnTheTyre(){
        System.out.println("By using default, we can create complete fun in interface");
    }
    static void m1(){
        System.out.println("Static functions are also added");
    }
}

interface Gear{
    void changegear();
}
