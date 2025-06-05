package ex_16_Arrays;

public class Lab155_Array_reverse {
    public static void main(String[] args) {
        int[] numbers = {12,14,27,28};
        for(int i = numbers.length - 1; i >= 0; i--){
            System.out.println(numbers[i]);
        }
    }
}
