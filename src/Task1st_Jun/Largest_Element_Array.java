package Task1st_Jun;

public class Largest_Element_Array {
    public static void main(String[] args) {
        int[] num = {1,2,300,899,23,90};
        int n = 0;
        for(int i = 0; i <= num.length-1; i++){
           if(num[i] >= n) {
               n = num[i];
            }
        }
        System.out.println(n);
    }
}
