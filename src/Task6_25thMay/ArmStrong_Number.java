package Task6_25thMay;

import java.util.Scanner;

public class ArmStrong_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number ");
        if(!scanner.hasNextInt()){
            System.out.println("Enter the integer number only");
            return;
        }
        int number = scanner.nextInt();
        int sum = 0;
        int num_of_digits = String.valueOf(number).length();
        while (number > 0){
            int digit = number% 10;
             sum += Math.pow(digit,num_of_digits);
             number /= 10;
        }
        if(number == sum){
            System.out.println("Entered number is ArmStrong number");
        }else{
            System.out.println("Entered number is not an ArmStrong number");
        }

    }
}
