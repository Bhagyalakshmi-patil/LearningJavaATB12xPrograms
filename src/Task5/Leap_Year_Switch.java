package Task5;

import java.util.Scanner;

public class Leap_Year_Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the month in Numbers: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Enter the Integer only");
            return;
        }
        int month = scanner.nextInt();
        if(month > 12 || month < 0){
            System.out.println("Enter the Integer between 1 to 12 only");
            return;
        }
        System.out.println("Enter the year in Numbers: ");
        if(!scanner.hasNextInt()){
            System.out.println("Enter the integer only");
            return;
        }
        int year = scanner.nextInt();
        if(year < 0){
            System.out.println("Enter the positive number only");
            return;
        }
        int days = 0;
        switch (month) {
            case 1, 3 ,5,7,8,10,12 :
                days = 31;
                break;
            case 4,6,9,11:
                days = 30;
                break;
            case 2 :
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    days = 29;
                } else {
                    days = 28;
                }
                break;
        }
        System.out.println("Days : " + days);
}
    }

