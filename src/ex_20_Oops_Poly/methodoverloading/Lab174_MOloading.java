package ex_20_Oops_Poly.methodoverloading;

public class Lab174_MOloading {
    public static void main(String[] args) {
        MathOperations m1 = new MathOperations();
        System.out.println(m1.add(3,4));
        System.out.println(m1.add(2,6,4));
        System.out.println(m1.add(5.67,7.89));
    }
}
