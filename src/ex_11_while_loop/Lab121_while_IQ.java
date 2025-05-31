package ex_11_while_loop;

import java.util.Scanner;

public class Lab121_while_IQ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the num whose factorial you want");

        if(!scanner.hasNextInt()){
            System.out.println("Enter the int ");
        }
        int number = scanner.nextInt();
        int factorial = 1;

        if(number == 0){
            System.out.println("Factorial is "+factorial);
        }
        int i = 1;
        while(i <= number){
            factorial = factorial * i;
            i++;
        }

        System.out.println("Factorial is "+factorial);
    }
}
