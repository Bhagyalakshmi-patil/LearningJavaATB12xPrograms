package ex_21_Oops_Encapsulation.super_Abstraction;

public class Lab189_MultipeInheritance {
    public static void main(String[] args) {
        child1 child1 = new child1();
        child1.money();
    }

}

class child1 implements Father1, Mother1{

    @Override
    public void money() {
        System.out.println("money from child1 ");
    }

    @Override
    public void m1() {
        System.out.println("m1");

    }

    @Override
    public void f1() {
        System.out.println("f1");
    }
// Same name default functions are used in 2 interfaces so it should call any one by declaring in child class
    @Override
    public void df() {
        Father1.super.df();
        Mother1.super.df();
    }
}

interface Father1{
    void money();
    void f1();
    default void df(){
        System.out.println("This is only allowed f1");
    }
}
interface Mother1{
    void money();
    void m1();
    default void df(){
        System.out.println("This is only allowed m1");
    }
}
