package ex_22_Static;

public class Lab194_Static_SIB {
    public static void main(String[] args) {
        A a = new A();
    }
}
class A{
    static {
        System.out.println("Called only once when class is loaded");
        System.out.println("You can write a code reading a excel, file, database");
    }
    static int a = 10;

    static void m1(){
        System.out.println("static functions");
    }
}
