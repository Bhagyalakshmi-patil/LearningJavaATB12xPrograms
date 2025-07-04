package Task31st_May;

import java.util.Scanner;

public class First_letter_of_word {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String ");
        String s = scanner.next();
        char s1 = s.charAt(0);
        System.out.println(s1);
    }
}
