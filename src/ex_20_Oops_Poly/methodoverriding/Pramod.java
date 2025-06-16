package ex_20_Oops_Poly.methodoverriding;

public class Pramod extends Father {
    void p1(){
        System.out.println("Pramod - p1");
    }
    @Override
    void home(){
        System.out.println("Pramod - 3BHK");
    }
}
