package Task6_25thMay;

import java.util.Scanner;

public class Reverse_String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the word");
        String str = scanner.next();
        String str1 = "";
        for (int i = str.length() - 1 ; i >= 0 ; i--){
            str1 +=  str.charAt(i);
        }
        System.out.println(str1);
    }
}
