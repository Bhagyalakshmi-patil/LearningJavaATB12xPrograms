package Task31st_May;

import java.util.Scanner;

public class String_Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string");
        String name = scanner.next();
        name =  name.toLowerCase();
        String name1 = "";
        for(int i = name.length()-1 ; i >= 0; i--){
            name1 = name1 + name.charAt(i);
        }

        if(name.equals(name1)){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not a Palindrome");
        }
    }
}
