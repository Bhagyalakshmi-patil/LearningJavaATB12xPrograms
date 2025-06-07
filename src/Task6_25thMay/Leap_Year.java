package Task6_25thMay;

import java.util.Scanner;

public class Leap_Year {
    public static void main(String[] args) {
        //                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the year ");
        if(!scanner.hasNextInt()){
            System.out.println("Enter the Integer only");
            return;
        }
        int year = scanner.nextInt();

        if((year % 4 == 0 && year % 100 != 0) ||(year % 400 == 0)){
            System.out.println("Leap Year");
        }else{
            System.out.println("Not leap year");
        }
    }
}
