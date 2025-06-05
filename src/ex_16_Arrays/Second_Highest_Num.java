package ex_16_Arrays;

public class Second_Highest_Num {
    public static void main(String[] args) {
        int[] numbers = {12,45,89,23,50,99,56};
        int highest = Integer.MIN_VALUE;
        int secondHighest = 0;

        for(int number : numbers){
            if(number > highest){
                secondHighest = highest;
                highest = number;
            }else if(number > secondHighest && number != highest){
                secondHighest = number;
            }
        }
        System.out.println(secondHighest);
    }
}
