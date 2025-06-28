package ex_26_Object;

public class Lab225_Generic {
    public static void main(String[] args) {
        temp(3,4);
        temp_sum(4,7);
    }

    static  <T> T temp(T a , T b){
        System.out.println(a+" "+ b);
        return null;
    }
    static  <S> S temp_sum(S a , S b){
        return null;
    }
}
