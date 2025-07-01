package Task31st_May;

import java.util.Scanner;

public class ReverseString_without_InbuiltFun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the word");
        if(scanner.hasNextInt()){
            System.out.println("Enter the letters only");
            return;
        }
        String str = scanner.next();
        String str1 = "";
        for (int i = str.length() - 1 ; i >= 0 ; i--){
            str1 +=  str.charAt(i);
        }
        System.out.println(str1);
    }
}
