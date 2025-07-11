package Task10th_July_Polymorphism.Task3;

public class Main {
    public static void main(String[] args) {
        MathOperations m1 = new MathOperations();
        int a1 = m1.multiply(10,20);
        int a2 = m1.multiply(10,40,50);
        System.out.println(a1);
        System.out.println(a2);
    }
}
