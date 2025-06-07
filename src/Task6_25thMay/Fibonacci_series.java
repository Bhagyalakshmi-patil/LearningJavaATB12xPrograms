package Task6_25thMay;

import java.util.Scanner;

public class Fibonacci_series {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n ");
        if(!scanner.hasNextInt()){
            System.out.println("Enter the integer only ");
            return;
        }
        int n = scanner.nextInt();
        int prev = 0;
        int curr = 1;

        System.out.print("Fibonacci series : "+prev +" "+curr+" ");
        for(int i =2 ; i < n; i++){
            int next = prev + curr;
            System.out.print(next+" ");
            prev = curr;
            curr = next;
        }
    }
}
