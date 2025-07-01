package Task6_25thMay;

import java.util.Scanner;

public class FrizzBuzz {
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++){
            if(i % 3 == 0 && i % 5 != 0){
                System.out.println("Frizz");
            }
            else if(i % 3 != 0 && i % 5 == 0){
                System.out.println("Buzz");
            }
            else if(i % 3 == 0 && i % 5 == 0) {
                System.out.println("FrizzBuzz");
            }
            else{
                System.out.println(i);
            }
        }
    }
}
