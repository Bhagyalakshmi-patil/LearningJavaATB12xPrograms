package Task6_25thMay;

import java.util.Scanner;

public class Reverse_Num {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the num to reverse : ");
        if(!scanner.hasNextInt()){
            System.out.println("Enter only Integer number ");
            return;
        }
        int number = scanner.nextInt();
         int reverseNum = 0;

         boolean isNegative = number < 0;
         number = Math.abs(number);

        for(;number != 0;){
            reverseNum = reverseNum * 10;
            reverseNum = reverseNum + number%10;
            number = number/10;
        }
        System.out.println("Reversed Number "+reverseNum);
    }
}
