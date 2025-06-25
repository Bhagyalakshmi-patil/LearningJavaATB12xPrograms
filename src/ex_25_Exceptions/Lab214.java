package ex_25_Exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab214 {
    public static void main(String[] args) throws FileNotFoundException {
        FileReader f = new FileReader("C://abc.txt");
    }
}
