package ex_21_Oops_Encapsulation.super_Abstraction;

public class Lab185_Abstract {
    public static void main(String[] args) {
       Son son = new Son();
       son.loan50k();

      // Father father = new Father();

    }
}

class Normal{
    // Concreete class -> complete class
}

abstract class Father{
    abstract void loan50k();

}
class Son extends Father{

    @Override
    void loan50k() {
        System.out.println("Loan given");
    }
}
