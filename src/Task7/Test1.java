package Task7;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first word");
        String FirstName = scanner.next();
        System.out.println("Enter the second word");
        String LastName = scanner.next();
        // Concatenation
        String name = FirstName+" "+LastName;
        System.out.println(name);

        //Length
        int length = name.length();
        System.out.println(length);

        //Substring
        String substring = name.substring(2,5);
        System.out.println(substring);

        //Character Extract
        char a = name.charAt(6);
        System.out.println(a);
    }
}
