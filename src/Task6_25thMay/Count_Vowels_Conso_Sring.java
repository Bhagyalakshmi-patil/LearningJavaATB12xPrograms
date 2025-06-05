package Task6_25thMay;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Count_Vowels_Conso_Sring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string");
        String string = scanner.nextLine(); // nextLine reads whole line considering space also
        int vow = 0;
        int conson = 0;
       String s =  string.toLowerCase();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(Character.isLetter(ch)) {
                if (ch == 'a' || ch == 'i' || ch == 'e' || ch == 'o' || ch == 'u') {
                    vow++;
                } else {
                    conson++;
                }
            }
        }
        System.out.println("Number of Vowels : "+vow);
        System.out.println("Number of consonants : "+conson);
    }
}
