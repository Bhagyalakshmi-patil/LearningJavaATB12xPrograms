package Task1st_Jun;

public class Smallest_Element_Array {
    public static void main(String[] args) {
        int[] num = {100,200,300,899,23,9};
        int n = Integer.MAX_VALUE;
        for(int i = 0; i <= num.length-1; i++){
            if(num[i] <= n) {
                n = num[i];
            }
        }
        System.out.println(n);
    }
}
