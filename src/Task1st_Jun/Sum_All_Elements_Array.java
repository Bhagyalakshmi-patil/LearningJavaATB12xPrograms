package Task1st_Jun;

public class Sum_All_Elements_Array {
    public static void main(String[] args) {
        int[] num = {100,200,300,899,23,9};
        int sum = 0;
        for(int i = 0; i <= num.length-1; i++){
            sum += num[i];
        }
        System.out.println(sum);
    }
}
