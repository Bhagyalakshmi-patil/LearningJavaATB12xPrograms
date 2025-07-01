package Task6_25thMay;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        if(!scanner.hasNextInt()){
            System.out.println("Enter the Integer number only");
            return;
        }
        int number = scanner.nextInt();
       if(number >= 90 && number <= 100){
           System.out.println("A");
       } else if(number >= 80 && number <= 89) {
           System.out.println("B");
       }
       else if(number >= 70 && number <= 79) {
           System.out.println("C");
       }
       else if(number >= 60 && number <= 69) {
           System.out.println("D");
       }
       else if(number >= 0 && number <= 59) {
           System.out.println("F");
       }
    }
}
