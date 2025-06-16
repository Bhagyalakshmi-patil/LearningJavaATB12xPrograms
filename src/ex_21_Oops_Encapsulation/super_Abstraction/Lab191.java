package ex_21_Oops_Encapsulation.super_Abstraction;

public class Lab191 {
    public static void main(String[] args) {
        Pramod d = new Dutta(); // Dynamic dispatch will interface
        Dutta d1 = new Dutta();
        d.display();
        System.out.println(d.a);

    }
}

class Dutta implements Pramod {
    @Override
    public void display() {
        System.out.println(a);
    }
}

interface Pramod{
    int a = 10;
    void display();
}
