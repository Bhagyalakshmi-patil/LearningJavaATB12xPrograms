package Task2;

public class Ternary_max_Num {
    public static void main(String[] args) {
        int  n1 = 100, n2 = 10 ,n3 = 100;
        int r1 = (n1 > n2) ? (n1 > n3 ? n1 :n3) : (n2 > n3 ? n2 : n3);
        System.out.println(r1 +" is the max of 3 numbers");
    }
}
