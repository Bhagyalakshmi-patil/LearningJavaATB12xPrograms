package Task6_25thMay;

import java.util.Scanner;

public class Prime_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number ");

        if(!scanner.hasNextInt()){
            System.out.println("Please Enter Integer Number");
            return;
        }
        int n = scanner.nextInt();
        boolean bool = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                bool = false;
                break;
            }
        }
        if (bool) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not Prime Number");
        }
    }
}

