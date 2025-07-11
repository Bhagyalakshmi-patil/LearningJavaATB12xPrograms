package Task10th_July_Polymorphism.Task5;

public class Main {
    public static void main(String[] args) {
        Utility utility = new Utility();
        int a = utility.max(1,4,5);
        System.out.println(a);
        int b = utility.max(4,6);
        System.out.println(b);
        double c = utility.max(4.6,7.8);
        System.out.println(c);
    }
}
