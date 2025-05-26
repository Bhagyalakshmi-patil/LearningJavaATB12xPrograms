package Task4;

import java.math.BigInteger;
import java.util.Scanner;

public class Factorial_Num {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the n :");

        if(!scanner.hasNextInt()){
            System.out.println("please enter the integer ");
            return;
        }
        int n = scanner.nextInt();
        BigInteger fact = BigInteger.ONE    ;
        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers");
        } else if (n == 0) {
             fact = BigInteger.valueOf(1);
        } else if (n > Integer.MAX_VALUE) {
            System.out.println("Value is larger, can't handle");
        } else {
            for (int i = 1; i <= n; i++) {
                fact = fact.multiply(BigInteger.valueOf(i));
            }
            System.out.println(fact);
        }
    }
}
