package ex_11_while_loop;

import java.util.Random;
import java.util.Scanner;

public class Lab123_While_Guessing_game {
    public static void main(String[] args) {
        // Guess a number between 1 and 100
        // n = 50
        //g = 80

        // Logic building formula
        // 1 . Figure out input and output
        //2 . Figure out random logic
        //3. Write proper logic
        //4. Optimize
        //5. Edgecases
  Random random = new Random();
  int numberToGuess = random.nextInt(100)+1; // bound is always upto 99 , so we need 100 also hence adding +1
      //  System.out.println(numberToGuess);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number ");
        int guess ;
        int attempts = 0;

        while(true) {
            if(!scanner.hasNextInt()){
                System.out.println("Invalid input! please enter a number");
                scanner.next();
                continue;
            }

            guess = scanner.nextInt();
            attempts++;

            if(guess < 1 || guess > 100){
                System.out.println("Invalid number. plz enter between 1 to 100");
            }
            if (guess > numberToGuess) {
                System.out.println("Too high");
            } else if (guess < numberToGuess) {
                System.out.println("Too low");
            }else{
                System.out.println("Correct! You guessed it in "+attempts + " attempts");
                break;
            }
        }
    }
}
