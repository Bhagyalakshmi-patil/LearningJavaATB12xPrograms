package Multilevel_Inheritance;

public class Lab170_multilevel {
    public static void main(String[] args) {
        Son m = new Son();
        Father f = new Father();
        GrandFather gf = new GrandFather();

        Son s1 = new Son();
       //  Son s2 = new Father();
        Father fa = new Son();  // Dynamic Dispatch
        GrandFather gf1 = new Son();
        GrandFather gf2 = new Father();
       // Son s3 = new GrandFather();

    }
}
