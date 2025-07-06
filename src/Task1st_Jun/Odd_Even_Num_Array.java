package Task1st_Jun;

public class Odd_Even_Num_Array {
    public static void main(String[] args) {
        int[] num = {100,200,300,899,23,9};
        for(int i = 0; i <= num.length-1; i++) {
            if (num[i] % 2 == 0) {
                System.out.println("Even Number : " + num[i]);
            } else {
                System.out.println("Odd Number : " + num[i]);
            }
        }
    }
}
