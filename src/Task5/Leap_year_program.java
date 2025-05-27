package Task5;

import java.util.Scanner;

public class Leap_year_program {
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
            if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                days = 31;
            } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                days = 30;
            } else {
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    days = 29;
                } else {
                    days = 28;
                }
            }
            System.out.println("Days : " + days);
        }
    }

