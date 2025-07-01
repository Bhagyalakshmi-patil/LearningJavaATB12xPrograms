package Task31st_May;

import java.util.Scanner;

public class ReverseString_Recursive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the word");
        if (scanner.hasNextInt()) {
            System.out.println("Enter the letters only");
            return;
        }
        String str = scanner.nextLine();
        String reversed = reverse(str);
        System.out.println("Reversed String : "+reversed);
    }
        public static String reverse(String str) {
            if (str == null || str.length() <= 1) {
                return str;
            }
            return str.charAt(str.length() - 1) + reverse(str.substring(0, str.length() - 1));
        }
    }