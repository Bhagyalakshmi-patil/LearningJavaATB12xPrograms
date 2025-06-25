package ex_24_Wrapper_class;

public class Lab204_Wrapper {
    public static void main(String[] args) {
        int a = 10;
        Integer b = a; // Boxing - converting primitive int -> Integer - AutoBoxing - JVM will do it
        System.out.println(a);
        System.out.println(b.intValue());

        //Unboxing
        Integer aa = 43;
        int a1 = aa;
        System.out.println(a1);
        System.out.println(aa);
    }
}
