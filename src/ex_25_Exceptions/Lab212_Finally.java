package ex_25_Exceptions;

import java.util.Scanner;

public class Lab212_Finally {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{
            int v = scanner.nextInt();
           int  c =  10/0;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            scanner.close();
            System.out.println("I will be always executed");
        }
    }
}
