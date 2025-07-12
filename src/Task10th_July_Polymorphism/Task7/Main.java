package Task10th_July_Polymorphism.Task7;

public class Main {
    public static void main(String[] args) {
        Vehicle veh1 = new Vehicle();
        veh1.start();
        Vehicle veh2 = new Bike();
        veh2.start();
        Vehicle veh3 = new Car();
        veh3.start();
    }
}
