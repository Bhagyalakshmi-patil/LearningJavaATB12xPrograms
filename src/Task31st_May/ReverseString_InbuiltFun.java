package Task31st_May;

import java.util.Scanner;

public class ReverseString_InbuiltFun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the word");
        if(scanner.hasNextInt()){
            System.out.println("Enter the letters only");
            return;
        }
        String str = scanner.next();
        StringBuffer stringBuffer = new StringBuffer(str);
        stringBuffer.reverse();
        System.out.println(stringBuffer.toString());
    }
}
