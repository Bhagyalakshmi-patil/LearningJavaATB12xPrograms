package ex_13_Functions;

import java.util.Scanner;

public class Lab134_Function_Arth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       int a = readInt(scanner,"Enter the num1");
       int b = readInt(scanner,"Enter the num2");

       int r1 = sum(a,b);
        int r2 = sub(a,b);
        int r3 = mul(a,b);
        int r4 = div(a,b);
        int r5 = mod(a,b);


        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
        System.out.println(r5);

    }
    static int readInt(Scanner scanner,String Prompt){
        System.out.println(Prompt);
        if(scanner.hasNextInt()){
            return scanner.nextInt();
        }else{
            System.out.println("Enter an int only");
            System.exit(0);
            return -1;
        }
    }
    static int sum(int a , int b){
        return a+b;
    }
    static int sub(int a , int b){
        return a-b;
    }
    static int mul(int a , int b){
        return a*b;
    }
    static int div(int a , int b)throws ArithmeticException{
        if(b == 0){
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return a/b;
    }
    static int mod(int a , int b){
        return a%b;
    }

}
