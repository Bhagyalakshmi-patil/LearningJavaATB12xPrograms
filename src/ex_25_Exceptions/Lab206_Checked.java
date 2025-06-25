package ex_25_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Lab206_Checked {
    public static void main(String[] args) {
        int a = 0;
        try {
            a = 10/0;
        } catch (Exception e) {
            System.out.println("Execute");
            System.out.println(e.getMessage());
        }
        System.out.println(a);

        try {
            FileInputStream fileInputStream = new FileInputStream("C://log.txt");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
