package Test5thJuly;

import java.util.Scanner;

public class Challenge2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer num = scanner.nextInt();
        Integer num1 = scanner.nextInt();
        Integer res = 0;
        try{
           res = num/num1;
            System.out.print("Result: "+res);
        } catch (ArithmeticException e) {
            System.out.print(e.getMessage());
        } finally {
            System.out.print(" Finally block executed");
        }
    }

}
