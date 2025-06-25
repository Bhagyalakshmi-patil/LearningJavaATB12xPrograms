package ex_25_Exceptions;

import java.text.NumberFormat;

public class Lab204_Exceptions {
    public static void main(String[] args) {
        System.out.println("Start the program");
        try {
            String ip = args[0]; // java.lang.ArrayIndexOutOfBoundsException
            int a = Integer.parseInt(ip); //java.lang.NumberFormatException
            int b = 100 / a;                //java.lang.ArithmeticException

            System.out.println(b);
        }catch(NumberFormatException | ArithmeticException | ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("End the program");
        }
    }
}
